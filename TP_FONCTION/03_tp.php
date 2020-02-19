<?php

// ecrire une fonction qui permet de calculer la factorielle d'un nombre de manière récursive.
// 7! = 1*2*3*4*5*6*7 , Rappel 0! = 1

function factorielle ($n)
{
    
    if ($n === 2 ){ // condition d'arret
        return 1 ; 
    }else{ 
        return $n*factorielle($n-1);

    }
    }

echo "la factorielle de 6 est de : " .factorielle(6);