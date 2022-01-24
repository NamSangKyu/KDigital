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
			/* var data = "search="+$("input[name=search]").val();
			data += "&kind="+$("select[name=kind]").val(); */
			var data = $("form").serialize();
			console.log(data);
			$.ajax({
				url : "MemberListServlet",
				data : data,
				dataType:"json",
				type:"post",
				success:function(r){
					$("#searchResult").html(JSON.stringify(r));
					var table = "<table><tr><th>아이디</th>"
					 + "<th>비밀번호</th><th>이름</th><th>나이</th></tr>";
					for(i=0;i<r.length;i++){
						table += "<tr>";
						table += "<td>"+r[i].id+"</td>";
						table += "<td>"+r[i].passwd+"</td>";
						table += "<td>"+r[i].name+"</td>";
						table += "<td>"+r[i].age+"</td>";
						table += "</tr>";
					}
					table += "</table>";
					$("#searchResult").html(table);
					
				}
			});
		});
	});
</script>
<style type="text/css">
	table{
		border-collapse: collapse;
		margin:0 auto;
	}
	td, th{
		border:1px solid black;
		text-align: center;
		padding: 10px 20px;
	}
	
</style>
</head>
<body>
	<form>
		<select name="kind">
			<option value="id">아이디</option>
			<option value="name">이름</option>
		</select>
		<input type="text" name="search" placeholder="검색어 입력">
		<button id="btnSearch" type="button">조회</button>
		<hr>
		<div id="time"></div>
	</form>
	<hr>
	<div id="searchResult"></div>
</body>
</html>








