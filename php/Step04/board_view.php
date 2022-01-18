<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판</title>
</head>
<body>
  <?php
    session_start();
    require 'header.php';

    $bno = $_GET['bno'];
    $conn = mysqli_connect("localhost","root","123456","nam2626");
    $sql = "select * from board where bno = $bno";
    $result = mysqli_query($conn,$sql);

    $row = mysqli_fetch_array($result);

  ?>
  <h2>게시글 정보</h2>
  <table>
    <tr>
      <td colspan="5"><?=$row['title']?></td>
    </tr>
    <tr>
      <td>작성자 : <?=$row['writer']?></td>
      <td>작성일 : <?=$row['wdate']?></td>
      <td>조회수 : <?=$row['bcount']?></td>
      <td>좋아요 : <?=$row['blike']?></td>
      <td>싫어요 : <?=$row['bhate']?></td>
    </tr>
    <tr>
      <td colspan="5"><?=$row['content']?></td>
    </tr>
    <tr>
      <td colspan="5">
        <button class='btn_update'>수정</button>
        <button class='btn_delete'>삭제</button>
        <button class='btn_back'>뒤로가기</button>
      </td>
    </tr>
  </table>
</body>
</html>