<?php

// déclaration de la fonction anonyme
$func_anonymous = function ()
{
    echo'<p>Bonjour !</p>';
};
// execution de la fonction anonyme
$func_anonymous();

// déclaration de la fonction anonyme
$func_anonymous = function ($parametre)
{
    echo"<p>Bonjour".$parametre."!</p>";
};

// exécution dela fonction anonyme
$func_anonymous("Robert");


// déclaration du tableau 
$data = array('tigre','lion','leopard');
// appel de la fonction array_walk
array_walk($data, function (&$item){
    // passage par référence pour modifier les valeurs du tableau 
    $item = ucwords($item);//mise en majuscule de la première lettre
});
// affichage du tableau modifié
var_dump($data);

$nom = 'Robert';
//déclaration des fonctions
$fonction1 = function () {
    echo "<p> Bonjour, ".$nom." ! </p>";
};

$fonction2 = function () use ($nom) {
    echo "<p> Bonjour, ".$nom." ! </p>";   
};
$fonction1();//sans le mot-clé use
$fonction2();//avec le mot-clé use

//fonctions dynamiques interdites
$func = 'func_num_args';
$func();
