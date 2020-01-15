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
public class Test_Amplitude_Tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // CONSTANTES
        final int NL=5 , NC=2;
        // VARIABLES
        int i , j , somme , min , max ; 
        //DECLARATION ET CREATION DU TABLEAU
        int[][] tab = new int[NL][NC];
        //LECTURE DU TABLEAU
        for( i=0 ; i <= NL-1 ; i++){
            for (j=0; j <= NC-1 ; j++){
            System.out.print("saisir une valeur:");
        tab[i][j]= reader.nextInt();
        }
        }
        // RECHERCHE DE LA PLUS PETIT VALEUR DU TABELAU 
        min = tab[0][0] ;
        for (i = 0 ; i < NL ; i++){
            for( j=0; j < NC ; j++){
            if (tab[i][j] < min){
                min = tab[i][j];
            }
            }
        }
        // RECHERCHE DE LA PLUS GRANDE VALEUR DU TABLEAU 
         max = tab[0][0];
        for ( i=0 ; i < NL ; i++){
            for(j=0 ; j < NC ; j++){
           if (tab[i][j] > max){
            max = tab[i][j] ; }
        }
        }
        
        // AFFICHAGE DU TABLEAU
         for ( i =0; i <NL ; i++){
         System.out.println();
         for( j =0 ; j<NC ; j++){
         System.out.print(tab[i][j]+"\t");
         }
         }
        // RESULTAT DE L'AMPLITUDE DU TABELAU
         
        somme = max - min ; 
        System.out.print("L'amplitude est de : " + somme);
        
    }
    
}
