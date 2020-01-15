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
public class Departement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLE
        Scanner reader = new Scanner(System.in);
        int dept ;
        
        //CONSTANTES
        System.out.print("numero de departement(13,83,84)");
        dept= reader.nextInt();
        
        switch(dept){
        case 13:
        System.out.println("Bouche du Rhone");
        break;
        case 83:
        System.out.println("var");
        break;
        case 84:
            System.out.print("Vaucluse");
            break;
        default:
            System.out.println("Reponse non valide");
    
    }
        
        
    }
    
}
