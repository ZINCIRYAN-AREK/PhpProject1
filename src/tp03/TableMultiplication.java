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
public class TableMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // VARIABLES 
        int X;
        System.out.print("Saisir un nombre : ");
            X=reader.nextInt();
            AfficheTM(X);
                }
    public static void AfficheTM(int N){
        int i;
        for(i=1 ; i<=10; i++){
            //BONNE DEMARCHE
            System.out.printf("%d * %d = %d\n", i , N , N*i);
            // A NE PAS FAIRE
            //System.out.println(i+"*"+N+"="+i*N);
        }
    }
}
