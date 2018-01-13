<%@ page import="test.JDBC.Connect2mySQL" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--从数据库中显示已写内容--%>
<%
    String name = request.getParameter("username");
    Connect2mySQL connect2mySQL = new Connect2mySQL();
    HashMap<String, String> userinform = connect2mySQL.readFromMySQL(name);
    String inform = userinform.get(name);
    String adminhomework = userinform.get("admin");
%>

<html>
<head>
    <title>Login</title>
    <meta http-equiv="X-UA-Compatible" content="chrome=1"/>
    <script type="text/javascript" src="jmeditor/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="jmeditor/JMEditor.js"></script>
    <style type="text/css">
        body {
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
    <div class="container">
        <div class="head">
            <div class="jmelogo">
            </div>
        </div>
        <div class="body">
            <div class="content">
                <h1>学生作业提交（内含公式编辑器）</h1>
                <br/>
                <br/>
                <br/>
                <%--<h2>公式测试</h2>--%>
                <%--<p>--%>
                    <%--请您在后面的输入框中输入<span class="mark">x^2</span>：<span class="mathquill-editable"></span><br>--%>
                    <%--再试试<span class="mark">3/4</span>，<span class="mark">\sqrt x</span>或<span--%>
                        <%--class="mark">\sin\alpha</span>，简直太棒了。--%>
                <%--</p>--%>
                <p>
                <h2><%=adminhomework%></h2>
                </p>
                <p>
                <div id="content" name="content" contentEditable="true" class="editDemo">
                    <%=inform%>
                </div>
                </p>
                <form action="Upload" method="post">
                    <p>
                        <input type="button" onclick="$('.contentArea').val(JMEditor.html('content'));" value="保存">
                    <td colspan="3" align="center"><input type="submit" value="提交"></td>
                    </p>
                    <p>
                        <textarea id="textarea" name="textarea" rows="5" cols="20" class="contentArea"></textarea>
                    </p>
                    <p>
                        学生用户：<input type="text" name="username" cols="5" value="${username}">
                    </p>
                </form>
                <p>
            </div>
        </div>
    </div>
</center>
</body>
</html>
