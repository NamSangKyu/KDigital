<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		margin:0 auto;
		table-layout: fixed;
		border-collapse: collapse;
	}
	
	th, td{
		text-align: center;
		border :1px solid black;
		padding:10px;
	}
	th{
		background-color: #e9e9e9;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".btnDelete").click(function() {
			var td = $(this).parent().parent().find("td:first");
			//alert($(td).text());
			location.href='delete.do?id='+$(td).text().trim();
		});
		$(".btnUpdate").click(function() {
			var td = $(this).parent().parent().find("td:first");
			location.href='updateView.do?id='+$(td).text().trim();
		});
		$("#btnSearch").click(function(){
			var data = "search="+$("#txtSearch").val();
			$.ajax({
				url : "search.do",
				data : data,
				type : "get",
				dataType:"json",
				success:function(r){
					for(i=0;i<r.length;i++)
						console.log(r[i]);
				}
			});
		});
	});
	
</script>

</head>
<body>
	<table>
		<tr>
			<td colspan="5">
				<form action="insert.do">
					<input type="text" name="id">
					<input type="password" name="passwd">
					<input type="text" name="name">
					<input type="text" name="age"><button>추가</button>
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="5">
					<input type="text" id="txtSearch">
					<button id="btnSearch">검색</button>
			</td>
		</tr>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>나이</th>
			<th>작업</th>
		</tr>
		<c:forEach var="obj" items="${requestScope.list }">
			<tr>
				<td>${obj.id }</td>
				<td>${obj.passwd }</td>
				<td>${obj.name }</td>
				<td>${obj.age }</td>
				<td>
					<button class="btnUpdate">수정</button> / <button class="btnDelete">삭제</button> 
				</td>	
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>








