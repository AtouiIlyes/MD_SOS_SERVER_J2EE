<?php
mysql_connect("localhost","root","");
mysql_select_db("pfe");
$email=$_POST['email'];
$name=$_POST['name'];
$numero=$_POST['numero'];
$message=$_POST['message'];

mysql_query("INSERT INTO sms  VALUES ('', '$email','$message','$name', '$numero')");
mysql_close();
?>