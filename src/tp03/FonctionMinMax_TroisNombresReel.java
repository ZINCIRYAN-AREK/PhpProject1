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
public class FonctionMinMax_TroisNombresReel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        // VARIABLES 
        double un , deux , trois ; 
        // LECTURE DE TROIS NOMBRES REELS
        System.out.print("saisir une valeur : ");
        un=reader.nextInt();
        System.out.print("saisir une valeur : ");
        deux=reader.nextInt();
        System.out.print("saisir une valeur : ");
        trois=reader.nextInt();
        System.out.print("Le max vaut : " + max(un,deux,trois));
        System.out.print("Le min vaut : " + min(un,deux,trois));}
        // APPEL DE LA FONCTION
        public static double min (double a , double b , double c ){
        double min ; 
                min = a;
                if(b < min){
                min = b;}
                if(c < min){
                min = c ;}
                return min;
                        }
        
        public static double max (double a , double b , double c ){
        double max ; 
                max = a;
                if(b > max){
                max = b;}
                if(c > max ){
                max = c ; }
                return max ; 
            }
        
        
    }
    

