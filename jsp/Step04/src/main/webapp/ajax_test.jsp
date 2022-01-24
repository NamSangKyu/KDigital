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
		
		$("#btnAjax").click(function() {
			$.ajax({
				url:"JsonServlet",
				data : "data=json",
				type : "post",
				dataType:"json",
				success : function(r) {
					//json을 문자열로 변경
					$("#resultJson").html(JSON.stringify(r));
					//단일값 출력
					$("#resultJson").append("<p>"+r.result+"</p>");
					$("#resultJson").append("<p>"+r.param+"</p>");
					//배열 출력
					for(i=0;i<r.arr.length;i++){
						$("#resultJson").append("<p>"+r.arr[i]+"</p>");
					}
				}
			})
		});		
	});
</script>
</head>
<body>
<button id="btnString">문자열 데이터 Ajax 요청</button>
<hr>
<div id="resultString"></div>
<hr>
<button id="btnAjax">json 데이터 Ajax 요청</button>
<hr>
<div id="resultJson"></div>
</body>
</html>








