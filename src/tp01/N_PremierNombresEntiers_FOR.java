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
public class N_PremierNombresEntiers_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int i , n ;
        long  produit ;
        
        produit =1;
        System.out.print("entrez un nombre entier:");
        n = reader.nextInt();
        
        for(i=2 ; i<=n ; i++){
       produit = produit * i;       
       }
       System.out.println("la somme vaut:" + produit );
    }
    
}
