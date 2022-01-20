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
</body>
</html>





