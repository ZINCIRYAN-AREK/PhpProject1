<?php

function Multiplier($a,$b)
{
    if (!is_numeric($a) || !is_numeric($b))
    {
        throw new Exception ('Les deux parametres doivent etre des nombres');
    }
    return $a * $b ;
}

try  // essaie des instructions situées dans ce bloc.
{
    echo Multiplier(10,3).'<br/>';
    echo Multiplier('Bonjour',20);
}
catch (Exception $e) // exception levée.
{
    echo'une exception s\'est produite. Message d\'erreur :',
            $e -> getMessage();
}
finally {
    echo'<br/>';
    echo'Fin'; // fin du script.
}