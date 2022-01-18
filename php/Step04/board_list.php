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
    header{
      width: 1200px;
      margin:0 auto;
      margin-top: 50px;
    }
    .my_info{
      width: 250px;
      float: right;
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
  </style>
</head>
<body>
  <?php
    session_start();
  ?>
    <header>
      <div class="my_info">
        <?=$_SESSION['name']?>님이 로그인 하셨습니다.<br>
        <a href="logout.php">로그아웃</a> <a href="member_view.php">내 정보 수정</a>
      </div>
    </header>
    <h2>게시판</h2>
    <table>
      <caption>
        <button class="btn_write">글쓰기</button>
      </caption>
      <tr>
        <th>글번호</th>
        <th>제목</th>
        <th>작성자</th>
        <th>작성일</th>
        <th>조회수</th>
        <th>좋아요</th>
        <th>싫어요</th>
      </tr>
      <!--  글목록 -->
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