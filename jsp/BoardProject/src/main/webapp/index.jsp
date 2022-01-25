<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<!-- 세션 정보가 있으면 main.do 실행 -->
	<c:if test="${ sessionScope.id != null}">
		<script>
			location.href="main.do";
		</script>
	</c:if>
	<form action="login.do" method="post">
		<input type="text" name="id" placeholder="아이디를 입력하세요"><br>
		<input type="password" name="passwd" placeholder="암호를 입력하세요"><br>
		<button>로그인</button>
		
	</form>
</body>
</html>