<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>post提交数据</title>
</head>
<body>
	<form action="hello.do" method="post">
    <!--list集合-->
    <input type="text" name="userList[0]"/>
    <input type="text" name="userList[1]"/>
    <input type="text" name="userList[2]"/>
    <!--map集合-->
    <input type="text" name="maps['age']"/>
    <input type="text" name="maps['name']"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>