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

	<div	class="container">
		<div class="starter-template">
			<h1>${msg}</h1>
			<sec:authorize access="hasRole('admin')">
				<p class="bg-info">admin</p>
			</sec:authorize>
			<sec:authorize access="hasRole('user')">
				<p class="bg-info">user</p>
			</sec:authorize>
			
			<form action="/logout" method="post">
				<input type="submit" class="btn btn-primary" value="注销"/>
			</form>
		</div>
	</div>
	
</body>
</html>