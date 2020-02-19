<?php

/*$tab =array();
define('nb',5);

//remplissage
for($i = 1 ; $i <=nb ; $i++){
    $tab[$i]=rand(0,4);
}

function aléatoire ($a)
{
    $tab = array_rand();
    return $a;
}

echo "".aléatoire('salut','toi','string','vache','bleu');*/

$input = array("Neo", "Morpheus", "Trinity", "Cypher", "Tank");
$rand_keys = array_rand($input, 5);
echo $input[$rand_keys[0][1][2][3][4]]. "\n";
