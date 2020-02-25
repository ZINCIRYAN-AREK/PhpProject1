<?php

function cube ($n)
{
    $res = $n**3;
    //$res = pow($n,3);
    return $res;
}

define('nb',20);
for( $i = 1 ; $i <= nb/2 ; $i++){
    $A[$i]=rand(1,nb);
}
var_dump($A);
$B = array();
$compteur = 0 ; 
for($i = 1 ; $i<=nb ; $i++){
    if (! in_array($i,$A)){
        $compteur++;
        $B[$compteur]=$i;
    }
}

ob_start();
echo "<table border>" ;
echo "<tr><td>valeur</td><td>cube</td></tr>";
foreach ($B as $val){
    echo"<tr><td>".$val."</td><td>".cube($val)."</td></tr>";
}
echo"</table>";
ob_end_flush();