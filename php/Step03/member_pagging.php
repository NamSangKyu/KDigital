<?php
  $conn = mysqli_connect('localhost','root','123456','nam2626');
  $sql = 'select * from member';
  $result = mysqli_query($conn,$sql);

  if(!$result)
    echo "데이터 없음";
  else{
    echo "<table><tr><th>아이디</th><th>암호</th><th>이름</th><th>생년월일</th><th>연락처</th><th>성별</th></tr>";
    
    //페이지 번호 셋팅
    $page = 1;
    if(isset($_GET['age'])) $page = $_GET['age'];
    $page_line = 10; //한 페이지에 나타낼 데이터 개수
    $page_block = 5; //한번에 나타낼 페이지 번호 개수
    //전체 데이터 개수
    $count = mysqli_num_rows($result);
    //전체 페이지 개수
    $pages = ceil($count / $page_line);
    //현재 페이지의 첫번째 데이터 번호
    $page_first = 0;
    if($count > 0) $page_first = $page_line * ($page-1);
    //현재 페이지의 마지막 데이터 번호
    $page_last = $page_line * $page - 1;

    for($i=$page_first;$i <= $page_last;$i++){
      mysqli_data_seek($result,$i);
      $row = mysqli_fetch_array($result);
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
