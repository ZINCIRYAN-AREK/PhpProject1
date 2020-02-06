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
        $tab_caracteristique_dupont = array("prénom"=>"PAUL",
                                            "profession"=>"ministre",
                                            "age"=> 50); 
        $tab_caracteristique_durand = array ("prénom"=>"ROBERT",
                                             "profession"=>"agriculteur",
                                             "age"=>45);
        $tab_personne['DUPONT'] = $tab_caracteristique_dupont;
        $tab_personne['DURAND'] = $tab_caracteristique_durand;
        
        var_dump($tab_personne);

               echo'<table border>';
               echo'<thead><tr><th>';
               echo'Clé';
               echo'</th><th colspan="2">';
               echo'Valeur';
               echo'</th></tr></thead>';
               
              foreach ($tab_personne as $cle => $val){
                  //$cle correspond a DUPOND ou DURAND
                  $nombre_ligne = count($val)+1; // nombre de lignes à afficher = nombre d'éléments dans le tableau
                        
               
               echo'<tr><td rowspan="'.$nombre_ligne.'">';
               echo $cle;
               echo'</td>';
               echo'<td>Clé</td><td>Valeur</td></tr>';
               // Boucle sur le tableau $val correspondant à $tab_caracteristique_dupont ou $tab_caracteristique_durand
               foreach($val as $cle2 => $val2){
                   echo'<tr>';
                   echo'<td>'.$cle2.'</td>';
                   echo'<td>'.$val2.'</td>';
                   echo'</tr>';
                    } 
               }
               echo'</table>';
               
               ?>
        
   
    </body>
</html>
