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
	<c:forEach var="obj" items="${requestScope.list }">
		${obj.studentNo } ${obj.name } ${obj.majorNo} ${obj.score }<br>
	</c:forEach>
</body>
</html>