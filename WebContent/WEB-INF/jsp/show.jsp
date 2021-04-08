<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>展示数据</title>
<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
</head>
<body>
	<table>
	<tr><td>序号</td><td>姓名</td><td>操作</td></tr>
	<c:forEach var="user" items="${users}">
     <tr><td>${user.getId() }</td><td>${user.getName() }</td><td><a href="delete/${user.getId() }">删除</a></td></tr>
	</c:forEach>
	</table>
	<a onclick="add()">添加</a>
</body>
<script type="text/javascript">
function add(){
	var str = JSON.stringify({
	    "id":1,"name":"zs"
	});
	$.ajax({
        url: "ajaxData",
        data: str,
        contentType: "application/json;charset=UTF-8", //发送数据的格式
        type: "post",
        dataType: "json", //这是返回来是json，也就是回调json
        success: function(data){
            alert(data);
        }
    });
}

</script>
</html>