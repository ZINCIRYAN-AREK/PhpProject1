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
public class radiansdegres {
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //VARIABLES
        Scanner reader = new Scanner(System.in);
         double angle , resultat;
        
        //CONSTANTES
        System.out.print("Entrez la valeur de l'angle en radians : ");
        angle = reader.nextDouble();
        resultat = angle/Math.PI*180;
        System.out.println("degres : " + resultat);
    
    
}
}