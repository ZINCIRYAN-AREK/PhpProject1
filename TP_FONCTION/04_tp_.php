<?php

// creation d'un tableau remplis de mot et générer aléatoirement 

$tab = ["alo" , "bonjour" , "merhaba"];
make_sentence($tab);

function make_sentence($tab){
    shuffle($tab);
    echo implode(' ',$tab).'<br/>';
}

