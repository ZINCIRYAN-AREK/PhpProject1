<?php


// Créer un tableau contenant dix chiffres aléatoires entre 1 à 100 puis trier celui-ci 
// sans utiliser les méthodes de tri de tableau comme sort(). Il faudra créer une fonction 
// pour échanger deux valeurs dans un tableau. Afficher ces valeurs séparées par une virgule.


// creation du tableau
$tab = array();
define('nb',10);

//remplissage
for($i = 1 ; $i <=nb ; $i++){
    $tab[$i]=rand(1,100);
}


for($nbr = nb ; $nbr > 1 ; $nbr--){
 // recherche du max
    $max = 1 ;
    for($i = 2; $i <= $nbr ; $i++ ){
    if ($tab[$i] > $tab[$max]){
    $max = $i;
        }
    }
// permuter le max avec le dernier élément
    permuter ($tab, $max, $nbr);
}
// affichage des valeurs séparées par un point-virgule
echo implode(",",$tab);
// fonction pour permuter deux valeurs dans un tableau
function permuter (&$tab, $i , $j){
    $tmp = $tab[$i];
    $tab[$i] = $tab[$j];
    $tab[$j] = $tmp ;
}