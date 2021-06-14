<%--
  Created by IntelliJ IDEA.
  User: 26554
  Date: 2021/6/14
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>register</title>
</head>
<body>
    <fieldset>
        <legend>注册新用户</legend>
        <form action="../Work6/Register0601Servlet" method="post">
            <table cellpadding="2" align="center">
                <tr>
                    <td align="right">用户名：</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td align="right">密码：</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td align="right">真实姓名：</td>
                    <td><input type="text" name="realName"></td>
                </tr>
                <tr>
                    <td align="right">性别：</td>
                    <td>
                        <input type="radio" name="gender" value="男"/>男
                        <input type="radio" name="gender" value="女"/>女
                    </td>
                </tr>
                <tr>
                    <td align="right">联系方式：</td>
                    <td><input type="text" name="phoneNum"></td>
                </tr>
                <tr>
                    <td align="right">备注：</td>
                    <td><textarea rows="10" cols="30" name="remarks"></textarea></td>
                </tr>
            </table>
            <p align="center"><input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></p>
        </form>
    </fieldset>
</body>
</html>
