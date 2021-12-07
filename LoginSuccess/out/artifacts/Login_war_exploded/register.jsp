<%--
  Created by IntelliJ IDEA.
  User: meilv
  Date: 2021/12/4
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆界面</title>
</head>
<body>
<div>
    <h1>注册界面</h1><br><br>
    <form method="post" action="/register" text-align="center">
        用户名：<input type="text" name="users"/><br>
        密码：&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="pwd"/><br><br>
        <input type="submit" text-align="center" value="注册"/>
    </form>
</div>
</body>
</html>
