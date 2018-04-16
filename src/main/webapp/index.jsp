<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>欢迎登录</title>
	<link href="source/css/index.css" rel="stylesheet" type="text/css" />

	<script src="source/js/goregister.js"></script>

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


	<a href= "${pageContext.request.contextPath }/form.jsp" id="re">没有账号？ 点我注册

	</a>

	<%--<button type="button">--%>
	<%--注册</button>--%>
</div>
</body>
</html>
