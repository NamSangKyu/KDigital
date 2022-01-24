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
		$("#btnString").click(function() {
			$.ajax({
				url : "StringServlet",
				data : "data=test",
				type : "get",
				success : function(result) {
					$("#resultString").html(result);
					var arr = result.split(",");//, 으로 자르기
					for(i=0;i<arr.length;i++){
						$("#resultString").append("<p>" + arr[i] +"</p>");
					}
					
				}				
			});
		});
	});
</script>
</head>
<body>
<button id="btnString">문자열 데이터 Ajax 요청</button>
<hr>
<div id="resultString"></div>
</body>
</html>








