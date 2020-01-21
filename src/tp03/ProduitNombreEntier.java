/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class ProduitNombreEntier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);
         // EXERCICE FAIRE UNE FONCTION
        // int n , i ;
        //long produit; 
        //System.out.print("Donnez la valeur de n : ");
        //n=reader.nextInt();
        //produit= 1 ;
        
        //for(i=2 ; i <= n ; i++){
        //produit = produit *i;
        //}
        //System.out.println("Le produit vaut : " + produit);
        
        // SOLUTIONS , CORRECTION
        // VARIABLES
         
    int x , res ;
    System.out.print ("Entrez un entier :");
    x=reader.nextInt();
    // APPEL DE LA FONCTION
    res = factorielle(x);
    affiche();
    System.out.println ("Le factoriel est :" + factorielle (+res));
    affiche();
    }
    public static int factorielle (int n) {
        int fact=1;
        for (int i=2; i<=n; i++){
        fact=fact*i;
    }
        return fact;
}
    public static void affiche(){
    System.out.println("********************************");}
}
