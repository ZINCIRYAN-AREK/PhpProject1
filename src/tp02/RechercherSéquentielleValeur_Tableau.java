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
public class RechercherSéquentielleValeur_Tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // CONSTANTES
        final int n = 10;
        // VARIABLES
        int i , val , occ=0 ;
        // DECLARATION TABLEAU
        int[] tab;
        // CREATION TABLEAU
        tab = new int[n];
        // LECTURE TABLEAU
        for (i=0 ; i < n ; i++){
        System.out.print("saisir une valeur");
        tab[i]= reader.nextInt();
        }
        //NOUVELLE VALEUR
        System.out.print("entrez la valeur recherchée:");
        val=reader.nextInt();
        //RECHERCHE OCCURENCES
        for ( i = 0 ; i < n; i++){
        if (tab[i]== val){
        occ ++;
        }
        }
        System.out.println("l'occurence de la valeur est: " + occ);
    }
    
}
