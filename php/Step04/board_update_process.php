<?php
$title = $_POST['title'];
$bno = $_POST['bno'];
$content = $_POST['content'];

$sql = "update board set title = '$title', content = '$content' where bno = $bno";

$conn = mysqli_connect("localhost","root","123456","nam2626");

$result = mysqli_query($conn, $sql);

if(!$result)
  echo "<script>alert('게시글 수정 실패');location.href='board_list.php';</script>";
else
  echo "<script>alert('게시글 수정 성공');location.href='board_view.php?bno=$bno';</script>";
?>
