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
public class N_PremierNombresEntiers_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        Scanner reader = new Scanner(System.in);
        int n, i;
        long produit;
        //CONSTANTES
        System.out.print("entrez le nombre entier:");
        n=reader.nextInt();
        produit=1;
        i=2;
        while(i<=n){
        produit = produit * i ;
        i++;}
        System.out.println("le nombre est:"+ produit);
        
    }
    
}
