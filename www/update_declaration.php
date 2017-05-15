<?php
mysql_connect("localhost","root","");
mysql_select_db("pfe");
$email=$_POST['email'];
$nom=$_POST['nom'];
$sql =mysql_query("UPDATE declaration SET updated_at=NOW(),nom_agent='$nom', servi='oui' WHERE email='$email' ");

                  
mysql_close();
?>