<?php

// Premier cas 
function affiche_mot($nom){
    echo $nom;
}

affiche_mot("Bonjour"); //affiche Bonjour
echo $nom; //erreur car $nom n'est pas définis 





// Deuxieme cas 
$nom = "Jean";
function affiche_mot1($nom){
    echo $nom;
}
affiche_mot1 ("Bonjour"); // affiche Bonjour
echo $nom; // affiche Jean



// Troisieme cas
$prenom = "Jean";
function affiche_mot2(){
    echo $prenom ; // affiche une erreur
}
affiche_mot2();