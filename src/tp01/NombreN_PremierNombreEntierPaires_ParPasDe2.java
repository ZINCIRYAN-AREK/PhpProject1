/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class NombreN_PremierNombreEntierPaires_ParPasDe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        Scanner reader = new Scanner(System.in);
        int i , n , somme ; 
        //CONSTANTES
       System.out.print("Entrez le nombre entier n :");
               n = reader.nextInt();
               //CALCUL DE LA SOMME
               somme=0;
               
               for(i=2 ; i<=2*n ; i=i+2){
       somme = somme + i ;       
       }
        //AFFICHAGE DU RESULTAT       
       System.out.println("la somme vaut:" + somme );
        
    }
    
}
