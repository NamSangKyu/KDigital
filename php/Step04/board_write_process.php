<?php
  $title = $_POST['title'];
  $content = $_POST['content'];
  $content = str_replace('\n','<br>',$content);
  $writer = $_POST['writer'];


  $sql = "insert into board(title, content, writer) ";
  $sql .= "values('$title','$content','$writer')";

  $conn = mysqli_connect("localhost","root","123456","nam2626");

  $result = mysqli_query($conn, $sql);

  if($result == 1)
    echo "<script>location.href='board_list.php';</script>";
  else
    echo "<script>alert('글쓰기 실패');history.back();</script>";
?>