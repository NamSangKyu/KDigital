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
	//form.jsp에서 보낸 data를 정수형 변수 end에 저장
	String data = request.getParameter("data");
	int end = Integer.parseInt(data);
	
	for(int i=1;i<=end;i++){
%>
		<p><%=i %></p>
<%
	}
%>
</body>
</html>







