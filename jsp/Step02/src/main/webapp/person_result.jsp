<%@page import="person.PersonDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		PersonDTO p = (PersonDTO)request.getAttribute("person"); 
	%>
	이름 : <%=p.getName() %><br>
	나이 : <%=p.getAge() %>
</body>
</html>