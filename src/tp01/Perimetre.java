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
public class Perimetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CONSTANTES
        final int NB_COTES = 4 ;
        
        //VARIABLES
        double longueur, resultat;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("longueur du côté : ");
        longueur = reader.nextDouble();
        resultat = longueur * NB_COTES;
        System.out.println("Périmetre : " + resultat);
    }
    
}

