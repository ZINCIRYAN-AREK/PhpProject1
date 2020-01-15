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
public class IndexElémentLePlusGrand_Tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // VARIABLES
        int i , indexMax ; 
        // CONSTANTES
            final int N=10;
            int [] tab= new int [N];
            // LECTURE DU TABLEAU
            for (i=0 ; i<N ;i++){
            System.out.print("Saisir une valeur :");
            tab[i]=reader.nextInt();
                    }
            // RECHERCHE DU INDEXMAX
            indexMax = 0;
            // PARCOURS DES ELEMENTS RESTANT
            for( i=1 ; i<N ;i++){
            if (tab[i]>tab[indexMax]){
            indexMax = i ;
            }
            }
            System.out.print("Index de l'élément le plus grand est : "+ indexMax);
    }
    
    
}
