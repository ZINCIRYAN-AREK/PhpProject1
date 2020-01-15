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
public class Bissextile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //VARIABLES
        Scanner reader = new Scanner(System.in);
        int a ;
        //CONSTANTES
        do {System.out.print("entrez une année entre 1900 et 2100:");
         a=reader.nextInt();
        }while ( a < 1900 || a > 2100);
         if( a%400==0 || a%100!=0 && a%4==0 ){
         System.out.println ("année bissextile");
         }else {System.out.println("année non bissextile");
         } 
    }
    
}
