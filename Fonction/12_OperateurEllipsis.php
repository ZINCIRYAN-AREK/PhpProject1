<?php

// fonction avec un nombre quelconque de paramètres
function fonction_variable(...$parametres)
{
    echo "Le nombre de parametres est : ".count($parametres)."<br/>";
    // transformation du tableau en chaine de caractères
            echo "Les valeurs sont : ".implode("",$parametres)."<br/>";
}

// Appel de la fonction
fonction_variable('Tigre');
fonction_variable('Tigre','Lion');
fonction_variable('Tigre','Lion','leopard');

// fonction de concaténation avec trois paramètres
function concatenation($a, $b, $c)
{
    return $a." ".$b." ".$c."<br/>";
}

//affichage du retour de la fonction de concaténation
echo concatenation('Mouton','Lion','Tigre');

$tableau1 = ['Lion','Tigre'];
//affichage du retour de la fonction de concaténation
echo concatenation('Mouton',...$tableau1);

//affichage du retour de la fonction de concatenation
echo concatenation('Mouton',...['Lion','Tigre']);