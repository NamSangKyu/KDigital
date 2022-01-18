<header>
      <div class="my_info">
        <?=$_SESSION['name']?>님이 로그인 하셨습니다.<br>
        <a href="logout.php">로그아웃</a> <a href="member_view.php">내 정보 수정</a>
      </div>
</header>
<style>
  header{
    width: 1200px;
    margin:0 auto;
    margin-top: 50px;
    text-align: right;
  }
  .my_info{
    display: inline-block;
  }
</style>