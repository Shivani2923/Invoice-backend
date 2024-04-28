<!DOCTYPE html>
<html>
<head>
<title>Prime Number Checker (Call by Value)</title>
</head>
<body>
<h2>Check if a Number is Prime (Call by Value)</h2>
<form method="post" action="">
Enter a number: <input type="text" name="number"><br><br>
<input type="submit" name="submit" value="Check Prime">
</form>
<br>

<?php
function is_prime_value($num) {
if($num <= 1) {
return false;
}
for($i = 2; $i <= sqrt($num); $i++) {
if($num % $i == 0) {
EX NO: 04
DATE: FUNCTIONS

SWETHA M 714022104160
return false;
}
}
return true;
}

if(isset($_POST['submit'])) {
$number = isset($_POST['number']) ? $_POST['number'] : null;
$number = intval($number); // Convert to integer

if(is_numeric($number)) {
echo "Number: $number <br>";
echo "Is Prime? ";
echo is_prime_value($number) ? "Yes" : "No";
} else {
echo "Please enter a valid number.";
}
}
?>
</body>
</html>