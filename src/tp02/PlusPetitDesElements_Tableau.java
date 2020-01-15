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
public class PlusPetitDesElements_Tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner (System.in);
        //CONSTANTES
        final int nl=5 , nc=2;
        //VARIABLES
        int min , i , j ; 
         
        //DECLARATION ET CREATION DU TABLEAU
        int[][] tab = new int[nl][nc];
        //LECTURE DU TABLEAU
        for( i=0 ; i < nl ; i++){
            for (j=0; j < nc ; j++){
            System.out.print("saisir une valeur:");
        tab[i][j]= reader.nextInt();
        }
        }
        //CALCULE ET AFFICHAGE DE LA MOYENNE
        min = tab[0][0] ;
        for (i = 0 ; i < nl ; i++){
            for( j=0; j < nc ; j++){
            if (tab[i][j] < min){
                min = tab[i][j];
            }
            }
        }
       
        System.out.println("le plus petit est :" + min );
        
    }
    
}
