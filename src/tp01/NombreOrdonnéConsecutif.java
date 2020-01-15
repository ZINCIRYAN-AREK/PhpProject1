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
public class NombreOrdonnéConsecutif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //VARIABLES
    Scanner reader = new Scanner(System.in);
    int nb1 ,nb2 ;
            
    //CONSTANTES
    System.out.print("Entrer un premier nombre:");
    nb1=reader.nextInt();
    System.out.print("entrer un deuxieme nombre:");
    nb2=reader.nextInt();
    
    /* if(nb1<nb2){
        System.out.print("ordonné");}
        else{System.out.print("non ordonné");}
    
    if(nb2==nb1+1){
    System.out.print("croissnt");}
    else{System.out.print("non croissant");}*/
    
    if(nb2== nb1 + 1 ){
        System.out.print("Nombre croissant et ordonné");}
    else{
        System.out.print("nombre non croissant et ordonné");
                }        
        
                
                }
    }
    
    
    
    
    

