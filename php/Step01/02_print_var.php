<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>php 출력</title>
</head>
<body>
<?php
  $name = "홍길동";
  $age = 20;
?>
  <table border="1">
    <tr>
      <th>이름</th>
      <th>나이</th>
    </tr>
    <tr>
      <td><?=$name?></td>
      <td><?=$age?></td>
    </tr>
  </table>
</body>
</html>