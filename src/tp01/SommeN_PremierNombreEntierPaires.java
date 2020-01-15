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
public class SommeN_PremierNombreEntierPaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //VARIABLES
        Scanner reader = new Scanner(System.in);
        int i , n , somme ; 
        //CONSTANTES
       System.out.print("Entrez le nombre entier:");
               n = reader.nextInt();
               somme=0;
               
               for(i=1 ; i<=n ; i++){
       somme = somme + i * 2;       
       }
       System.out.println("la somme vaut:" + somme );
               
    }
    
}
