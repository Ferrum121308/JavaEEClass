<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.JavaEEClass.Work5.User" %><%--
  Created by IntelliJ IDEA.
  User: 26554
  Date: 2021/6/12
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>studentList</title>
</head>
<body>
<%
  String person[][] = {
          {"吴泽胜","男","20"},{"董根阳","男","21"},
          {"季晨","男","20"},{"吴成鑫","男","25"},
          {"毛芳芳","女","21"},{"佘奔","男","23"},
          {"汪铭","男","21"},{"李艳萍","女","24"},
          {"张天鹏","男","20"},{"佘鑫儿","女","20"}
  };
  ArrayList<User> users = new ArrayList<>();
  for(int i = 0;i < person.length;i ++){
    User user = new User();
    user.setName(person[i][0]);
    user.setGender(person[i][1]);
    user.setAge(person[i][2]);
    users.add(user);
    request.setAttribute("users",users);
  }
%>
用户信息表如下：
<table border="1">
  <tr>
    <td>姓名</td>
    <td>性别</td>
    <td>年龄</td>
  </tr>


  <c:forEach var="user" items="${users}">
    <tr>
      <td>${user.name}</td>
      <td>${user.gender}</td>
      <td>${user.age}</td>
    </tr>
  </c:forEach>



</table>

</body>
</html>
