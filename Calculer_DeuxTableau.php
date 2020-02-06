<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        // put your code here
        $tableau0 = array (6,25,35,61);
        $tableau1 = array (12,24,46);
        $somme = 0 ;// initialisation de la variable somme
        $nb_tableau0=count($tableau0); // taille de tableau 0
        $nb_tableau1=count($tableau1); // taille de tableau 1
        for($i=0 ; $i<$nb_tableau0 ; $i++){
            for($j=0 ; $j<$nb_tableau1 ; $j++){
                $somme =$somme + $tableau0[$i] * $tableau1[$j];
            }
             }   
             
             echo' la valeur S est = '.$somme;
                      
        ?>
    </body>
</html>
