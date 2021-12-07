<%--
  Created by IntelliJ IDEA.
  User: meilv
  Date: 2021/12/4
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户登陆界面</title>
  </head>
  <body>
    <div margin="0 auto">
      <h1>登陆界面</h1><br><br>
    <form method="post" action="./login" text-align="center">
      用户名：<input type="text" name="users"/><br>
      密码：&nbsp;&nbsp;&nbsp;<input type="password" name="pwd"/><br><br>
      <tr><td>验 证:</td><td><input type='text' name="code"  value=''></td></tr>
      <tr><td>&nbsp;</td><td><img src="./validateCode" /></td></tr><br>
      <input type="submit" text-align="center" value="登录"/>
    </form>
    </div>
  </body>
</html>
