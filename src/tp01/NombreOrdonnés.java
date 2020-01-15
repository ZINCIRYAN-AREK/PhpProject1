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
public class NombreOrdonnés {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES
        Scanner reader =new Scanner(System.in);
        double nb1, nb2 ;
        
        //CONSTANTES 
        
        System.out.print("Entrer un premier nombre:");
        nb1=reader.nextDouble();
        System.out.print("entrer le deuxieme nombre:");
        nb2= reader.nextDouble();
        
        if(nb1<nb2){
        System.out.print("bien joué");
                }
        else{
        System.out.print("perdu");
                }
}
}