<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <style>
    *{
      margin:0;
      padding: 0;
    }
    h2{
      text-align: center;
    }
    table{
      width: 800px;
      margin:0 auto;
    }
    th{
      width: 100px;
      text-align: right;
      vertical-align: top;
    }
    input,textarea{
      width: 100%;
      border-radius: 5px;
      padding: 5px;
      box-sizing: border-box;
    }
    textarea{
      height: 300px;
    }
    button{
      padding:10px 20px;
      background-color: #e9e9e9;
      color:black;
      font-weight: bold;
      border:none;
      border-radius: 5px;
    }
    button:hover{
      background-color: #c9c9c9;
    }
    button:active{
      background-color: white;
    }
    .form_footer{
      text-align: right;
    }
  </style>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script>
    $(function(){
      $(".btn_cancel").click(function(){
        history.back();
      });
    });
  </script>
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
 
  <form action="board_update_process.php" method="post">
    <table>
      <caption>
        <h2>게시판 글쓰기 페이지</h2>
      </caption>
      <tr>
        <th>제목</th>
        <td><input type="text" name="title" placeholder="제목을 입력하세요" value="<?=$row['title']?>"></td>
      </tr>
      <tr>
        <th>내용</th>
        <td>
          <textarea name="content" id="content" placeholder="내용을 입력하세요"><?=$row['content']?></textarea>
        </td>
      </tr>
      <tr>
        <td colspan="2" class="form_footer">
          <button>수정</button>
          <button class="btn_cancel" type="button">취소</button>
        </td>
      </tr>
    </table>
    <input type="hidden" name="bno" value="<?=$_GET['bno']?>">
  </form>

</body>
</html>







