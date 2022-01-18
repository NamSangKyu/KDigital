<?php
// 1. 아이디와 비밀번호를 post에서 받은 후
$id = $_POST['id'];
$pass = $_POST['pass'];
// 2. DB에서 member 테이블에서 아이디와 비밀번호로 조회
$conn = mysqli_connect("localhost","root","123456","nam2626");
$sql = "select * from member where mid like '$id' and passwd like '$pass'";
$result = mysqli_query($conn,$sql);

if(mysqli_num_rows($result)==0){
  // 3-2. 조회 결과가 없으면 '아이디와 비밀번호를 확인하세요' 경고창 출력후
  //    다시 login 페이지로 이동
  ?>
  <script>
    alert('아이디와 비밀번호를 확인하세요');
    history.back();
  </script>
  <?php
}else{
  // 3-1. 조회 결과 회원이 있으면 세션에 아이디(id)와 이름(name)을 저장
  //    저장 후 board_list.php로 페이지 이동
  $row = mysqli_fetch_array($result);
  $_SESSION['id'] = $row['mid'];
  $_SESSION['name'] = $row['name'];
  ?>
    <script>
      location.href='board_list.php';
    </script>
  <?php
}
?>