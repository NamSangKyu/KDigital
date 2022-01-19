<?php
  $bno = $_GET['bno'];

  $conn = mysqli_connect("localhost","root","123456","nam2626");

  $sql = "delete from board where bno=$bno";

  $result = mysqli_query($conn, $sql);

  if(!$result){
    echo "<script>alert(\"게시글 삭제 실패\");</script>";
  }
  else{
    echo "<script>alert(\"게시글 삭제 성공\");</script>";
  }
?>
<script>
  location.href="board_list.php";
</script>