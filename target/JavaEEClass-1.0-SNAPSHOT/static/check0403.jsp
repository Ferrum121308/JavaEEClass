<%--
  Created by IntelliJ IDEA.
  User: 26554
  Date: 2021/6/12
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>check</title>
</head>
<body>
<%
  String userName = request.getParameter("username");
  String password = request.getParameter("password");
  if("Admin".equals(userName) && "123456".equals(password)){
%>
  <jsp:forward page="succeed0403.jsp">
    <jsp:param name="userName" value="<%=userName%>"/>
  </jsp:forward>

<%

  }
  else{

%>
  <jsp:forward page="error0403.jsp"></jsp:forward>
<%
  }


%>
</body>
</html>
