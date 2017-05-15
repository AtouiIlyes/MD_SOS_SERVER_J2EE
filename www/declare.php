<?php
mysql_connect("localhost","root","");
mysql_select_db("pfe");
$email=$_POST['email'];
$agent=$_POST['agent'];
$danger=$_POST['danger'];
$latitude=$_POST['latitude'];
$longitude=$_POST['longitude'];
$adresse=$_POST['adresse'];

mysql_query("INSERT INTO declaration  VALUES ('', '$adresse','$agent',NOW(), '$danger','$email', '$latitude', '$longitude', '', 'non',NULL)");
mysql_close();
?>