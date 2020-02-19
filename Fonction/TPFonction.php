<?php

function ajouter($parametre1, $parametre2)
{
    return $parametre1 + $parametre2 ; 
}

function soustraire($parametre1, $parametre2)
{
    return $parametre1 - $parametre2 ; 
}

function operation($type_operation,$valeur1, $valeur2)
{
    return $type_operation($valeur1, $valeur2);
}
echo "6 + 4 = " .operation('ajouter', 6, 4). "<br/>";
echo "6 - 4 = " .operation('soustraire', 6, 4). "<br/>";

