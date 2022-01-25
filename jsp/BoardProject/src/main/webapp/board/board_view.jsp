<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<button id="btnBack">뒤로가기</button>
	<c:if test="${requestScope.dto.writer == sessionScope.id }">
		<button id="btnUpdate">수정</button>
		<button id="btnDelete">삭제</button>
	</c:if>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
		$(function() {
			$("#btnBack").click(function() {
				history.back();
			});
			$("#btnUpdate").click(function() {
				location.href = "boardUpdateView.do?bno=${requestScope.dto.bno}";
			});
			$("#btnDelete").click(function() {
				location.href = "boardDelete.do?bno=${requestScope.dto.bno}";
			});
		});
	</script>	
</body>
</html>










