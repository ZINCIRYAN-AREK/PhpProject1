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
public class Tableau_CarréMagiqueParfaitOrdreImpair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner reader = new Scanner(System.in);
        // VARIABLES
        int  n , x , ligne , colonne ;
         //DECLARATION ET CREATION DU TABLEAU
        //LECTURE DU TABLEAU
        System.out.print("entrez l'ordre du carré :");
       n=reader.nextInt();
       final int [][] cm = new int [n][n]; 
               colonne=n/2;
               ligne = colonne +1 ;
               cm[ligne][colonne]=1;
               
               for ( x =2 ; x <= n*n ; x++){
                if((x-1) % n == 0){
                   ligne=(ligne+2)% n ;
               }else{
                   ligne = (ligne +1) % n;
                   colonne = (colonne +1) % n ;
                }
                    cm[ligne][colonne]= x ;
               }
               for (int i=0 ; i<n ; i++){
               System.out.println();
                   for (int j=0 ; j<n ; j++){
               System.out.print(cm[i][j] + "\t");
               }
               
             }
               
    }
    
}
