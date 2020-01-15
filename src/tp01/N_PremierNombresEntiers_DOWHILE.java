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
public class N_PremierNombresEntiers_DOWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        Scanner reader = new Scanner(System.in);
        int i , n ;
        long produit ; 
        //CONSTANTES
         produit = 1;
        i=1;
         System.out.print("entrez le nomre entier:");
        n = reader.nextInt();
       
        do { produit = produit * i;
        i++ ; }
        
         while(i<=n);
        
        System.out.println("le produit est :"+ produit);
        
        
    }
    
}
