package com.JavaEEClass.Work6;

import com.JavaEEClass.Work6.Bean.User;
import com.JavaEEClass.Work6.dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login0601Servlet", value = "/Work6/Login0601Servlet")
public class Login0601Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        response.setContentType("text/HTML;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        String inputUserName = request.getParameter("username");
        String inputPassword = request.getParameter("password");
        User user = userDao.findUserByUserName(inputUserName);
        if(user != null){
            String password = user.getPassword();
            if(password.equals(inputPassword)){
                response.sendRedirect("../../static/succeed0601.jsp");
            }
            else{
                response.sendRedirect("../../static/error0601.html");
            }
        }
    }
}
