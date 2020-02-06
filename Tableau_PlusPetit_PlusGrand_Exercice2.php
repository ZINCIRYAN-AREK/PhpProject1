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
        
        
        $tableau = array();
        for($i=1 ; $i<=100 ; $i++){// tableau de 1à 100
            $tableau1[$i] = rand(1,100);
        }
        sort ($tableau);
        $valeurs = implode (";",$tableau1);
        echo " Les valeurs sont : ".$valeurs;
        ?>
    </body>
</html>
