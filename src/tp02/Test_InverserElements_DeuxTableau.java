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
public class Test_InverserElements_DeuxTableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // VARIABLES
        int i ; 
        int [] tab1 , tab2 ; 
        //CONSTANTES
        final int n=10 ;
        
        // DECLARATION ET CREATION DU TABLEAU
         tab1 = new int [n];
         tab2 = new int [n];
        for (i = 0 ; i <= n-1 ; i++){
            System.out.print("entrez la valeur :");
            tab1[i]=reader.nextInt();
            }
        for(i=0 ; i<= n-1; i++){
        tab2[i]=tab1[n-i-1];}

        for ( i = 0 ; i <=n-1 ; i++){
        System.out.print(tab2[i]+ "\t" );}
    
}
} 