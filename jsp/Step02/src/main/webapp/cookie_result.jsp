<%@page import="java.net.CookieManager"%>
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
		//전체 쿠키 읽어옴
		Cookie[] cookies = request.getCookies();
		
		for(int i=0;i<cookies.length;i++){
			%>
				<%=cookies[i].getName() %> : <%=cookies[i].getValue() %><br>			
			<%
		}
	%><%=session.getId() %>
</body>
</html>







