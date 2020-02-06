<?php

declare(strict_types=1);

//déclaration d'une fonction retournant un type entier
function affiche(): int{
        return "1";
}

try{
       affiche();
} catch (TypeError $e) {
    echo($e->getMessage());
}