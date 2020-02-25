<?php
//Créer une classe utilisateur structurée avec 4champs : nom, prenom, langue='french', timestamp.
class utilisateur {
                    private $nom;
                    private $prenom;
                    private $langue = 'french';
                    private $timestamp;       
                            


//constructeur paramétré recevant le nom et prenom, le timestamp sera valorisé avec l'heure courante.
public function __construct($prenom,$nom){
        $this -> nom = $nom;
        $this -> prenom = $prenom;
        $this -> timestamp = time();
}

// Ecrire le destructeur affichant un message "suppression de xxx" xxx 
// étant le nom utilisateur.
public function __destruct() {
   echo "<p><strong>suppression de $this->nom</strong></p>" ;
   
}
 
// Ecrire la méthode __toString qui doit retourner ue chaine constituée 
// du nom et prenom separés par un tiret.
public function __toString() {
    return "__toString = $this->nom - $this->prenom" ;
}

//Doter la classe des méthodes getNom(), setNom() et setLangue().
public function getNom(){
    return $this->nom;
}
public function setNom($nom){
    $this->nom =$nom;
}
public function setLangue($langue){
    $this->langue = $langue;
}

//Ecrire une méthode privée miseEnFormeTimeStamp() retournant une chaine 
//représentant le timestamp mis en forme en se basant sur la configuration locale (voir strftime()) 
private function  miseEnFormeTimeStamp(){
    setlocale(LC_TIME, $this->langue);
    return strftime('%c',$this->timestamp);
}

// Ecrire une méthode informations() retournant le nom, prenom 
// et instant de création de l'objet utilisateur en mémoire.
public function informations(){
    $creation = $this->miseEnformeTimeStamp();
    return "$this->prenom $this->nom - $creation";       
}


}                  
                            
