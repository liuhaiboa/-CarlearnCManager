<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="UTF-8">
		<title>欢迎登录</title>
		<link href="source/css/index.css" rel="stylesheet" type="text/css" />
	
	</head>
	<body>
		<img src="source/img/logo.png" />
		<div class="wrap">
			<div class="title">
				账号密码登录
			</div>
			
			<form action="${pageContext.request.contextPath }/user/login" method="post" id="login-form">
				<input type="text" name="s_name" placeholder="姓名" />
				<input type="password"  name="s_password" placeholder="初始密码为身份证号" />
				<!--<a href="index.html" style="text-decoration:none">-->
				<button type="submit">登录</button>
				<!--</a>-->
			
			</form>
			
			<a href="form.html" id="re">没有账号？ 点我注册</a>
			
		</div>
	</body>
</html>
