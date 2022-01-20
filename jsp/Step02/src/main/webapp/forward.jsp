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
	//url에 데이터가 없기 때문에 null을 반환
	String data = request.getParameter("data");
	
	//request 영역에 저장한 데이터
	String attr = (String)request.getAttribute("data");
%>
클라이언트가 전송한 데이터 : <%=data %><br>
request영역에 있는 데이터 : <%=attr %>
</body>
</html>






