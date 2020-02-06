<?php

// déclration d'une fonction retournant un type trig ou null
// et prenant en paramètre un type string ou null
// 'il y a une erreur car ce n'est pas la bonne version php (7 au lieu de 7.1)'
function test(?string $name): ?string {  
    return $name;
    
}

var_dump (test(null)); // appel de la fonction avec NULL
echo"<br/>";
var_dump(test("Bonjour")); // appel de la fonction avec une chaine decaractères