<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>로그인</title>
<?php
  if(isset($_SESSION['id'])){
?>
    <script>location.href = 'board_list.php';</script>
<?php
  }
?>
</head>
<body>
  <form action="login_process.php" method="post">
    <label for="id">아이디</label> <input type="text" name="id" id="id"><br>
    <label for="pass">암호</label> <input type="password" name="pass" id="pass"><br>
    <button>로그인</button> <a href="member_insert.html">회원가입</a>
  </form>
</body>
</html>