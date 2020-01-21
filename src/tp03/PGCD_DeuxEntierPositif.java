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
public class PGCD_DeuxEntierPositif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // VARIABLES
        int x , y ; 
        
        System.out.print("saisir une valeur : ");
        x=reader.nextInt();
        System.out.print("saisir une valeur : ");
        y=reader.nextInt();
        System.out.print ("Le PGCD est :"+ PGCD( x , y)) ;
    }
    public static int PGCD (int a , int b ) {
        
      
      while ( a != b ) {
	if ( a < b )
	  b = b - a;
	else
	  a = a - b;
        
      }
      return a;
      
    }
}

