/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.palindromo;

import java.util.Scanner;

/**
 *
 * @author dani_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
        
        System.out.println("Ingrese el texto a evaluar");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine().toLowerCase().replace(" ", "").replace("á","a" ).replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(",", "");
        
        
        /**
         * Se uso un StringBuiler para poder usar el metodo reverse 
         * que este es usado para que la oracion se voltee y uso a su vez
         * un toString para que lo devolviera a una cadena de texto
         */
        String nuevaOracion = new StringBuilder(oracion).reverse().toString().replace("!", "").replace("¡", "");
         System.out.println(nuevaOracion);
      
         /**
          * Se uso un if para poder crear una condicion y a su vez se uso el 
          * equals para que compara la nuevaOracion con la oracion
          */
           
       if (oracion.equals(nuevaOracion)) {
           System.out.println("Sí es palindromo.");
         } else {
           System.out.println("No es palindromo.");
       }
        
        
        
        
    }
    
}
