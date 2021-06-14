package com.JavaEEClass.Work6;

import com.JavaEEClass.Work6.Bean.User;
import com.JavaEEClass.Work6.dao.UserDao;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Register0601Servlet", value = "/Work6/Register0601Servlet")
public class Register0601Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        response.setContentType("text/HTML;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Map<String,String> map = new HashMap<>();

        String name = request.getParameter("username");
        name = new String(name.getBytes("iso-8859-1"),"UTF-8");
        if(userDao.findUserByUserName(name) != null){
            out.println("用户名已存在，请重试！<br/>");
            out.println("点我重新<a href = '../static/register0601.jsp'>注册</a>");
        }
        else {
            map.put("userName", name);

            String password = request.getParameter("password");
            password = new String(password.getBytes("iso-8859-1"), "UTF-8");
            map.put("password", password);

            String realName = request.getParameter("realName");
            realName = new String(realName.getBytes("iso-8859-1"), "UTF-8");
            map.put("realName", realName);

            String gender = request.getParameter("gender");
            gender = new String(gender.getBytes("iso-8859-1"), "UTF-8");
            map.put("gender", gender);

            String phoneNum = request.getParameter("phoneNum");
            map.put("phoneNum", phoneNum);

            String remarks = request.getParameter("remarks");
            remarks = new String(remarks.getBytes("iso-8859-1"), "UTF-8");
            map.put("remarks", remarks);

            User user = new User();
            try {
                BeanUtils.populate(user, map);
                userDao.insert(user);
                out.println("注册成功！<br/>");
                out.println("<a href = '../static/login0601.html'>点我</a>登录");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }


    }
}
