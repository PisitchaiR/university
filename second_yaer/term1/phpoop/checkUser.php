<?php

include_once('connect.object.php');

$emailcheck = new DB_con();


$umail = $_POST['email'];

$sql = $emailcheck->emailavailable($umail);

$num = mysqli_num_rows($sql);

echo $num;

if($num > 0){
    echo "<span style='color: red;'>Username aleady associated with another account.</span>";
    echo "<span>$('#submit').prop('disabled', true);</span>";
}else{
    echo "<span style='color: green;'>Username aleady available for registration</span>";
    echo "<span>$('#submit').prop('disabled', false);</span>";
}

?>