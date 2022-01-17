<?php
  $mid = $_POST['mid'];
  $passwd = $_POST['passwd'];
  $name = $_POST['name'];
  $tel = $_POST['tel'];
  $birth = $_POST['birth'];
  $gender = $_POST['gender'];

  //DB 접속                     접속주소    아이디  암호     사용할DB
  $connection = mysqli_connect('localhost','root','123456','nam2626');
  //SQL문 작성
  $sql = 'insert into member(mid,passwd,name,tel,birth,gender) ';
  $sql .= "values('$mid','$passwd','$name','$tel','$birth',$gender)";
  //SQL문 실행
  $result = mysqli_query($connection, $sql);
  echo $result;

  //close
  mysqli_close($connection);


?>