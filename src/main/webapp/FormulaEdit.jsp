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
    <title>Login</title>

    <meta http-equiv="X-UA-Compatible" content="chrome=1" />
    <script type="text/javascript" src="jmeditor/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="jmeditor/JMEditor.js"></script>

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
<div class="container">
    <div class="head">
        <div class="jmelogo">
        </div>
    </div>
    <div class="body">
        <div class="content">
            <h1>JMEditor</h1>
            <p>
                请您在后面的输入框中输入<span class="mark">x^2</span>：<span class="mathquill-editable"></span><br>
                再试试<span class="mark">3/4</span>，<span class="mark">\sqrt x</span>或<span class="mark">\sin\alpha</span>，简直太棒了。
            </p>
            <p>
                下面是JMEditor在线公式编辑器，在CKEditor中集成了公式编辑插件 ∑ ，赶紧体验一下吧。
            </p>
            <p>
            <div id="content" contentEditable="true" class="editDemo">

            </div>

            </p>
            <p>
                <input type="button" onclick="alert(JMEditor.isEmpty('content'));" value="判断是否为空">
                <input type="button" onclick="$('.contentArea').val(JMEditor.html('content'));" value="取值">
                <input type="button" onclick="window.open('view.html');" value="在新窗口中预览">
            </p>
            <p>
                <textarea class="contentArea"></textarea>
            </p>
            <p>
        </div>
    </div>
</div>
</center>
</body>
</html>
