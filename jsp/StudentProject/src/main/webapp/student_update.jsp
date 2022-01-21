<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 수정 페이지</title>
<style type="text/css">
	h2{
		text-align: center;
	}
</style>
</head>
<body>
	<h2>학생정보 수정</h2>
	<form action="UpdateServlet">
		<input type="text" name="sno" placeholder="학번" value="${requestScope.obj.sno }" readonly>
		<input type="text" name="name" placeholder="이름" value="${requestScope.obj.name }">
		<select name="major">
			<!-- 학과명, 학과 번호를 출력 -->
			<option value="0">학과명 선택</option>
			<c:forEach var="m" items="${requestScope.major }">
				<c:if test="${m.major_no == requestScope.obj.major }">
					<option value="${m.major_no }" selected>${m.major_name }</option>
				</c:if>
				<c:if test="${m.major_no != requestScope.obj.major }">
					<option value="${m.major_no }">${m.major_name }</option>
				</c:if>
			</c:forEach>
		</select>
		<input type="text" name="score" placeholder="평점" value="${requestScope.obj.score }">
		<button>등록</button>
	</form>
</body>
</html>