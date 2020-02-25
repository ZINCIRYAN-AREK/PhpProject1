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
        if(isset($_GET['nom']) && isset($_GET['prenom'])){
        echo "Le nom reçus est : " .$_GET['nom']."<br/>";
        echo "Le prenom reçus est : " .$_GET['prenom']. "<br/>";
       }else{
           echo "Nom et/ou prenom non renseignés<br/>";
       }
       
       //Deux paramètres identiques : le premier est écrasé 
       echo "Le prénom reçus est : ".$_GET['prenom']."<br/>";
       
       // Tableau de données
       if (isset($_GET['donnee'])){
       foreach($_GET['donnee'] as $val){
           echo $val." ";
       }
       }
       
        ?>
    
       
         
    </body>
</html>
