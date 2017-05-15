<?php
ini_set('sendmail_from', 'smtp.gmail.com'); 
$sujet = 'EMAIL';
$message = "Bonjour,Ceci est un message texte envoyé grâce à  php. merci :)";
$destinataire = 'spacelass@gmail.com';
$headers = "atoui.ilyes@gmail.com";
$headers .= "atoui.ilyes@gmail.com";
$headers .= "Content-Type: text/plain; charset=\"iso-8859-1\"";
if(mail($destinataire,$sujet,$message,$headers))
{
        echo "L'email a bien été envoyé.";
}
else
{
        echo "Une erreur c'est produite lors de l'envois de l'email.";
}
?>

