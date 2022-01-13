<?php
  for($i=1;$i<11;$i++){
    echo "{$i}!=";
    $n = 1;
    for($j=1;$j<=$i;$j++){
      $n *= $j;
    }
    echo "$n <br>";
  }
?>