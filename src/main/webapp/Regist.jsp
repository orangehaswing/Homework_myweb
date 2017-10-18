<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/18
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Regist</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入bootstrap -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
    <!-- 引入JQuery  bootstrap.js-->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <style type="text/css">
        body{
            background: url(images/b.jpg)repeat;
        }
        #login-box {
            /*border:1px solid #F00;*/
            padding: 35px;
            border-radius:15px;
            background: #56666B;
            color: #fff;
        }

    </style>
</head>
<body>
<center>
    <div>
        <h1>注册</h1>
        <form action="RegistServlet" method="post">
            请输入帐号：<input type="text" name="username"><br/>
            请输入密码：<input type="password" name="password"><br/>
            请确认密码：<input type="password" name="rpsw"><br/>
            <input type="submit" value="注册">
        </form>
        <font color="red" size="2"> ${msg }</font>
    </div>
</center>
</body>
</html>
