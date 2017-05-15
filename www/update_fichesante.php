<?php
mysql_connect("localhost","root","");
mysql_select_db("pfe");
$email=$_POST['email'];
$sname=$_POST['sname'];
$snassurance=$_POST['snassurance'];
$sdonorgane=$_POST['sdonorgane'];
$stypesang=$_POST['stypesang'];
$stypeassurence=$_POST['stypeassurence'];
$spathologie1=$_POST['spathologie1'];
$spathologie2=$_POST['spathologie2'];
$sallergie1=$_POST['sallergie1'];
$sallergie2=$_POST['sallergie2'];
$santfamil1=$_POST['santfamil1'];
$santfamil2=$_POST['santfamil2'];
$straitement=$_POST['straitement'];
$certification=$_POST['certification'];

$sql =mysql_query("UPDATE fichesante SET certification='$certification', sallergie1='$sallergie1',
	sallergie2='$sallergie2',santfamil1='$santfamil1',santfamil2='$santfamil2',sdonorgane='$sdonorgane',sname='$sname',
	snassurance='$snassurance',spathologie1='$spathologie1',spathologie2='$spathologie2',straitement='$straitement',stypeassurence='$stypeassurence',stypesang='$stypesang' WHERE email='$email' ");

                  
mysql_close();
?>