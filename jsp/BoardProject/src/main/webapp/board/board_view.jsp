<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
</head>
<body>
	<!-- 제목 -->
	<h2>${requestScope.dto.title }</h2>
	<!-- 작성자 작성일 좋아요 싫어요 -->
	<p>작성자 : ${requestScope.dto.writer}, 작성일 : ${requestScope.dto.bdate}, 
	좋아요 : ${requestScope.dto.blike} , 싫어요 : ${requestScope.dto.bhate}</p>
	<!-- 내용 -->
	<p>
		${requestScope.dto.content}
	</p>
	<button onclick="history.back();">뒤로가기</button>
	
</body>
</html>




