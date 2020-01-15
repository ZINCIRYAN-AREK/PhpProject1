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
public class ComparaisonDeuxNombresEntiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABES
        Scanner reader = new Scanner(System.in);
        int nb1 , nb2 ;
                
        //CONSTANTE
        System.out.print("Entrer le premier nombre");
        nb1=reader.nextInt();
        System.out.print("Entrer le deuxieme nombre");
        nb2=reader.nextInt();
        
        if(nb1< nb2){
        System.out.print("nb1 est plus petit");
        }else if (nb2 > nb1){
        System.out.print(" nb1 est plus grand");
        }else{
            System.out.print("nb1 et Nb2 identiques");
        }
            
    }
    
}
