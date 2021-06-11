package com.JavaEEClass.Work1.Task2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "InitParamsServlet",
        value = "/Work1/Task2/InitParamsServlet",
        initParams = {
            @WebInitParam(name = "姓名",value = "铁昊"),
            @WebInitParam(name = "学号",value = "Xf18220117"),
            @WebInitParam(name = "性别",value = "男")
        })
public class InitParamsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        ServletConfig config = this.getServletConfig();
        Enumeration<String> paramConfig = config.getInitParameterNames();
        while (getInitParameterNames().hasMoreElements()){
            String paramName = paramConfig.nextElement();
            String paramValue = config.getInitParameter(paramName);
            out.println(paramName + "：" + paramValue + "<br/>");
        }
    }
}
