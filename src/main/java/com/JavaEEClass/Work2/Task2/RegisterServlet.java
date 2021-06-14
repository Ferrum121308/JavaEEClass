package com.JavaEEClass.Work2.Task2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "RegisterServlet", value = "/Work2/Task2/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/HTML;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        name = new String(name.getBytes("iso-8859-1"),"UTF-8");
        String password = request.getParameter("password");
        password = new String(password.getBytes("iso-8859-1"),"UTF-8");
        String gender = request.getParameter("gender");
        gender = new String(gender.getBytes("iso-8859-1"),"UTF-8");
        String city = request.getParameter("city");
        city = new String(city.getBytes("iso-8859-1"),"UTF-8");
        String[] hobbies = request.getParameterValues("hobby");
        out.println("<h1>您注册的信息如下：</h1>");
        out.println("用户名：" + name + "<br/>");
        out.println("密码：" + password + "<br/>");
        out.println("性别：" + gender + "<br/>");
        out.println("城市：" + city + "<br/>");
        out.println("爱好：");
        for(int i = 0;i < hobbies.length;i ++) {
            String hobby = new String(hobbies[i].getBytes("iso-8859-1"),"UTF-8");
            out.println(hobby + " ");
        }

    }
}
