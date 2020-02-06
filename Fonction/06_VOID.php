<?php

function echange( &$a , &$b): void{
   if ($a === $b ){
       return;
   }
   $temp = $a ; 
   $a = $b ; 
   $b = $temp ; 
}
 $x = 1 ;
 $y = 2 ;        


var_dump(echange($x , $y), $x , $y); // appel de la fonction echange
