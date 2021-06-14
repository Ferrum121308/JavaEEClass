package com.JavaEEClass.Work2.Task3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServerInfoServlet", value = "/Work2/Task3/ServerInfoServlet")
public class ServerInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/HTML;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>本次访问的信息如下：</h1>");
        out.println("服务器为：" + request.getLocalName() + "<br>");
        out.println("服务器IP地址为" + request.getLocalAddr() + "<br>");
        out.println("服务器IP端口号为：" + request.getLocalPort() + "<br>");
        out.println("context路径为：" + request.getContextPath() + "<br>");
        out.println("使用的方法为：" + request.getMethod() + "<br>");
        out.println("协议为：" + request.getProtocol() + "<br>");
        out.println("客户端IP为：" + request.getRemoteAddr() + "<br>");
        out.println("客户端端口号为：" + request.getRemotePort() + "<br>");
        out.println("URI为：" + request.getRequestURI() + "<br>");
        out.println("URL为：" + request.getRequestURL() + "<br>");
    }
}
