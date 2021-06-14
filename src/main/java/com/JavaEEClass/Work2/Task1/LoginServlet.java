package com.JavaEEClass.Work2.Task1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/Work2/Task1/LoginServlet")
public class LoginServlet extends HttpServlet {
    public static final String username = "Ferrum";
    public static final String password = "121308";
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/HTML;charset=UTF-8");
        PrintWriter out = response.getWriter();
        request.setCharacterEncoding("UTF-8");
        String inputUserName = request.getParameter("username");
        String inputPassword = request.getParameter("password");
        if(username.equals(inputUserName) && password.equals(inputPassword)){
            response.sendRedirect("../../static/welcome0201.html");
        }
        else {
            out.println("账号或密码错误！");
        }

    }
}
