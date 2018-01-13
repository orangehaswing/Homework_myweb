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
    <!-- 引入bootstrap -->
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
    <meta http-equiv="X-UA-Compatible" content="chrome=1"/>
    <script type="text/javascript" src="jmeditor/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="jmeditor/JMEditor.js"></script>

    <style type="text/css">
        body {
            font-family: "华文细黑";
            width: 100%;
            height:auto;
            background:url("images/d.jpg") no-repeat;
            background-size: 100%;
        }
        #login-box {
            /*border:1px solid #F00;*/
            padding: 35px;
            border-radius: 15px;
            background: #6b3b2e;
            color: #fff;
        }
    </style>
</head>

<body>
<center>
    <h1>这是教师主页</h1>
    <h2>教师作业系统</h2>
    <form action="Download" method="post">
        <br/>
        作业内容：<select name="clas" class="input">
        <option value="1" selected="selected">第一单元测试</option>
        <option value="2">第二单元测试</option>
        <option value="3">第三单元测试</option>
        <option value="4">第四单元测试</option>
        </select>
        <br/>
        <br/>
        <input  type="submit" value="发布" />
        <input  type="reset" value="重置" class="button border-main icon-search"/>
        <input  type="button" value="返回" onclick="back()"class="button border-main icon-search"/>
        <br/>
        <br>
        <tr>
            <td colspan="3" align="center"><input name="homework" type="submit" value="学生提交作业内容"></td>
        </tr>
    </form>
</center>
</body>

<script type="text/javascript">
    function back(){
        location.reload();
    }
</script>

</html>
