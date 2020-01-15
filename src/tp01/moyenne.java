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
public class moyenne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES
        Scanner reader = new Scanner(System.in);
        int n1, n2, n3, n4;
        double moyenne;
        
        System.out.print("entrez la valeur du premier nombre");
        n1 = reader.nextInt();
        System.out.print("entrez la valeur du deuxieme nombre");
        n2 = reader.nextInt();
        System.out.print("entrez la valeur du troisieme nombre");
        n3 = reader.nextInt();
        System.out.print("entrez la valeur du quatrieme nombre");
        n4 = reader.nextInt();
        
        //CALCUL DE LA MOYENNE  
        moyenne = (n1+n2+n3+n4)/4.0;
        //AFFICHAGE RESULTAT    
        System.out.println("la moyenne vaut :" + moyenne);
        
        
    }
    
}
