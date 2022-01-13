<table border='1'>
<tr>
<th width='100'>인치</th><th width='100'>센티미터</th>
</tr>
<?php
$inch = 10;
while ($inch <= 100) {
	$cm = $inch * 2.54;
?>
	<tr align='center'><td><?=$inch?></td><td><?=$cm?></td></tr>
<?php
	$inch = $inch + 10;
}
?>
</table>