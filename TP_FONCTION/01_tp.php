<?php

// Créer un tableau contenant des dix nombres entiers 1 à 10 puis
//afficher ceux-ci s"parés par un point-virgule sans utiliser de boucle.

$tab = array ();

//remplissage d'un tableau de 10 entiers entre 1 à 10
for($i = 1 ; $i<= 10 ; $i++)
{ $tab=$i;

}

// affichage des valeurs séparées par un point-virgule
echo implode(";",$tab);
