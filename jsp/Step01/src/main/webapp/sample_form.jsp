<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- action은 서블릿의 @WebServlet 값과 동일하게 맞춤 -->
	<form action="SampleServlet">
		<input type="text" name="data"><button>전송</button>
	</form>
</body>
</html>