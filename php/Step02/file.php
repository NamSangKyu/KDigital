<meta charset="utf-8">
<?php
$uploaddir = 'uploads1/';

echo '<pre>';
if(!is_dir($uploaddir)){
	mkdir($uploaddir);
	echo "폴더 생성 완료";
	
}

for($i=0;$i<count($_FILES['userfile']['name']);$i++){
   if($_FILES['userfile']['name'][$i]=='')
            continue;	

	$uploadfile = $uploaddir . basename($_FILES['userfile']['name'][$i]);
//	$uploadfile = iconv("UTF-8", "EUC-KR", $uploadfile); 

	if (move_uploaded_file($_FILES['userfile']['tmp_name'][$i], $uploadfile)) {
		echo "파일이 성공적으로 전송 되었습니다.\n";
	} else {
		echo "파일 전송에 문제가!\n";
	}
}
echo '자세한 디버깅 정보입니다:';
print_r($_FILES);

print "</pre>";
?>