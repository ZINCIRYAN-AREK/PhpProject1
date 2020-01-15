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
public class Bissextile {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        //VARIABLES
        int a ;
        
        //CONSTANTES
        System.out.println("Entrez une année");
        a=reader.nextInt();
        if(a%400==0){
        System.out.println("année bissextile");}
        else if(a%100==0){
        System.out.println("année non bissextile");}
        else if (a%4==0){
        System.out.println("année bissextile");        
        } else { 
       System.out.println("année non bissextile");
        }
        }
    
}
