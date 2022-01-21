<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학적 관리 프로그램</title>
</head>
<body>
	<h2>학생 정보 리스트</h2>
	<table>
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>학과번호</th>
			<th>평점</th>
		</tr>
		<!-- 학생정보 출력 -->
		<c:forEach var="obj" items="${requestScope.list }">
			<tr>
				<td>${obj.sno }</td>
				<td>${obj.name}</td>
				<td>${obj.major }</td>
				<td>${obj.score }</td>
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>





