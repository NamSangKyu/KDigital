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
	<table>
		<tr>
			<td colspan="4">
				<form action="insert.do">
					<input type="text" name="id">
					<input type="password" name="passwd">
					<input type="text" name="name">
					<input type="text" name="age"><button>추가</button>
				</form>
			</td>
		</tr>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<c:forEach var="obj" items="${requestScope.list }">
			<tr>
				<td>${obj.id }</td>
				<td>${obj.passwd }</td>
				<td>${obj.name }</td>
				<td>${obj.age }</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>








