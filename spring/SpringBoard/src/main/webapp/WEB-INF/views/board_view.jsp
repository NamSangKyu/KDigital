<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	$(function() {
		$(".like").click(function() {
			var data = "bno=${requestScope.dto.bno}";
			$.ajax({
				url : "boardLike.do",
				data : data,
				type : "get",
				dataType :"json",
				success : function(r) {
					if(r.result == 1)
						alert("게시물에 좋아요를 눌렀습니다.");
					else
						alert("게시물에 좋아요를 취소했습니다.");
					$(".like").text(r.count);			
				}
			});
		});
		$(".hate").click(function() {
			var data = "bno=${requestScope.dto.bno}";
			$.ajax({
				url : "boardHate.do",
				data : data,
				type : "get",
				dataType :"json",
				success : function(r) {
					if(r.result == 1)
						alert("게시물에 싫어요를 눌렀습니다.");
					else
						alert("게시물에 싫어요를 취소했습니다.");
					$(".hate").text(r.count);			
				}
			});
		});
	});
</script>
</head>
<body>
	<!-- 제목 -->
	<h2>${requestScope.dto.title }</h2>
	<!-- 작성자 작성일 좋아요 싫어요 -->
	<p>작성자 : ${requestScope.dto.writer}, 작성일 : ${requestScope.dto.bdate}</p>
	<p>조회수 : ${requestScope.dto.bcount}, 좋아요 : <a class="like">${requestScope.dto.blike}</a>, 싫어요 : <a class="hate">${requestScope.dto.bhate}</a> </p>
	<!-- 내용 -->
	<p>
		${requestScope.dto.content}
	</p>
	<button id="btnBack">뒤로가기</button>
	<c:if test="${requestScope.dto.writer == sessionScope.member.id }">
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










