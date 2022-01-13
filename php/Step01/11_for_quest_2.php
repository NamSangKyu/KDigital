<?php
  echo "<table border='1'>";
  echo "<tr align='center'><td width='150'>야드</td><td width='150'>미터</td></tr>";
  for($yard = 10 ; $yard <= 300; $yard+=10){
    $meter = $yard * 0.9144;
    echo "<tr align='center'>";
    echo "<td>$yard</td><td>$meter</td>";
    echo "</tr>";
  }
  echo "</table>";
?>