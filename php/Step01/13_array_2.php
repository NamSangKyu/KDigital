<?php
    $scores = array(87, 76, 98, 87, 87, 93, 79, 85, 88, 63,
                       74, 84, 93, 89, 63, 99, 81, 70, 80, 95);
		
    array_push($scores,100);
    $scores[] = 99;
    $sum = 0;
    for($a = 0; $a < sizeof($scores); $a++)
    {
				echo "$scores[$a]<br>";
        $sum = $sum + $scores[$a];  // 20명의 학생의 성적의 누적 합
    }
    
    $avg = $sum/20;				// 평균 구하기
                                // 줄 바꿈
    echo("합계 : $sum, 평균 : $avg");
?>