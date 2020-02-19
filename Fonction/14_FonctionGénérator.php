<?php

// EXEMPLE 1
// déclaration d'une fonction générant les chiffres de 1 à 5
function boucle_yield(){
    for ($i = 1 ; $i <= 5 ; $i++){
        // $i est préservé entre chaque production de valeur.
        yield $i;
    }
}
// appel de la fonction
$generateur = boucle_yield();
// affichage des valeurs 
foreach($generateur as $val) {
    echo $val." ";
}


// EXEMPLE 2
// déclaration d'une fonction générant les carrés des nombres reçus
function carre($a) {
    foreach ($a as $val) yield $val*$val;
}
//déclaration d'un tableau de nombres
$arr = array(5, 8, 15, 35);
//affichage des carrés des valeurs du tableau
foreach (carre($arr) as $val) {
    echo $val," ";
}

