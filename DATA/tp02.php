<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <style>
            .erreur{
                color:#DD0000;
            }
            .resume{
                color:#008000;
            }
        </style>
    </head>
    <body>
       <?php
        // put your code here
                          @$nom=$_POST['nom'];;
                          @$prenom=$_POST['prenom'];
                          @$email=$_POST['email'];
                          @$mdp=$_POST['mdp'];
                          @$cmdp=$_POST['cmdp'];
                          @$valider=$_POST['valider'];
                          
         if(isset($valider)){
             if(empty($nom))
                 $msg='<div class="erreur">Nom obligatoire.</div>';
             elseif(empty($prenom))
                 $msg='<div class="erreur">Prenom obligatoire.</div>';
             elseif (empty($email))
                 $msg='<div class="erreur">Email obligatoire.</div>';
             elseif (empty($mdp))
                 $msg='<div class="erreur">mdp obligatoire.</div>';
                 elseif ($mdp!=$cmdp)
                 $msg='<div class="erreur">mdp non identique.</div>';
                 else{
                     $msg='<div class="resume"><strong>Infos transmises :</strong><br/>';
                     $msg.=ucfirst(strtolower($prenom)).' '.strtoupper($nom).'<br/>';
                     $msg.='Email: '.$email;
                     $msg.='<br/>';
                 }
             }
             
         

        ?>
        <main role=main">
            <div class="py-5 bg-light">
                <div class="container">
                    <div class="col-12 col-md-9 col-xl-8 py-md-3 pl-md-5 bd-content">
                        <div class="alert alert-info" role="alert">
                            <?php echo @$msg ?>
                        </div>
                        <form method="post" action="">
                            <div class="form-group">
                                <label for="nom">NOM </label>
                                <input type="text" class="form-control" name="nom" id="nom" value="<?php echo $nom ?>">
                                </div>
                            <div class="form-group">
                                <label for="prenom">PRENOM </label>
                                <input type="text" class="form-control" name="prenom" id="firstname" value="<?php echo $prenom?>">
                                </div>
                            <div class="form-group">
                                <label for="email">EMAIL </label>
                                <input type="text" class="form-control" name="email" id="email" value="<?php echo $email ?>">
                                </div>
                            <div class="form-group">
                                <label for="mdp">MDP </label>
                                <input type="password" class="form-control" name="mdp" id="mdp" value="<?php echo $mdp?>">
                                </div>
                            <div class="form-group">
                                <label for="cmdp">CONFIRMATON MDP </label>
                                <input type="password" class="form-control" name="cmdp" id="cmdp" value="<?php echo $cmdp?>">
                                </div>
                           
                            <button type="submit" class="btn btn-primary" name="valider" >Valider</button>
                        </form>
                    </div>
                </div>
            </div>
        </main>
            <!-- LIEN recupéré sur bootstarp -->                      
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </body>
</html>
