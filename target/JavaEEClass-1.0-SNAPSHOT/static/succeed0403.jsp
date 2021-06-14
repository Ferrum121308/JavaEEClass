<%--
  Created by IntelliJ IDEA.
  User: 26554
  Date: 2021/6/12
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>succeed</title>
</head>
<body>

<%
    out.println("登陆成功！欢迎您，" + request.getParameter("userName"));
%>

</body>
</html>
