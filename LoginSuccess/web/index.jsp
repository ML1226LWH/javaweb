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
    <style>
      .a
      {
        width: 600px;
        height: 400px;
        background-color: #8dbcea;
        margin: 0 auto;
      }

    </style>
  </head>
  <body>
    <div class="a">
      <h1 style='text-align:center;padding:0.7em'>登录界面</h1><br><br>
    <form method="post" action="./login" text-align="center">
      <table style="padding:2em">
      用户名：<input style="text-align:center;" type="text" name="users" text-align="center"/><br>
      密  码：&nbsp;&nbsp;<input style="margin:0 auto;" type="password" name="pwd"/><br>
      验  证:&nbsp;&nbsp;&nbsp;&nbsp;<input style="text-align:center;" type='text' name="code"  value=''>
       <img src="./validateCode" style="padding-left: 5px;"/><br>
      <div style="display:block;margin:0 auto"><input style='text-align:center;padding:0.7em' type="submit" text-align="center" value="登录"/></div>
      </table>
    </form>
    </div>
  </body>
</html>
