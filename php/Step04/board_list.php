<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>게시판</title>
  <style>
    *{
      margin:0;
      padding:0;
    }
    h2{
      width: 1200px;
      text-align: center;
      margin: 0 auto;
      clear: both;
    }
    table{
      border-collapse: collapse;
      width: 1200px;
      margin:0 auto;
      table-layout: fixed;
    }
    td,th{
      border:1px solid #e9e9e9;
      padding:5px 0px;
      text-align: center;
    }
    th{
      background-color: #c9c9c9;
    }
    caption{
      text-align: right;
    }
    .title{
      width: 600px;
      overflow: hidden;
      text-overflow: ellipsis;
      white-space: nowrap;
    }
  </style>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script>
    $(function(){
      $(".btn_write").click(function(){
        location.href="board_write.php";
      });
    });
  </script>
</head>
<body>
  <?php
    session_start();
    require 'header.php';
  ?>
    
    <h2>게시판</h2>
    <table>
      <caption>
        <button class="btn_write">글쓰기</button>
      </caption>
      <tr>
        <th>글번호</th>
        <th class="title">제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
        <th>좋아요</th>
        <th>싫어요</th>
      </tr>
      <!--  글목록 -->
      <?php
        $conn = mysqli_connect("localhost","root","123456","nam2626");
        $sql = "select * from board order by bno desc";
        $result = mysqli_query($conn, $sql);

        while($row = mysqli_fetch_array($result)){
      ?>
        <tr>
          <td><?=$row['bno']?></td>
          <td class="title"><?=$row['title']?></td>
          <td><?=$row['writer']?></td>
          <td><?=$row['wdate']?></td>
          <td><?=$row['bcount']?></td>
          <td><?=$row['blike']?></td>
          <td><?=$row['bhate']?></td>
        </tr>
      <?php  
        }
      ?>
      <tr>
          <td colspan="7" class="pagging_bar">
            <!--페이징-->
          </td>
      </tr>
      <tr>
          <td colspan="7">
            <!--검색창-->
            <input type="text" class="txt_search">
            <button class="btn_search">검색</button>
          </td>
      </tr>
    </table>
</body>
</html>