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
		$("#time").html((new Date()).toLocaleString());//페이지가 새로 로드되는지 확인
		$("#btnSearch").click(function() {
			/* var data = "search="+$("input[name=search]").val();
			data += "&kind="+$("select[name=kind]").val(); */
			var data = $("#frm_search").serialize();
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
		$("#btnRegister").click(function() {
			var data = $("#frm_register").serialize();
			$.ajax({
				url : "RegisterServlet",
				data : data,
				type: "post",
				dataType : "json",
				success : function(r) {
					
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
	<form id="frm_search">
		<select name="kind">
			<option value="id">아이디</option>
			<option value="name">이름</option>
		</select>
		<input type="text" name="search" placeholder="검색어 입력">
		<button id="btnSearch" type="button">조회</button>
	</form>
	<form id="frm_register">
		<input type="text" name="id" placeholder="아이디를 입력하세요">
		<input type="password" name="passwd" placeholder="암호를 입력하세요">
		<input type="text" name="name" placeholder="이름을 입력하세요">
		<input type="text" name="age" placeholder="나이를 입력하세요">
		<button id="btnRegister" type="button">등록</button>
	</form>
	<hr>
	<div id="time"></div>
	<hr>
	<div id="searchResult"></div>
</body>
</html>








