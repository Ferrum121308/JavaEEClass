package com.JavaEEClass.Work6.Utils;

import java.sql.*;

public class JDBCUtils {

    //JDBC驱动名称以及数据库URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/javaee?useSSL=false&serverTimezone=UTC";

    //数据库用户名以及密码
    static final String USERNAME = "root";
    static final String PASSWORD = "121308";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        System.out.println("数据库驱动加载成功！");
        Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
        System.out.println("数据库驱动连接成功！");
        return connection;
    }

    public static void release(Statement statement,Connection connection){
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            statement = null;
        }

        if(connection != null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            connection = null;
        }
    }

    public static void release(ResultSet resultSet,Statement statement,Connection connection){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            resultSet = null;
        }
        release(statement,connection);
    }

}
