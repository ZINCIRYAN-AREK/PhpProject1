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
echo ' Age : ' .$personne ['Age'] .' <br> ';

    //3 CONSTANTES DE TYPE TABLEAU
const COULEURS = array('rouge', 'vert', 'noir') ;
echo COULEURS [1] . ' <br> ';

define ('COLORS', array(
        'rouge',
        'vert',
        'noir',
    ));
echo COLORS [1] . ' <br> ';


//4 PARCOURS D'UN TABLEAU
//
// BOUCLE FOR
//
// création du tableau"

$tableau = array ('Jean', 'Robert', 'Paul', 'Joe', 'Alain');
//boucle sur le tableau
for ($i=0; $i<5; $i++) {
    echo $tableau [$i] . ' <br> ';
}

//AVEC LA FONCTION COUNT() OU SIZEOF()
//création du tableau
$tableau = array ('Jean', 'Robert', 'Paul', 'Joe', 'Alain');
//boucle du tableau
for ($i=0; $i<sizeof($tableau); $i++) {
   //affichage des valeurs du tableau concaténées
    //avec un saut de ligne
    echo $tableau [$i] . ' <br> ';
}

//BOUCLE foreach
//création du tableau
//création du tableau
$tableau = array ('Jean', 'Robert', 'Paul', 'Joe', 'Alain');
//boucle sur le tableau
foreach ($tableau as $val) {
    //affichage des valeurs deu tableau concaténées
    //avec un saut de ligne
    echo $val. ' <br> ';
}

//Affichage des clés
//création du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
//boucle sur le tableau
foreach ($tableau as $key =>$val) {
    echo ' Clé : ' .$key. ', valeur : ' .$val.'<br>';
}
//Affichage des valeurs
//création du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
foreach ($tableau as $val) {
    //affichage des valeurs deu tableau concaténées
    //avec un saut de ligne
    echo ' Valeur : ' .$val.'<br>';
}

//Depusi PHP 7 foreach travaille sur une copie du tableau
// le pointeur du tableau n'est plus modifié pendant son parcours
//reste modifiable s'il est passé pa rréférence
$tab = [0];
foreach ($tab as &$val){
    var_dump ($val);
    $tab[1]=1;
}

//LA FONCTION print_r
//création tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
print_r($tableau);

// 5 fonctions sur les tableaux

// a longueur d'un tableau'
// création du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
$taille = count ($tableau);
echo ' La taille du tableau est : '.$taille;

// B existant 
//creation du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
if (in_array( 'Robert' , $tableau)){
echo ' Robert est dans le tableau';
}

// 3eme param : false par defaut (ne tient pas compte du type) 
// creation du tableau
$tableau = array('10','33','55','78');
if (in_array('33', $tableau , true)){   // true pour tenir compte du type
    echo ' <br> Le 33 se trouve dans le tableau ';
}else{
    echo '<br> Le 33 ne se trouve pas dans le tableau ';
}


// C existant d'une clé
//creation du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
if (array_key_exists( 3, $tableau)){
    echo '<br> La clé " 3 " est dans le tableau ';
}else{
    echo'<br> La clé " 3 " ne se trouve pas dans le tableau';
}


//creation du tableau
$tableau = array ('Jean','Robert','Paul','Joe','Alain');
if (array_key_exists( 4 , $tableau )){
    echo '<br> La valeur de la quatrieme clé est : ' .$tableau[4];
}


// D tri d'un tableau

//sort(): trie les valeurs de la plus petite à la plus grande
// creation du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
sort($tableau); // tri du tableau
foreach($tableau as $cle=>$valeur){
    echo'<br> clé :'.$cle.', valeur :'.$valeur.'<br />';
}


//asort(): trie les valeurs de la plus petite à la plus grande avec preservation de la clé
// creation du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
asort($tableau); // tri du tableau avec preservation de la clé
foreach($tableau as $cle=>$valeur){
    echo'<br>clé :'.$cle.', valeur :'.$valeur.'<br />';
}

//rsort(): trie les valeurs de la plus grandes à la plus petite
//creation du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
rsort($tableau); // tri du tableau plus grand au plus petit
foreach($tableau as $cle=>$valeur){
    echo'<br>clé :'.$cle.', valeur :'.$valeur.'<br />';
}


//arsort(): trie les valeurs de la plus grande à la plus petite avec préservation de la clé
// creation du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
arsort($tableau); // tri du tableau suvant la clé
foreach($tableau as $cle=>$valeur){
    echo'<br>clé :'.$cle.', valeur :'.$valeur.'<br />';
}


// krsort():trie les clé du tableau de la plus grande a la plus petite avec preservation de la clé
//creation du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
ksort($tableau); // tri du tableau descendant de la clé
foreach($tableau as $cle=>$valeur){
    echo'<br>clé :'.$cle.', valeur :'.$valeur.'<br />';
}


//array_search() est une fonction equivalente à in_array(). Elle permet de reconnaitre
//tableau mais elle renvoie la clé de l'élément recherche.
//creation du tableau
$tableau = array ('A1' => 'Jean', 'B4'=> 'Robert', 3=> 'Paul', 'Toto' =>'Joe', 'H' =>'Alain');
$cle_element = array_search('Robert',$tableau);
    echo '<br> La clé de l`élément recherché est :' .$cle_element;

    
// autre exmple
//creation du tableau
$tableau = array ('Jean','Robert','Paul','Joe','Alain');
$cle_element = array_search('Robert', $tableau);
    echo'<br> La clé de l`élément est :' .$cle_element;
    

// f decouper une chaine dans un tableu

// explode() permet de découper une chaine dans un tableau en utilisant un séparateur
$ensemble = "1;2;3;4;5";
$tableau = explode(";",$ensemble);
echo'<br> La premier valeur du tableau est : '.$tableau[0]."<br />";
echo'<br> La derniere valeur du tableau est : '.$tableau[count($tableau)-1];


$ensemble = "1-2-3-4-5";
$tableau = explode("-",$ensemble);
echo"<br>les valeur du tableau sont : ";
foreach($tableau as $valeur){
 echo $valeur.";" ;
}

// G regrouper les valeurs d'un tableau dans une chaine

// implode() permet de regrouper les valeurs d'un tableau dans une chaine en utilisant un séparateur
$tableau = array("Jean","Robert","Paul");
$noms = implode(" ; ",$tableau);

    echo '<br> Les noms sont : ' .$noms ;    

// H decouper une chaine en morceaux de longueur fixe

//str_split() permet de decouper une chaine en morceaux de longueur fixe dans 
//parametre indiquant la taille des morceaux de chaine.

$ensemble = "1;2;3;4;5" ;    
$tableau = str_split($ensemble,2);
echo'<br> Les éléments sont :';
foreach($tableau as $valeur ){
    echo $valeur." ";
}


// I ajouter des éléments à la fn du tableau
//array_push() permet d'ajouter un ou plusieurs éléments à la fin du tableau
$tableau = array("Jean","Robert","Paul");
array_push($tableau,"Joe","Alain");
echo $tableau[4];

// J suppression d'un élément à la fin du tableau

$tableau = array("Jean","Robert","Paul");
$nom = array_pop($tableau);
echo " Le nom suprimé est : " .$nom;

$tableau = array("Jean","Robert","Paul");



    
?>