<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
  <?php
    session_start();
    require 'header.php';
    $bno = $_GET['bno'];
    $conn = mysqli_connect("localhost","root","123456","nam2626");
    $sql = "select * from board where bno = $bno";
    $result = mysqli_query($conn,$sql);

    $row = mysqli_fetch_array($result);

  ?>
  <h2>게시글 정보</h2>
  <table>
    <tr>
      <td colspan="5"><?=$row['title']?></td>
    </tr>
    <tr>
      <td>작성자 : <?=$row['writer']?></td>
      <td>작성일 : <?=$row['wdate']?></td>
      <td>조회수 : <?=$row['bcount']?></td>
      <td>좋아요 : <?=$row['blike']?></td>
      <td>싫어요 : <?=$row['bhate']?></td>
    </tr>
    <tr>
      <td colspan="5"><?=$row['content']?></td>
    </tr>
    <tr>
      <td colspan="5">
        <?php
          if($row['writer']==$_SESSION['id']){
        ?>
        <button class='btn_update'>수정</button>
        <button class='btn_delete'>삭제</button>
        <?php
          }
        ?>
        <button class='btn_back'>뒤로가기</button>
      </td>
    </tr>
  </table>
  <?php
    //게시글 번호를 사용하여 해당 게시글의 조회수를 증가
    //한번만 실행 ----> 새로고침을 했을때 조회수 증가를 막아야됨
    //세션에 방문한 게시글 번호를 저장 ---> 세션에 해당 정보가 있으면 더이상 올라가지 않게끔
    
    //세션에 페이지를 저장할 배열이 있는지 확인 ---> 없으면 배열을 생성
    if(!isset($_SESSION['board'])){
      $_SESSION['board'] = array(-1);
    }
    //print_r($_SESSION['board']);
    //방문한 적이 있는지 세션에 있는 board 배열에 체크 --> 값이 없으면 false 리턴
    //미리 -1을 넣어놨기 때문에 0 인덱스 번호가 나올일이 없다
    if(!array_search($bno,$_SESSION['board'])){
      $sql = "update board set bcount = bcount + 1 where bno = $bno";
      mysqli_query($conn,$sql);
      array_push($_SESSION['board'],$bno);//세션에 방문한 글번호 추가
    }
  ?>
  <script>
    $(function(){
      //뒤로가기 버튼 처리
      $(".btn_back").click(function(){
        history.back();
      });
      <?php
      if($row['writer']==$_SESSION['id']){
      ?>
      //삭제 버튼 처리 ---> board_delete_process.php, 삭제할 글번호
      $(".btn_delete").click(function(){
        location.href = "board_delete_process.php?bno=<?=$_GET['bno']?>";
      });
      <?php
      }
      ?>
    });
  </script>
</body>
</html>