<?php
  /*
    member_view에서 보낸 데이터를 받아서
    member 테이블의 내용을 update
  */
  $mid = $_POST['mid'];
  $passwd = $_POST['passwd'];
  $name = $_POST['name'];
  $tel = $_POST['tel'];
  $birth = $_POST['birth'];
  $gender = $_POST['gender'];

  $conn = mysqli_connect('localhost','root','123456','nam2626');
  $sql = "update member set passwd='$passwd',name='$name', ";
  $sql .= "tel='$tel',birth='$birth',gender=$gender where mid like '$mid'";

  $result = mysqli_query($conn, $sql);
  if($result > 0){
    //이름 최신화
    session_start();
    $_SESSION['name']=$name; 
    echo "<script>alert('회원정보 수정 완료');location.href='board_list.php'</script>";
  }else
    echo "<script>alert('회원정보 수정 실패');history.back();</script>";
?>