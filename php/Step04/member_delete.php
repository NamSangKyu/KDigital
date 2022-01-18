<?php
  session_start();
  $mid = $_SESSION['id'];

  $conn = mysqli_connect('localhost','root','123456','nam2626');
  $sql = "delete from member where mid like '$mid'";
  $result = mysqli_query($conn,$sql);
  if($result > 0)
    echo "<script>alert('삭제완료');location.href='login.php';</script>";
  else
    echo "<script>alert('삭제실패');history.back();</script>";
?>