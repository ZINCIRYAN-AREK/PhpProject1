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
public class Somme_DeuxMatricesCarréesEntiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.print("entrez l'ordre du carré :");
         final int n=reader.nextInt();
         // DECLARATION ETCREATION DU TABLEAU
         int [][]matrice1 = new int [n][n];
         int [][]matrice2 = new int [n][n];
         // LECTURE DES MATRICES
         for( int i=0; i<n; i++){
            for (int j=0;j<n ; j++){
            System.out.printf("Entrez la matrice1 [%d][%d] : " ,i ,j);
            matrice1[i][j] = reader.nextInt();
            }
         }
         for( int i=0; i<n; i++){
            for (int j=0;j<n ; j++){
            System.out.printf("Entrez la matrice2 [%d][%d] : " ,i ,j);
            matrice2[i][j] = reader.nextInt();
            }
         }
              // CREATION MATRICE RESULTAT
              int[][] matrice3 = new int [n][n];
              for(int i = 0; i<n ;i++){
              for(int j = 0; j< n ; j++ ){
              matrice3[i][j]= matrice1[i][j] + matrice2[i][j];
              }
              }
         // AFFICHE MATRICE RESULTAT
         for (int i =0; i <n ; i++){
         System.out.println();
         for(int j =0 ; j<n ; j++){
         System.out.print(matrice3[i][j]+"\t");
         }
         }
        
    }
    
}
