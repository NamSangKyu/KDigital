<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
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
	<c:if test="${sessionScope.member==null}">
		<script>
			alert('로그인해야 이용하실수 있습니다.');
			location.href='/';
		</script>
	
	</c:if>
	<h2>글쓰기</h2>
	<form action="write.do">
		<input type="text" name="title" placeholder="제목을 입력하세요" required>
		<textarea name="content" placeholder="내용을 입력하세요" required></textarea>
		<button>글쓰기</button>
		<button type="button" onclick="history.back();">취소</button>
	</form>
</body>
</html>





