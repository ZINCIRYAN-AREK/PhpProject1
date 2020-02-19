<?php

ob_start(); /* On initialise le tampon.*/

/* 1ère façon d'ajouter du texte au buffer : */
echo '1er texte dans le buffer <br/>';
?>
<!--2ème façon d'ajouter du texte au buffer : -->
<p>2ème texte dans le buffer.</p>

<?php
ob_end_flush(); /* On vide le tampon et on retourne le contenu au navigateur */
?>