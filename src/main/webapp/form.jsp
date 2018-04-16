<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/14/014
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>个人信息填写</title>
    <meta charset="utf-8">
    <meta name="format-detection" content="telephone=no" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black" />

    <meta name="keywords" content="jQuery省市区三级联动插件,select下拉选择框美化,jQuery城市选择插件,jQuery城市三级联动" />
    <meta name="description" content="jQuery省市区三级联动代码网络上有很多，但是带下拉框模拟美化的缺少很少见，很不错的jQuery插件。" />
    <link href="source/css/city.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="source/js/city.min.js"></script>

    <style type="text/css">
        body{
            background:#cee8f7;
        }
    </style>
</head>

<body>
<div>
    <form action="<%=request.getContextPath()%>/user/adduser" method="post" enctype="multipart/form-data">

        <table border="1" bordercolor="blue" align="center" height="600" width="600"
               cellspacing="0">
            <tr>
                <th colspan="2" align="center">注册</td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="s_name"/><br /></td>
                </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="s_password"/><br /></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="radio" name="s_sex" value="nan"/>男
                    <input type="radio" name="s_sex" value="nv"/>女<br />
                </td>
            </tr>
            <tr>

                <%--<td> 出生年月（请选择）</td>--%>
                <%--<td><input type="text" name="s_borth"--%>
                           <%--onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"/></td>--%>
                <%--<td><input type="text" name="s_borth"/><br /></td>--%>
                <!--data格式不支持ie浏览器支持火狐谷歌-->
            </tr>
            <tr>
                <td>身份证号</td><td><input type="text" name="s_idcard" /><br /></td><!--此处需要有一个校验-->
            </tr>
            <tr>
                <td>电话</td><td><input type="text"  name="s_telephone"/><br /></td></tr><!--此处需要有一个校验-->
            <tr><td>邮箱</td><td><input type="email" name="s_email"/></td></tr>
            <%--<tr><td>上传照片</td><td><input type="file" name="s_photo" /><br /></td></tr>--%>

            <tr>
                <td>家庭住址</td><td><input type="text" name="s_address" /><br /></td></tr>



<!--此处插入一个插件-->
<!--<iframe src="city.html"  height="800" width="500"></iframe>-->
<%--<tr>--%>
    <%--<td colspan="2">--%>
        <%--<div id="content-wrap">--%>
            <%--<div id="content-left" class="demo">--%>
                <%--<!--<form action="" name="form1">-->--%>
                <%--<div class="infolist">--%>
                    <%--<lable>户籍所在：</lable>--%>
                    <%--<div class="liststyle">--%>
                                <%--<span id="Province">--%>
                                    <%--<i>请选择省份</i>--%>
                                    <%--<ul>--%>
                                        <%--<li><a href="javascript:void(0)" alt="请选择省份">--%>
                                        	<%--请选择省份</a></li>--%>
                                    <%--</ul>--%>
                                    <%--<input type="hidden" name="s_nativeprovince" value="请选择省份">--%>
                                <%--</span>--%>
                        <%--<span id="City">--%>
                                    <%--<i>请选择城市</i>--%>
                                    <%--<ul>--%>
                                        <%--<li><a href="javascript:void(0)" alt="请选择城市">--%>
                                        	<%--请选择城市</a></li>--%>
                                    <%--</ul>--%>
                                    <%--<input type="hidden" name="s_nativecity" value="请选择城市">--%>
                                <%--</span>--%>
                        <%--<span id="Area">--%>
                                    <%--<i>请选择地区</i>--%>
                                    <%--<ul>--%>
                                        <%--<li><a href="javascript:void(0)" alt="请选择地区">--%>
                                        	<%--请选择地区</a></li>--%>
                                    <%--</ul>--%>
                                    <%--<input type="hidden" name="s_nativearea" value="请选择地区">--%>
                                <%--</span>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<!--  </form> -->--%>
            <%--</div>--%>
            <%--<div id="content-right"></div>--%>
        <%--</div>--%>
    <%--</td>--%>
<%--</tr>--%>

<tr>
    <td colspan="2" align="center">
        <input type="submit" value="提交" />提交</button>
    </td>
</tr>
</table>
</form>
</div>
</body>

</html>
