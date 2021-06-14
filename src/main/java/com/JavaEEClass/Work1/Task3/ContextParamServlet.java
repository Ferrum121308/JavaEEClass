package com.JavaEEClass.Work1.Task3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "ContextParamServlet", value = "/Work1/Task3/ContextParamServlet")
public class ContextParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/HTML;charset=UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext context = this.getServletContext();
        Enumeration<String> paramNames = context.getInitParameterNames();
        while (paramNames.hasMoreElements()){
            String name = paramNames.nextElement();
            String value = context.getInitParameter(name);
            out.println(name + "：" + value + "<br/>");
        }
    }
}
