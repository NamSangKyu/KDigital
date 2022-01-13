<?php
  $child_fee = 5000;
  $adult_fee = 8000;
  $num_child = 3;
  $num_adult = 2;

  $total_fee = $child_fee * $num_child + $adult_fee * $num_adult;
  echo "전체 입장료 {$total_fee}원";
?>