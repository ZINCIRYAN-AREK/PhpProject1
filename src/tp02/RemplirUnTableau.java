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
public class RemplirUnTableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // COSTANTES
        final int NL=10 , NC=2 ;
        // VARIABLES 
        int i , j , Pas , Val , valDépart ; 
        // DECLARATION ET CREATION DU TABLEAU 
        int [][] tab = new int [NL][NC];
        // LECTURE DU TABLEAU
        
        System.out.print("saisir une valeur  de départ :");
        valDépart=reader.nextInt();
        System.out.print("saisir une valeur de pas :");
        Pas=reader.nextInt();
        Val=valDépart;
                
        for (i=0;i<NL;i++){
        for (j=0 ; j<NC ; j++){
        //tab[i][j] = Val ;
        //Val = Val + Pas ;
        tab[i][j]=(2* i+j)*Pas + valDépart;
        }
        }
        // AFFICHAGE DU TABLEAU
         for ( i =0; i <NL ; i++){
         System.out.println();
         for( j =0 ; j<NC ; j++){
         System.out.print(tab[i][j]+"\t");
         }
         }
    }
    
}
        