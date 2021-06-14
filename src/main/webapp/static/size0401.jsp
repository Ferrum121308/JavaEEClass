<%--
  Created by IntelliJ IDEA.
  User: 26554
  Date: 2021/6/12
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Circle Size</title>
</head>
<body>
请输入圆的半径：<br>
    <form action="size0401.jsp" method="post">
        <input type="text" name="r" value="1">
        <input type="submit" value="计算">
    </form>
<%
    double r = 0.0;
    String R = request.getParameter("r");
    if(R != null){
        r = Double.parseDouble(R);
    }
    else{
        r = 1;
    }
    double size = Math.PI * r * r;
    out.println("圆的面积为：" + size);
%>
</body>
</html>
