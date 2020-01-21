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
public class NombrePremier_Fonction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // VARIABLES
        int n1 ;
        System.out.print("Entrez une valeur :");
        n1=reader.nextInt();
         
        //if (EstPremier(n1)==true){
        //System.out.print("C'est une nombre premier");
        //}else{
        //System.out.print("Ce n'est pas un nombre premier");}
        
        // OPERATEUR TERNAIRE
        String msg = (EstPremier(n1)) ? "Est premier" : "n'est pas premier";
        System.out.println(msg);
        // APPEL DE LA PROCEDURE
        System.out.println("Liste des nombres premiers de l'intervalle [3,n]");
        System.out.println("Choix de la valeur de n : ");
        int n2 = reader.nextInt();
        afficheNPI(n2);
        // APPEL DE LA DEUXIEME FONCTION
        System.out.println("Liste des nombres premiers jumeaux de l'intervalle [3,n]");
        System.out.println("Choix de la valeur de n : ");
        int n3 = reader.nextInt();
        afficheNPJ(n3);
}
    public static boolean EstPremier(int a){
    // VARIABLES
    int div ;
    if (a % 2==0){
    return false ;}
    div = 3;
    while(div *div <= a && a % div > 0){
        div = div +2;}
    return div * div > a ; 
    }
    // FONCTION NOMBRE PREMIER INTERVALLE
    public static void afficheNPI(int n){
    System.out.print("Liste des nombrespremiers de l'intervalle[3,n]:");
    for(int i = 3 ; i<=n ; i++){
    if (EstPremier(i)){
        System.out.print(i+"");
    }
    }
    System.out.println("\nFin de liste");
    }
    // FONCTION NOMBRE PREMIER JUMEAUX
    public static void afficheNPJ(int n){
    int ad, d=2 ;
        for(int i =3 ; i<=n ; i++)
        if(EstPremier(i)){
            ad = d;
            d = i;
            if(d==ad +2)
                System.out.printf("Premiers jumeaux : %d %d\n", ad , d);
        }
    }
}
