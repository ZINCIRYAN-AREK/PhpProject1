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
public class Fonction_CodePolybeMot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // VARIABLES
       int i , j ; 
       // MATRICE CARR2E D'ORDRE 5
       final int n=5;
       char[][] T = new char [][]{
           {'A','B','C','D','E'},    
           {'F','G','H','I','J'},
           {'K','L','M','N','O'},
           {'P','Q','R','S','T'},
           {'U','V','X','Y','Z'},
    };
    // AFFICHAGE D'UNE MATRICE
    for (i = 0; i < n ; i++){
       System.out.println();
       for (j = 0 ; j < n ; j++){
           System.out.print(T[i][j]+ " ");
       
       }
        }
    // SAISIR MOT A CRYPTER
    System.out.print("entré un mot: ");
    String mot = reader.nextLine();
    
    // CRYPTER : TEST FONCTION CODE_POLYBE
    System.out.println("\nCRYPTAGE");
    int[] mot_crypte = code_polybe(mot);
    for ( i= 0 ; i < mot_crypte.length; i++){
    System.out.print(mot_crypte[i] + "\t");
            }
    // DECRYPTER 
    System.out.println("\nDECRYPTAGE");
    System.out.println(decode_polybe(mot_crypte));
    
        ;
    
}
    public static int[] code_polybe(String mot){
        final int n=5;
        
        
        char[][] T = new char [][]{
           {'A','B','C','D','E'},    
           {'F','G','H','I','J'},
           {'K','L','M','N','O'},
           {'P','Q','R','S','T'},
           {'U','V','X','Y','Z'},
    };
         
       
       char lettre ;
       int pos = 0;
       int[] c = new int [mot.length()*2];
       for ( int k=0 ; k < mot.length(); k++){
       lettre= mot.charAt(k);
       if (lettre== 'w') lettre ='v';
       for (int i=0; i<=4; i++)
        for (int j=0 ; j<=4 ; j++)
            if (lettre==T[i][j]){
       c[pos++]=i ;
       c[pos++]=j ;
               }
    
       
       }
       return c ;
    }
    public static String decode_polybe(int[] mot_crypte){
    // VARIABLES
    
    String mot;
    int i , j , k ; 
    
     char[][] T = new char [][]{
           {'A','B','C','D','E'},    
           {'F','G','H','I','J'},
           {'K','L','M','N','O'},
           {'P','Q','R','S','T'},
           {'U','V','X','Y','Z'},
    };
     mot = "";
     for ( k = 0 ; k < mot_crypte.length-1; k= k+2){
        i= mot_crypte[k];
        j= mot_crypte[k+1];
        if (T[i][j]=='V'){
        mot = mot + " V / W ";
                
    }else{
            mot = mot + T[i][j];
        }}
     return mot;
    }
    

}