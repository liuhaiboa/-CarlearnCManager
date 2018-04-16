<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/15/015
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="../../source/css/main.css"  rel="stylesheet" type="text/css" />
</head>
<body>

<div id="pic">

    <img src="../../source/img/logo.png" />

    <div id="icon">

    <a href="http://www.jiakaobaodian.com/">
    <div class="icon01 iconn01"><img src="../../source/img/icon01.png" /><h5>在线学习</h5></div>
    </a>
    <a href="#">
    <div class="icon01 iconn02"><img src="../../source/img/icon02.png"/><h5>在线约车</h5></div>
    </a>
    <a href="#">
    <div class="icon01 iconn03"><img src="../../source/img/icon03.png" /><h5>约考注册</h5></div>
    </a>
    <a href="#">
    <div class="icon01 iconn04"><img src="../../source/img/icon04.png"/><h5>成绩查询</h5></div>
    </a>
    </div>


</div>

<div id="footer">

    <a href="${pageContext.request.contextPath }/form.jsp">
        <button class="register">新管理员注册</button>
    </a>
    </br></br></br></br></br></br>
    <a href="https://hl.122.gov.cn/" style="margin-left: 600px;">友情连接：黑龙江公安管理局</a>
    <p style="margin-left: 525px;">本页面基于驾校学员管理制作。   QQ：540450460</p >

</div>


</body>
</html>