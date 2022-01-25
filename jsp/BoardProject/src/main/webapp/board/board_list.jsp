<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
<style type="text/css">
	header {
		width: 1200px;
		margin: 0 auto;
	}
	h2{
		text-align: center;
	}
	table{
		border-collapse: collapse;
		table-layout: fixed;
		width: 1200px;
		margin:0 auto;
	}
	th,td{
		border:1px solid black;
		text-align: center;
	}
	.title{
		width: 600px;
		text-overflow: ellipsis;
		overflow: hidden;
		white-space: nowrap;
		text-align: left;
		
	}
</style>
</head>
<body>
	<header>
		<div class="profile">
			${sessionScope.id }님이 로그인하셨습니다.
			<a href="logout.do">로그아웃</a> | <a href="#">내 정보 수정</a>  
		</div>
	</header>
	<h2>게시판</h2>
	<hr>
	<table>
		<tr>
			<td colspan="7">
				<a href="writeView.do">글쓰기</a>
			</td>
		</tr>
		<tr>
			<th>글번호</th>
			<th class="title">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
			<th>좋아요</th>
			<th>싫어요</th>
		</tr>
		<c:forEach var="board" items="${requestScope.list}">
			<tr>
				<td>${board.bno}</td>
				<td class="title">
					<a href="boardView.do?bno=${board.bno}">${board.title}</a>
				</td>
				<td>${board.writer}</td>
				<td>${board.bdate}</td>
				<td>${board.bcount}</td>
				<td>${board.blike}</td>
				<td>${board.bhate}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>




