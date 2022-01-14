<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>파일전송 폼</title>
</head>
<body>
	<form action="file.php" method="post" enctype="multipart/form-data">
		<input type="file" name="userfile[]"><br>
		<input type="file" name="userfile[]"><br>
		<input type="file" name="userfile[]"><br>
		<input type="file" name="userfile[]"><br>
		<input type="file" name="userfile[]"><br>
		<input type="submit" value="전송">	
	</form>
</body>
</html>