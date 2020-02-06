<?php

//TABLEAUX NUMERIQUES
$tableau = array ('Jean', 'Robert', 'Paul','Joe', 'Alain');
//echo $tableau[0];

//Remplacer Robert par Nadia
$tableau[1]= 'Nadia' ;

//création tableau vide et affectation de valeurs
$tableau= array() ;
$tableau[0]= 'Jean';
$tableau[1]= 'Robert' ;
$tableau[2]= 'Paul' ;
$tableau[3]= 'Joe' ;
$tableau[4]= 'Alain' ;

//autre syntaxe

$tableau= array() ;
$tableau[]= 'Jean' ;
$tableau[]= 'Robert';
$tableau[]= 'Paul' ;
$tableau[]= 'Joe' ;
$tableau[]= 'Alain' ;

//autre syntaxe

$tableau= ['Jean', 'Robert', 'Paul', 'Joe' , 'Alain'] ;

//2 Tableaux associatifs
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');

// Autre syntaxe

$tableau = array() ;
$tableau ['A1'] = 'Jean';
$tableau ['B4']='Robert';
$tableau [3]='Paul';
$tableau ['Toto']= 'Joe';      
$tableau ['H1']= 'Alain';

//Pertinence des clés
$personne=array();
$personne ['Nom'] = 'Martin';
$personne ['Prenom']= 'Monique' ;
$personne ['Age']= 50;
echo 'Age : ' .$personne ['Age'] .'<br>';

    //3 CONSTANTES DE TYPE TABLEAU
const COULEURS = array('rouge', 'vert', 'noir') ;
echo COULEURS [1] .'<br>';

define ('COLORS', array(
        'rouge',
        'vert',
        'noir',
    ));
echo COLORS [1] .'<br>';


//4 PARCOURS D'UN TABLEAU
//
// BOUCLE FOR
//
// création du tableau"

$tableau = array ('Jean', 'Robert', 'Paul', 'Joe', 'Alain');
//boucle sur le tableau
for ($i=0; $i<5; $i++) {
    echo $tableau [$i] .'<br>';
}

//AVEC LA FONCTION COUNT() OU SIZEOF()
//création du tableau
$tableau = array ('Jean', 'Robert', 'Paul', 'Joe', 'Alain');
//boucle du tableau
for ($i=0; $i<sizeof($tableau); $i++) {
   //affichage des valeurs du tableau concaténées
    //avec un saut de ligne
    echo $tableau [$i] .'<br>';
}

//BOUCLE foreach
//création du tableau
//création du tableau
$tableau = array ('Jean', 'Robert', 'Paul', 'Joe', 'Alain');
//boucle sur le tableau
foreach ($tableau as $val) {
    //affichage des valeurs deu tableau concaténées
    //avec un saut de ligne
    echo $val.'<br>';
}

//Affichage des clés
//création du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
//boucle sur le tableau
foreach ($tableau as $key =>$val) {
    echo 'Clé : ' .$key. ', valeur : ' .$val.'<br>';
}
//Affichage des valeurs
//création du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
foreach ($tableau as $val) {
    //affichage des valeurs deu tableau concaténées
    //avec un saut de ligne
    echo 'Valeur : ' .$val.'<br>';
}

//Depusi PHP 7 foreach travaille sur une copie du tableau
// le pointeur du tableau n'est plus modifié pendant son parcours
//reste modifiable s'il est passé par référence
$tab = [0];
foreach ($tab as &$val){
    var_dump ($val);
    $tab[1]=1;
}

//LA FONCTION print_r
//création tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
print_r($tableau);

