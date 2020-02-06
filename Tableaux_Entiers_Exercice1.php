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
        define('NB', 10); // const NB=10;
        $tableau1 = array();
        $tableau2 = array();
        $tableauSomme = array();
        
        for($i=1 ; $i<=NB ; $i++){ // tableau de 1 à 10
                $tableau1[$i]=$i;
        }
        for($i=1 ; $i<=NB ; $i++){ // tableau de 10 à 20 
            $tableau2[$i]=$i+NB;
        }
        for($i=1 ; $i<=NB ; $i++){ // tableau avec la somme des 2 autres
            $tableauSomme[$i]=$tableau1[$i] + $tableau2[$i];
        }
        // affichage des valeurs de la somme des 2 autres tableaux
        for ($i=1 ; $i<=NB ; $i++){
            echo $tableauSomme[$i]."<br>";
        }
       
        ?>
    </body>
</html>
