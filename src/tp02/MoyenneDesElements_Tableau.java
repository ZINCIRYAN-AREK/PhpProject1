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
public class MoyenneDesElements_Tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONSTANTES
       Scanner reader = new Scanner(System.in);
        final int n=10;
        //VARIABLES
        int somme , i ;
        double moyenne;
        //DECLARATION TABLEAU
        int[] tab;
        //CREATION TABLEAU
        tab = new int[n];
        // LECTURE TABLEAU
        for ( i=0 ; i < n ; i++){
        System.out.print("saisir une valeur:");
        tab[i]=reader.nextInt();
        }
        //CALCULE ET AFFICHAGE DE LA MOYENNE
        somme = 0;
        for( i=0; i < n ; i++){
        somme = somme + tab[i] ;
        }
        moyenne = (double) somme / n ;
        System.out.println("la moyenne vaut:" + moyenne);
    }
    
}
