<?php
	$objConnect = mysql_connect("localhost","root","");
	$objDB = mysql_select_db("pfe");
    $nom=$_POST['nom'];
    $strSQL = "SELECT * from fichesante f where f.smedecin='$nom' and f.certification='non certifiee' ";
	$objQuery = mysql_query($strSQL);
	$intNumField = mysql_num_fields($objQuery);
	$resultArray = array();
	while($obResult = mysql_fetch_array($objQuery))
	{
		$arrCol = array();
		for($i=0;$i<$intNumField;$i++)
		{
			$arrCol[mysql_field_name($objQuery,$i)] = $obResult[$i];
		}
		array_push($resultArray,$arrCol);
	}
	
	mysql_close($objConnect);
	
	echo json_encode($resultArray);

?>