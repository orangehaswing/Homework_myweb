<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        /*body {*/
            /*background: url(images/d.jpg) repeat;*/
            /*background-repeat: no-repeat;*/
            /*background-size: 860px 720px;*/
            /*background-position-x: 50%;*/
        /*}*/

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
    <h1>学生答案：</h1>

    <%--<!-- 遍历Map集合 -->--%>
    <c:forEach items="${userinform}" var="info">
        <c:url value="/ListFileServlet" var="downurl">
            <c:param name="inform" value="${info.value}"></c:param>
        </c:url>
        <p>
        学生${info.key}作业信息:<a href="${downurl}">显示作业内容</a>
        <br>
        </p>
    </c:forEach>

</center>
</body>

</html>
