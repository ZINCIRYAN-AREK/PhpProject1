/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Test_InverserElements_Tableau_Correction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        // CONSTANTES
            final int n=10 ; 
        // VARIABLES
            int i , tmp ;
            //DECLARATION TABLEAU
        int[] tab;
        //CREATION TABLEAU
        tab = new int[n];
        // LECTURE DU TABLEAU
        for ( i=0 ; i < n ; i++){
        System.out.print("saisir une valeur:");
        tab[i]=reader.nextInt();
        }
        // REVERSE
        for (i=0 ; i < n/2 ; i++) {
        tmp=tab[i];
        tab[i]=tab[n-i-1];
        tab[n-i-1]=tmp;
        }
        // AFFICHAGE TABLEAU MODIFIE
         for ( i = 0 ; i < n ; i++){
 
       System.out.print (tab[i] + "");

   }
    }
    
}
