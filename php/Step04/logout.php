<?php
  session_start();
  session_destroy();
?>
<script>
  alert("로그아웃 완료");
  location.href="login.php";
</script>