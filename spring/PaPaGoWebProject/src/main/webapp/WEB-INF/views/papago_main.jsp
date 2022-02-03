<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파파고</title>
<style>
	*{
		margin:0;
		padding:0;
		font-size : 18px;
	}
	section{
		position: relative;
		width: 800px;
		margin: 0 auto;
		text-align: center;
	}
	article{
		width: 400px;
		padding: 10px 60px;
		box-sizing: border-box;
		float: left;
	}
	select{
		padding:15px 30px;
	}
	h1,h2{
		font-size: 24px;
		padding:20px 0px;
		text-align: center;
	}
	textarea {
		width: 100%;
		padding: 10px;
		box-sizing: border-box;
		height: 500px;
		resize: none;
	}
	article:first-child{
		border-right : 2px solid gray;
	}
	#btn_translate{
		width: 50px;
		height: 50px;
		background-color: black;
		color : white;
		font-weight: bolid;
		border-radius: 25px;
		position :relative;
		top : -400px;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	$(function() {
		$("#btn_translate").click(function() {
			var data = "source="+$("#source").val()+
					"&text="+$("#text").val()+"&target="+$("#target").val();
			$.ajax({
				data :data,
				url : "translate.do",
				type: "get",
				success:function(r){
					$("#result").val(r);
				}
			})
		});
	});
</script>
</head>
<body>
	<h1>파파고 번역 페이지</h1>
	<section>
		<article>
			<select name="source" id="source">
				<option value="ko">한국어</option>
				<option value="en">영어</option>
				<option value="de">독일어</option>
				<option value="ja">일본어</option>
				<option value="zh-CN">중국어</option>
			</select>
			<h2>번역할 내용</h2>
			<textarea name="text" id="text"></textarea>			
		</article>
		<article>
			<select name="target" id="target">
				<option value="ko">한국어</option>
				<option value="en">영어</option>
				<option value="de">독일어</option>
				<option value="ja">일본어</option>
				<option value="zh-CN">중국어</option>
			</select>
			<h2>번역된 내용</h2>
			<textarea name="result" id="result" readonly></textarea>			
		</article>
		<button id="btn_translate">>></button>
	</section>
</body>
</html>






