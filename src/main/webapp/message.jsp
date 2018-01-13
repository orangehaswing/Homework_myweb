<%@ page import="test.JDBC.Connect2mySQL" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<%

    String name = request.getParameter("username");
    Connect2mySQL connect2mySQL = new Connect2mySQL();
    HashMap<String, String> userinform = connect2mySQL.readFromMySQL(name);
    String adminhomework = userinform.get("admin");
%>

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
    <h2><%=adminhomework%></h2>
    <br/>
    <br/>
    <div id="content" name="content" contentEditable="true" class="editDemo">
    ${inform}
    </div>
</center>
</body>
</html>
