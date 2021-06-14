package com.JavaEEClass.Work6.dao;

import com.JavaEEClass.Work6.Bean.User;
import com.JavaEEClass.Work6.Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    //查询所有用户
    public List<User> findAllUsers(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<User> users = new ArrayList<>();
        try{
            //获取连接
            connection = JDBCUtils.getConnection();
            //创建Statement对象
            statement = connection.createStatement();
            //定义SQL语句
            String sql = "select * from user";
            //根据SQL语句获取结果集
            resultSet = statement.executeQuery(sql);
            //处理结果集
            while (resultSet.next()){
                users.add(setAttr(resultSet));
            }
            return users;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    //根据Id查询用户
    public User findUserById(Long userId){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "select * from user where userId = " + userId;
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                User user = setAttr(resultSet);
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(resultSet,statement,connection);
        }
        return null;
    }

    //根据Id查询用户是否存在
    public boolean existByUserId(Long userId){
        User uncheck = findUserById(userId);
        return uncheck != null;
    }

    //根据用户名查询用户
    public User findUserByUserName(String username){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try{
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "select * from user where userName = '" + username + "'";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                User user = setAttr(resultSet);
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(resultSet,statement,connection);
        }
        return null;
    }

    //根据用户名判断用户是否存在
    public boolean existByUserName(String userName){
        User uncheck = findUserByUserName(userName);
        return uncheck != null;
    }


    //新增用户
    public boolean insert(User user){
        Connection connection = null;
        Statement statement = null;
        //判断是否用户名已存在
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "insert into user(userName,password,realName,gender,phoneNum,remarks)" +
                    "values('" + user.getUserName() + "','"
                    + user.getPassword() + "','"
                    + user.getRealName() + "','"
                    + user.getGender() + "','"
                    + user.getPhoneNum() + "','"
                    + user.getRemarks() + "')";
            int num = statement.executeUpdate(sql);
            if(num > 0){
                return true;
            }
            return false;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(statement,connection);
        }
        return false;
    }

    //修改用户信息
    public boolean updateUser(User user){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "update user set userName = '" + user.getUserName() + "',"
                    + "password = '" + user.getPassword() + "',"
                    + "realName = '" + user.getRealName() + "',"
                    + "gender = '" + user.getGender() + "',"
                    + "phoneNum = '" + user.getPhoneNum() + "',"
                    + "remarks = '" + user.getRemarks() + "'"
                    + "where userId = " + user.getUserId();
            int num = statement.executeUpdate(sql);
            if(num > 0){
                return true;
            }
            return false;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(statement,connection);
        }
        return false;
    }

    //删除用户
    public boolean deleteUser(Long userId){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();
            String sql = "delete from user where userId = " + userId;
            int num = statement.executeUpdate(sql);
            if(num > 0){
                return true;
            }
            return false;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.release(statement,connection);
        }
        return false;
    }



    private User setAttr(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getLong("userId"));
        user.setUserName(resultSet.getString("userName"));
        user.setPassword(resultSet.getString("password"));
        user.setRealName(resultSet.getString("realName"));
        user.setGender(resultSet.getString("gender"));
        user.setPhoneNum(resultSet.getString("phoneNum"));
        user.setRemarks(resultSet.getString("remarks"));
        return user;
    }


}
