<?php
    $str = " Hello PHP world ";
	
	print $str."<br>";
	print mb_substr($str, 0, 5)."<br>";
	
	if(mb_strpos($str, "PHP"))
		print "PHP 문자열이 있음<br>";
	else 
		print "PHP 문자열이 없음<br>";
	
	print str_replace("PHP", "***", $str)."<br>";
	print "문자열 양쪽 공백 제거전 개수 : ".strlen($str)."<br>";
	print "문자열 양쪽 공백 제거후 개수 : ".strlen(trim($str))."<br>";
?>

