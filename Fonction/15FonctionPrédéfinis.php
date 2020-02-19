<?php

// AFFICHER INFOS PHP 
echo phpversion();
phpinfo();

// GENERER UN NOMBRE ALEATOIRE
echo rand()."<br/>";
echo rand(10,20)."<br/>";

// ARRONDIR UN NOMBRE DECIMAL
echo round(3.141592);
echo round(3.779592,2); // 2 chiifres apres la virgules

// CREER UN IDENTIFIANT UNIQUE
echo "id unique : ".uniqid().", ";
echo "id unique : ".uniqid().", ";
echo "id unique : ".uniqid();

// ENVOYER UN E-MAIL
$to = 'personne@example.com';
$subject = 'sujet';
$message = 'Bonjour à tous !';
$headers = 'From: webmaster@monsite.com'."\r\n".
        'Reply-To: webmaster@monsite.com'."\r\n".
        'MINE-Version: 1.0'."\r\n";
mail($to, $subject, $message, $headers);

// MAIL AU FORMAT HTML
$headers = 'From: webmaster@monsite.com'."\r\n".
        'Reply-To: webmaster@monsite.com'."\r\n".
        'MINE-Version: 1.0'."\r\n".
        'content-type: text/html; charset=utf-8'."\r\n";
