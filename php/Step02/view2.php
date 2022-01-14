<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <?php
    $id = $_POST['id'];
    $pass = $_POST['pass'];
  ?>
  <ul>
    <li>아이디 : <?=$id?></li>
    <li>암호 : <?=$pass?></li>
  </ul>
</body>
</html>