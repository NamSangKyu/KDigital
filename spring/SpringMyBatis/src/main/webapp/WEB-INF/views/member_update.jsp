<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update.do" method="post">
		<input type="text" name="id" value="${requestScope.dto.id }" readonly>
		<input type="password" name="passwd" value="${requestScope.dto.passwd }">
		<input type="text" name="name" value="${requestScope.dto.name }"> 
		<input type="text" name="age" value="${requestScope.dto.age }">
		<button>수정</button>
	</form>
</body>
</html>