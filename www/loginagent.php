<?php

  mysql_connect("localhost","root","");
  $db= mysql_select_db("pfe");
 
$nom = $_POST['email'];
$password = $_POST['password'];
$job = $_POST['job'];

if($job=="policier"){
$sql = "select * from policier where nom='$nom' and password='$password' ";
 
$res = mysql_query($sql);

 $count = mysql_num_rows($res);
 
 if($count > 0){
print json_encode(1);
}else{
print json_encode(0);
}
}

if($job=="pompier"){
$sql = "select * from pompier where nom='$nom' and password='$password' ";
 
$res = mysql_query($sql);

 $count = mysql_num_rows($res);
 
 if($count > 0){
print json_encode(2);
}else{
print json_encode(3);
}

}

if($job=="medecin"){
$sql = "select * from medecin where nom='$nom' and password='$password' ";
 
$res = mysql_query($sql);

 $count = mysql_num_rows($res);
 
 if($count > 0){
print json_encode(6);
}else{
print json_encode(7);
}

}

if($job=="ambulancier"){
$sql = "select * from ambulancier where nom='$nom' and password='$password' ";
 
$res = mysql_query($sql);

 $count = mysql_num_rows($res);
 
 if($count > 0){
print json_encode(4);
}else{
print json_encode(5);
}

}


mysql_close();
?>	