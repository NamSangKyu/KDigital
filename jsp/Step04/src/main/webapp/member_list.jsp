<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	$(function() {
		$("#btnSearch").click(function() {
			$.ajax({
				url : "MemberListServlet",
				dataType:"json",
				type:"post",
				success:function(r){
					
				}
			});
		});
	});
</script>
</head>
<body>
	<button id="btnSearch">조회</button>
	<hr>
	<div id="searchResult"></div>
</body>
</html>








