<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생정보관리페이지</title>
<style>
	*{
		margin:0;
		padding:0;
	}
	form{
		width : 400px;
		padding:10px;
		border:1px solid black;
		margin: 150px auto;
	}
	input{
		width: 100%;
		padding:5px;
		font-size: 20px;
		border-radius: 5px;
		box-sizing: border-box;
		border:1px solid #e9e9e9;
		margin-bottom: 10px;
	}	
	button{
		width: 100%;
		font-size: 20px;
		background-color: skyblue;
		padding:5px 0px;
		border:1px solid blue;
		border-radius: 5px;
	}
	h2{
		text-align: center;
		padding: 10px 0px;		
	}
</style>
</head>
<body>
	<form action="login.do" method="post">
		<h2>학적관리 시스템 로그인</h2>
		<input type='text' name="sno" id="sno" placeholder="학번 입력하세요">
		<input type='text' name="name" id="name" placeholder="이름 입력하세요">
		<button>로그인</button>
	</form>
</body>
</html>

