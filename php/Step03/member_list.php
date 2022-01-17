<?php
  $conn = mysqli_connect('localhost','root','123456','nam2626');
  $sql = 'select * from member';
  $result = mysqli_query($conn,$sql);

  if(!$result)
    echo "데이터 없음";
  else{
    echo "<table><tr><th>아이디</th><th>암호</th><th>이름</th><th>생년월일</th><th>연락처</th><th>성별</th></tr>";
    
    while($row = mysqli_fetch_array($result)){
?>
      <tr>
      <td>
        <a href="member_view.php?mid=<?=$row['mid']?>"><?=$row['mid']?></a>
      </td>
      <td><?=$row['passwd']?></td>
      <td><?=$row['name']?></td>
      <td><?=$row['birth']?></td>
      <td><?=$row['tel']?></td>
      <td><?=$row['gender']?></td>
      </tr>
<?php
    }
    echo "</table>";
  }

  mysqli_close($conn);
?>
<style>
  table{
    border-collapse: collapse;
  }
  td,th{
    border:1px solid black;
    padding: 5px 10px;
  }
</style>
