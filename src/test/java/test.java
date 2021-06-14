import com.JavaEEClass.Work6.Bean.User;
import com.JavaEEClass.Work6.dao.UserDao;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

public class test {
    @Test
    public void test01(){
        System.out.println("test1");
    }

    @Test
    //查询所有用户
    public void findAllUsers(){
        UserDao userDao = new UserDao();
        List<User> users = userDao.findAllUsers();
        for(int i = 0;i < users.size();i ++){
            System.out.println(users.get(i).getUserName());
        }
    }

    @Test
    //根据用户Id查询用户
    public void findUserById(){
        UserDao userDao = new UserDao();
        User user = userDao.findUserById(1L);
        System.out.println(user.getUserId());
        System.out.println(user.getUserName());
        System.out.println(user.getPassword());
        System.out.println(user.getRealName());
        System.out.println(user.getGender());
        System.out.println(user.getPhoneNum());
        System.out.println(user.getRemarks());
    }

    @Test
    //插入用户
    public void insertUser(){
        UserDao userDao = new UserDao();
        User user = new User("tieh","121212","th","男","18368802918","");
        if(userDao.insert(user)){
            System.out.println("插入成功！");
        }
        else{
            System.out.println("插入失败！");
        }
    }

    @Test
    //根据用户名判断用户是否存在
    public void existByUserName(){
        String userName = "th";
        UserDao userDao = new UserDao();
        if(userDao.existByUserName(userName)){
            System.out.println("用户名已存在！");
        }
        else {
            System.out.println("用户名不存在！");
        }
    }

    @Test
    //更新用户
    public void updateUser(){
        UserDao userDao = new UserDao();
        User user = userDao.findUserById(1L);
        user.setRemarks("跟新操作完成！");
        userDao.updateUser(user);
    }

    @Test
    //删除用户
    public void deleteUser(){
        UserDao userDao = new UserDao();
        if(userDao.deleteUser(5L)){
            System.out.println("删除成功！");
        }
        else{
            System.out.println("删除失败！");
        }
    }


}
