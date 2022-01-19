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
      $(".btn_search").click(function(){
        location.href="board_list.php?search="+$(".txt_search").val();
      });
      $(".btn_all").click(function(){
        location.href="board_list.php";
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
        <button class="btn_all">전체 게시글</button>
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
        $search = "";
        if(isset($_GET['search'])){
          $search = " where title like '%{$_GET['search']}%'";
        }
        $conn = mysqli_connect("localhost","root","123456","nam2626");
        $sql = "select * from board $search order by bno desc";
        $result = mysqli_query($conn, $sql);

        $page = 1;
        if(isset($_GET['page'])) $page = $_GET['page'];
        $page_line = 10;
        $page_block = 5;
        $count = mysqli_num_rows($result);
        $pages = ceil($count / $page_line);
        $page_first = 0;
        if($count > 0) $page_first = $page_line * ($page-1);
        $page_last = $page_line * $page -1;
        if($page_last >= $count) $page_last = $count - 1;
        for($i=$page_first;$i <= $page_last;$i++){
          mysqli_data_seek($result, $i);
          $row = mysqli_fetch_array($result);
      ?>
        <tr>
          <td><?=$row['bno']?></td>
          <td class="title"><a href="board_view.php?bno=<?=$row['bno']?>"><?=$row['title']?></a></td>
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
      <?php
        $blocks = ceil($pages/$page_block);
        $block = ceil($page/$page_block);

        $page_s = $page_block * ($block -1) + 1;
        $page_e = $page_block * $block;

        if($blocks <= $block) $page_e = $pages;

        $search = "";
        if(isset($_GET['search'])){
          $search = "search=".$_GET['search'];
        }  

        if($block > 1){
          $temp = $page_s-1;
          echo "<a href='board_list.php?page=$temp&$search'><<</a>";
        }
        for($i=$page_s;$i<=$page_e;$i++){
          if($i == $page)
            echo "<b>$page</b>&nbsp;";
          else
            echo "<a href='board_list.php?page=$i&$search'>[$i]</a>&nbsp;";

        }
        if($block < $blocks){
          $temp = $page_e+1;
          echo "<a href='board_list.php?page=$temp&$search'>>></a>";
        }
        
        
      ?>
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