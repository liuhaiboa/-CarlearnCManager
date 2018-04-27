<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/25/025
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成绩查询</title>

</head>
<body>
<img src="../../source/img/logo.png" />
<form action="/score/querychengji" method="post">
<table border="1" name="xueyuan">
    <tr>
        <td >用户身份证号</td>
        <td style="width: 200px;">
            <input type="text" name="s_useridcard"/></td>
    </tr>
    <tr>
        <td>成绩</td>
        <td name="s_score" style="width: 200px;"></td>
    </tr>
    <td colspan="2" align="center">
        <input type="submit" value="提交" />提交</button>
    </td>
</table>

</form>
<table border="1" name="guanli">
    <tr>
        <td >用户身份证号</td>
        <td name="s_useridcard" style="width: 200px;">    </td>
    </tr>
    <tr>
        <td>成绩</td>
        <td name="s_score" style="width: 200px;">     </td>
    </tr>
</table>

</body>
</html>
