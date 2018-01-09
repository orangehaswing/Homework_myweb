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
    <title>Center</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="chrome=1"/>
    <script type="text/javascript" src="jmeditor/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="jmeditor/JMEditor.js"></script>

    <!-- 引入bootstrap -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
    <!-- 引入JQuery  bootstrap.js-->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <style type="text/css">
        body{
            /*background: url(images/d.jpg)repeat; !*pictures locate file*!*/
            /*background-repeat:no-repeat;         !*control pictures location*!*/
            /*background-size:860px 720px;*/
            /*background-position-x:50%;*/
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
    <h1>学生作业内容</h1>
    <br/>
    第一单元测试：请写出泰勒公式
    <br/>
    <div id="content" name="content" contentEditable="true" class="editDemo">
    ${inform}
    </div>
</center>

</body>
</html>
