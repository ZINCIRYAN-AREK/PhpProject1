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
public class RechercheSéquentiellePairouImpair_Tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        final int n = 10;
        // VARIABLES
        int i ;
        boolean estPair ; 
        // DECLARATION TABLEAU
        int[] tab;
        // CREATION TABLEAU
        tab = new int[n];
        // LECTURE TABLEAU
        for (i=0 ; i < n ; i++){
        System.out.print("saisir une valeur");
        tab[i]= reader.nextInt();}
        //PARCOURS TABLEAU
        i=0;
        estPair = true;
        while(i < n && estPair){
        if(tab[i]% 2== 1){
        estPair = false;
        }
        i++;
        }
        System.out.print("Tous les éléments sont pairs : " + estPair );
        
    }
    
}
