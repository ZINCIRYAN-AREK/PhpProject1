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
public class DivisionEuclidienne_Tableau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // VARIABLES
        int dividende , diviseur;
        int [] res ;
        // LECTURE DU DIVIDENDE ET DU DIVISEUR
        System.out.print("Entrez la dividende : ");
        dividende=reader.nextInt();
        System.out.print("Entrez le diviseur : ");
        diviseur=reader.nextInt();
        // APPEL DE LA FONCTION
        res=divEuclidienne(dividende,diviseur);
        // AFFICHAGE DU RESULTAT
        System.out.print("Quotient:"+ res[0]);
        System.out.print("Reste:" + res[1]);
    }
    public static int[] divEuclidienne(int dividende, int diviseur){
    int[] resultat = new int[2];
    resultat[0]=dividende /diviseur;
    resultat[1]=dividende % diviseur;
    return resultat;
    }
    
}
