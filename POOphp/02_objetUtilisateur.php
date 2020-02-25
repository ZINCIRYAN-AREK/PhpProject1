<?php
// récupère le fichier en question.
include ('01_utilisateur.class.php');

//Créer un nouvel utilisateur John Doe.
$moi = new utilisateur ('John','Doe');

//Afficher ses informations.
echo $moi->informations()."<br/>";
//echo "{$moi->informations()}<br/>";

//changer la langue en anglais
$moi->setLangue('english');
echo "{$moi->informations()}<br/>";

//transformer son nom en majuscule
$moi->setNom(strtoupper($moi->getNom()));
echo $moi->getNom()."<br/>";

//Créer une instance anonyme de la classe utilisateur (victor hugo)
$informations = ( new utilisateur('victor', 'hugo'))->informations(); 
echo"$informations <br/>";

// Afficher la variable $moi
echo "$moi<br/>" ; 