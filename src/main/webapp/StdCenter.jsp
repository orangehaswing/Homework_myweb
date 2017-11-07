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
    <!-- 引入JQuery  bootstrap.js-->
    <script src="/js/jquery-3.2.1.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <style type="text/css">
        body{
            background: url(images/d.jpg)repeat; /*pictures locate file*/
            background-repeat:no-repeat;         /*control pictures location*/
            background-size:860px 720px;
            background-position-x:50%;
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
    <h1>这是学生主页</h1>
    <h2>学生作业系统</h2>
    <form action="Upload" method="post" enctype="multipart/form-data">
        选择一个文件:
        <input type="file" name="uploadFile" />
        <br/><br/>
        <input type="submit" value="上传" />
    </form>
    <a href="FormulaEdit.jsp"><font size="４"><i>公式编辑器主页</i></font></a>
    <br/>
    <a href="http://www.codecogs.com/latex/eqneditor.php">外部公式编辑器</a>
</center>

</body>

</html>
