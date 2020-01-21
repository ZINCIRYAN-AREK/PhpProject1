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
public class PartieEntiereReelPositif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner reader = new Scanner(System.in);
       // VARIABLES 
       double R;
       // FONCTION
      System.out.print("Saisir un nombre réel : ");
      R=reader.nextDouble();
      System.out.print("la partie entiere vaut: " + PartieEntiere(R));
    }
      public static int PartieEntiere(double x){
      int resultat = 0;
              while(resultat < x){
              resultat++;
              }
              return resultat-1;
      }
    }
    
    

