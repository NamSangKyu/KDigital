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
    if(isset($_GET['page'])) $page = $_GET['page'];
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
    if($page_last > $count) $page_last = $count-1;

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
?>
  <tr>
    <td colspan="6">
<?php
  //페이지 번호 출력
  //전체 페이지 번호 그룹 개수
  $blocks = ceil($pages/$page_block);
  //현재 페이지 그룹 번호
  $block = ceil($page/$page_block);
  //현재 페이지 그룹의 시작 번호
  $page_s = $page_block * ($block-1) + 1;
  //현재 페이지 그룹의 마지막 번호
  $page_e = $page_block * $block;
  if($blocks <= $block) $page_e = $pages;
  //이전 페이지 그룹으로가는 화살표
  if($block > 1){
    $temp = $page_s-1;
    echo "<a href='member_pagging.php?page=$temp'><<</a>";
  }
  //페이지 번호 출력
  for($i=$page_s;$i<=$page_e;$i++){
    if($i == $page)
    echo "<b>$page</b>&nbsp;";
    else
    echo "<a href='member_pagging.php?page=$i'>[$i]</a>&nbsp;";
  }
  //다음 페이지 그룹으로 가는 화살표
  if($block < $blocks){
    $temp = $page_e+1;
    echo "<a href='member_pagging.php?page=$temp'>>></a>";
  }

?>
    </td>
  </tr>
<?php
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
