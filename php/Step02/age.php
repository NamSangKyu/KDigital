<?php
  $age = $_GET['age'];
  $age = (int)$age;

  if($age  >= 20){ 
    //Step01 -> 10_for_quest_1.php
    echo "<script>location.href='/Step01/10_for_quest_1.php';</script>";
  }else{
    //Step02 -> 06_gcm.php
?>
    <script>
      location.href='/Step02/06_gcm.php';
    </script>
<?php
  }
?>