<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>
<head>
	<title>Login</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<!-- 引入bootstrap -->
	<link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
	<!-- 引入JQuery  bootstrap.js-->
	<script src="/js/jquery-3.2.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<style type="text/css">
	body{
	   background: url(images/a.jpg)repeat;
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
		<h1>欢迎登陆</h1>
		<form action="login" method="post">
			<table>
				<tr>
					<td width="66" align="right"><font size="3">帐号：</font></td><td colspan="2"><input type="text" name="username" value="" style="width:200;height:25;"/></td>
				</tr>
				<tr>
					<td align="right"><font size="3">密码：</font></td><td colspan="2"><input type="text" name="password"  style="width:200;height:25;"/></td>
				</tr>
				<tr><td colspan="3" align="center"><input type="submit" value="登录" style="width:130;height:30;"/></td></tr>
			</table>
		</form>
		<a href="Regist.jsp"><font size="2"><i>没有帐号？点击注册</i></font></a>
	</div>
</center>
</body>
</html>