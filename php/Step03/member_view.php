<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원정보</title>
</head>
<body>
  <?php
    $mid = $_GET['mid'];

    $conn = mysqli_connect("localhost","root","123456","nam2626");
    $sql = "select * from member where mid like '$mid'";
    $result = mysqli_query($conn,$sql);
    if(!$result)
      echo "회원정보가 없습니다.";
    else{
      $row = mysqli_fetch_array($result);
  ?>
      <form action="" method="post">
      아이디 : <input type="text" name="mid" value="<?=$row['mid']?>"><br>
      암호 : <input type="password" name="passwd"><br>
      이름 : <input type="text" name="name" value="<?=$row['name']?>"><br>
      생년월일 : <input type="date" name="birth" value="<?=$row['birth']?>"><br>
      연락처 : <input type="text" name="tel" value="<?=$row['tel']?>"><br>
      성별 : <input type="radio" name="gender" value="0" 
      <?=$row['gender']==1?'checked':'' ?>>남
      <input type="radio" name="gender" value="1"
      <?=$row['gender']==0?'checked':'' ?>>여<br>
      <button>수정</button><a href="">삭제</a><a href="member_list.php">목록</a>
    </form>
  <?php
    }
  ?>
</body>
</html>