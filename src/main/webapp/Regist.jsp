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
        body {
            /*background: url(images/b.jpg) repeat;*/
        }

        #login-box {
            /*border:1px solid #F00;*/
            padding: 35px;
            border-radius: 15px;
            background: #56666B;
            color: #fff;
        }

    </style>
</head>
<body>
<center>
    <div>
        <h1>注册</h1>
        <form action="regist" method="post">
            <table>
                <tr>
                    <td width="100" align="right">
                        <font size="3">请输入帐号：</font></td>
                    <td colspan="2"><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td width="100" align="right">
                        <font size="3">请输入密码：</font></td>
                    <td colspan="2"><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td width="100" align="right">
                        <font size="3">请确认密码：</font></td>
                    <td colspan="2"><input type="password" name="rpsw"></td>
                </tr>
                <tr>
                    <td width="100" align="right">
                        <font size="3">请输入姓名：</font></td>
                    <td colspan="2"><input type="text" name="realname"></td>
                </tr>
                <tr>
                    <td width="100" align="right">
                        <font size="3">请输入学号：</font></td>
                    <td colspan="2"><input type="text" name="stdID"></td>
                </tr>
                <tr>
                    <td width="100" align="center">
                        <font size="3">电子邮箱：</font></td>
                    <td colspan="2"><input type="text" name="E-mail" maxlength="28"></td>
                </tr>
                <tr>
                    <td colspan="3" align="center"><input type="submit" value="注册"></td>
                </tr>
            </table>
        </form>
        <font color="red" size="2"></font>
    </div>
</center>
</body>
</html>
