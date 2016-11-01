<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="/css/bootstrap.min.css"/>
</head>
<body>
	
	<div class="container">
		<div class="starter-template">
			<h2>登录</h2>
			<form action="/login" method="post">
				<input type="text" class="form-control" name="username" placeholder="帐号"/>
				<input type="text" class="form-control" name="password" placeholder="密码"/>
				<input type="submit" class="btn btn-primary" value="登录"/>
			</form>
		</div>
	</div>
	
</body>
</html>