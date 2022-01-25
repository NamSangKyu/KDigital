<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
<style>
	h2 {
		text-align: center;
	}
	form{
		width: 700px;
		margin : 0 auto;
	}
	form *{
		width: 100%;
		font-size: 20px;
		margin-bottom: 10px;
		padding:10px;
		box-sizing: border-box;
	}
	textarea {
		height: 400px;
	}
</style>
</head>
<body>
	<h2>글 수정 페이지</h2>
	<form action="update.do">
		<input type="hidden" name="bno" value="${requestScope.dto.bno }">
		<input type="text" name="title" placeholder="제목을 입력하세요" value="${requestScope.dto.title }" required>
		<textarea name="content" placeholder="내용을 입력하세요" required>${requestScope.dto.content }</textarea>
		<button>수정</button>
		<button type="button" onclick="history.back();">취소</button>
	</form>
</body>
</html>





