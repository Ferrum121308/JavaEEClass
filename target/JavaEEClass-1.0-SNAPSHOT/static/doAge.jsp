<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 26554
  Date: 2021/6/12
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>doAge</title>
</head>
<body>

<%
    int age = Integer.parseInt(request.getParameter("age"));
%>
    <c:set var="doage" value="<%=age%>"/>
    <c:out value="你的年龄：${doage}属于"></c:out>
        <c:if test="${doage<18}">少年</c:if>
        <c:if test="${doage>=18 && doage<30}">青年</c:if>
        <c:if test="${doage>=30 && doage<50}">中年</c:if>
        <c:if test="${doage>=50}">老年</c:if>
</body>
</html>
