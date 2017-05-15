<?php
	$objConnect = mysql_connect("localhost","root","");
	$objDB = mysql_select_db("pfe");
        $agent=$_POST['agent'];
		$strSQL = "SELECT * FROM declaration  WHERE agent='$agent' or agent='tout' and servi='non'  ";
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