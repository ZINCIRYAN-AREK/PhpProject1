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
public class Factorielle_EcritureRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner reader = new Scanner(System.in);
        System.out.print("Entrez une valeur : ");
        int n= reader.nextInt();
        System.out.printf("%d! - %d\n", n, fact(n));
        }

        public static int fact(int n){
        if ( n == 0){
            return 1 ;
        
        }else{
            return n * fact(n-1);
           
        
        }
        }
}
