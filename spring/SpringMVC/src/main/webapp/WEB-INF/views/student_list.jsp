<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학적 관리 프로그램</title>
<style>
	*{margin:0;padding:0}
	
	h2{
		margin-top : 100px;
		margin-bottom: 20px;
		text-align: center;
	}	
	table{
		border-collapse: collapse;
		margin:0 auto;
		width: 700px;
	}
	th, td {
		padding:10px 0px;
		text-align: center;
		border:1px solid black;
	}
</style>
</head>
<body>
	<h2>학생 정보 리스트</h2>
	<table>
		<thead>
		<tr>
			<td colspan="5">
				<form action="register.do">
					<input type="text" name="sno" placeholder="학번">
					<input type="text" name="name" placeholder="이름">
					<select name="major">
						<!-- 학과명, 학과 번호를 출력 -->
						<option value="0">학과명 선택</option>
						<c:forEach var="m" items="${requestScope.major }">
							<option value="${m.major_no }">${m.major_name }</option>
						</c:forEach>
					</select>
					<input type="text" name="score" placeholder="평점">
					<button>등록</button>
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="5">
				<input type="text" id="txtSearch" placeholder="검색어를 입력하세요">
				<button id="btnSearch">검색</button>
			</td>
		</tr>
		<tr>
			<th>학번</th>
			<th>이름</th>
			<th>학과번호</th>
			<th>평점</th>
			<th>비고</th>
		</tr>
		</thead>
		<tbody>
		<!-- 학생정보 출력 -->
		<c:forEach var="obj" items="${requestScope.list }">
			<tr>
				<td>${obj.sno }</td>
				<td>${obj.name}</td>
				<td>${obj.major }</td>
				<td>${obj.score }</td>
				<td><a href="delete.do?sno=${obj.sno }">삭제</a>
					/
					<a href="updateView.do?sno=${obj.sno }">수정</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>





