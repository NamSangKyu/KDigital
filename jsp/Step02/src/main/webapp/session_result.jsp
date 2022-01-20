<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	세션에 저장된 데이터 : <%=session.getAttribute("data") %><br>
	세션 아이디값 : <%=session.getId() %>
	<a href="SessionInvalid">세션 무효화</a>
</body>
</html>