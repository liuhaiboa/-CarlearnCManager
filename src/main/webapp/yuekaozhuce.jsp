<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6/006
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        * {
            margin: 0;
            padding: 0;

        }

        li {
            list-style: none;
        }

        #container {
            width: 200px;
            border: 1px solid #000;
            text-align: center;
            /*margin: 100px auto;*/
            background: #31B0D5;
            position: absolute;
            top: 155px;
            left: 0;
            bottom: 0;

        }

        #container h3 {
            background: #245580;
            color: #fff;
            cursor: pointer;
        }

        .submenu {
            display: none;
        }

        .submenu li {
            cursor: pointer;
            color: wheat;
        }

        .submenu li:hover {
            background: #cccccc;
            color: #000000;
        }
        .biaoge {
            background:#fff;
            position: absolute;
            left: 215px;
            display: none;
        }
    </style>
</head>
<body>
<img src="source/img/logo.png" />
<ul id="container">
    <li class="shenqing-menu">
        <h3>约考</h3>
        <ul class="submenu">
            <li class="second-menu0">约考</li>
        </ul>
    </li>
</ul>
</div>

<div class="biaoge">
    <table border="1" cellspacing="0" style="width: 750px;">
        <caption>选择时间</caption>
        <tr>
            <th><input type="button"  value="周一" onclick="getValue(this.value)"/></th>
            <th><input type="button"  value="周二" onclick="getValue(this.value)"/></th>
            <th><input type="button"  value="周三" onclick="getValue(this.value)"/></th>
            <th><input type="button"  value="周四" onclick="getValue(this.value)"/></th>
            <th><input type="button"  value="周五" onclick="getValue(this.value)"/></th>


        </tr>
    </table>
</div>
<script type="text/javascript" src="source/js/jquery-3.2.1.min.js"></script>
<script>

        function getValue(val) {
            var a ={};
            a.sData = val;
            console.log(a);
            $.ajax(
            {
                url:"${pageContext.request.contextPath }/exam/addExam",
                type:"post",
                data:JSON.stringify(a),
                contentType:"application/json;charset=utf-8",
                dataType:"json",
                success:function(data) {
                    alert("发送成功");

                },
                error:function(data){
                    alert("发送成功");
                }
            });
    }
    //菜单的展开闭合
    var oContainer = document.getElementById("container");
    var aH3 = oContainer.getElementsByTagName("h3");
    var aSubmenu = oContainer.getElementsByTagName("ul");
    for (var i = 0; i < aH3.length; i++) {
        aH3[i].index = i;
        aH3[i].onclick = function () {
            if (aSubmenu[this.index].style.display == "block") {
                aSubmenu[this.index].style.display = "none";
            } else {
                aSubmenu[this.index].style.display = "block";
            }
        };
    }
    var aBiaoge = document.getElementsByClassName("biaoge");
    var aUl = document.getElementsByClassName("submenu");
    for (var i = 0; i < aUl.length; i++) {
        aUl[i].index = i;
        aUl[i].onclick = function () {
            aBiaoge[this.index].style.display = "block";
        }
    }
</script>
</body>
</html>
