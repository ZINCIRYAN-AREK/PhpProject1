/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01;

import java.util.Scanner;

/**
 *
 * @author formation_gep
 */
public class Suite_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        Scanner reader = new Scanner(System.in);
        int somme , d , ad , i , n ;
        //CONSTANTES
        System.out.print("entrez une valeur :");
        n=reader.nextInt();
        switch(n){
                case 1:                   
                case 2:
                    System.out.println("le resultat vaut 1");
                    break;
                default:
                    ad = 1;
                    d = 1;
                    for (i=3 ; i<=n ;i++ ){
                    somme = d +ad;
                    ad = d ; 
                    d = somme ;  
                            }
                    System.out.print("le resultat vaut :"+ d);
        }       
    }
    
}
