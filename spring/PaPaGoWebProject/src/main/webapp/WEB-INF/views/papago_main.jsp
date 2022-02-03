<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파파고</title>
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
			<textarea name="result" id="result"></textarea>			
		</article>
		<button id="btn_translate">>></button>
	</section>
</body>
</html>






