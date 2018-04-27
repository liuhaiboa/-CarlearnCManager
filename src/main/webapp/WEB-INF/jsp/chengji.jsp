<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/25/025
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>

<html>
<head>
    <title>成绩查询</title>

</head>
<body>
<img src="../../source/img/logo.png" />
<form method="post">
<table>
    <tr>
        <td>用户身份证号
            ${score1}


        </td>
    </tr>
    <tr name="s_score" value="s_score">
        <td>

          <%--<% String score=request.getParameter("s_score");--%>
          <%--%>--%>
            <%--<%=score%>--%>

            <%--${score.sScore}--%>
              <%--${score.sScore}--%>
            <%--<%=request.getAttribute("socre")%>--%>

            ${score}

        </td>
    </tr>
</table>
</form>
</body>
</html>
