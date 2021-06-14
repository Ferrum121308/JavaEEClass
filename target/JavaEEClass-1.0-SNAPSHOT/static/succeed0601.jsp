<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.JavaEEClass.Work6.dao.UserDao" %>
<%@ page import="java.util.List" %>
<%@ page import="com.JavaEEClass.Work6.Bean.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 26554
  Date: 2021/6/14
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  UserDao userDao = new UserDao();
  List<User> userList = new ArrayList<>();
  userList = userDao.findAllUsers();
  request.setAttribute("users",userList);
  System.out.println(userList.size());
%>


<html>
<head>
    <title>succeed</title>
</head>
<body>

  <h1 align="center">用户列表</h1>
  <table border="2" align="center" cellpadding="10">
    <tr>
      <th align="center">用户编号</th>
      <th align="center">用户名</th>
      <th align="center">密码</th>
      <th align="center">用户真实姓名</th>
      <th align="center">用户性别</th>
      <th align="center">用户联系方式</th>
      <th align="center">备注</th>
    </tr>
    <c:forEach var="user" items="${users}">
      <tr>
        <td align="center">${user.userId}</td>
        <td align="center">${user.userName}</td>
        <td align="center">${user.password}</td>
        <td align="center">${user.realName}</td>
        <td align="center">${user.gender}</td>
        <td align="center">${user.phoneNum}</td>
        <td align="center">${user.remarks}</td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
