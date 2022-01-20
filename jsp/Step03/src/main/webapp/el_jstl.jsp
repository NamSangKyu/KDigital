<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el, jstl</title>
</head>
<body>
	<h2>el 태그 테스트</h2>
	<p>request에 저장된 내용은 requestScope를 사용</p>
	<p>name : ${requestScope.name}</p>
	<p>age : ${requestScope.age}</p>
	<p>session에 저장된 내용은 sessionScope를 사용</p>
	<p>msg : ${sessionScope.msg }</p>
	<p>${requestScope.age + 10 },${requestScope.age - 10 },
	${requestScope.age * 2 },${requestScope.age / 5 }</p>
	<h2>jstl 테스트</h2>
	<!-- set : 변수 만들어서 데이터 초기화 -->
	<c:set var="tnum" value="1000"/>
	<p>set - tnum변수 내용 출력 : ${tnum }</p>
	<!-- out : 데이터 출력 -->
	<p><c:out value="${tnum}"/></p>
	<!-- if문 test 속성이 조건식, else, else if는 없음 -->
	<c:if test="${requestScope.age < 20 }">
		<p>미성년자 입니다.</p>
	</c:if>
	<!-- 여러개의 조건문이 필요한 경우 -->
	<h3>조건문이 여러개인 경우</h3>
	<c:choose>
		<c:when test="${requestScope.age < 11 }">
			<p>10세 이하 아동입니다.</p>
		</c:when>
		<c:when test="${requestScope.age < 20 }">
			<p>10대 청소년 입니다.</p>
		</c:when>
		<c:otherwise>
			<p>성인입니다.</p>
		</c:otherwise>
	</c:choose>
	<!-- 반복문 -->
	<h2>반복문</h2>
	<p>
		<c:forEach var="i" begin="1" end="10">
			${i} 
		</c:forEach>
	</p>
	<p>
		<c:forEach var="i" begin="1" end="10" step="2">
			${i} 
		</c:forEach>
	</p>
	<p>
		<c:forEach var="m" items="${requestScope.hobby }">
			${m } 
		</c:forEach>
	</p>
</body>
</html>










