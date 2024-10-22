/**
 *
 * @author Javier Arturo
 */
package com.mycompany.javafundamentos;
import java.util.Scanner;
public class Incremento {
    public static void main(String[] args) {
        int c;
        
        //demuestra el operador de postincremento
        c = 5;
        /*System.out.println("El valor de c es: " + c);
        System.out.println("El valor de c ahora es: " + c++);
        System.out.println("El valor de c despues del incremento: " + c);*/
        
        c = 5;
        System.out.println("El valor de c es: " + c);
        System.out.println("El valor de c ahora es: "  +      --c);
        System.out.println("El valor de c después del incremento: " + c);
        
        
        Scanner teclado=new Scanner(System.in);
        int valor;
        do {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza):");
            
            valor = teclado.nextInt();
            
            if (valor>=100) {
                System.out.println("Tiene 3 dígitos.");
            } else {
                if (valor>=10) {
                    System.out.println("Tiene 2 dígitos.");
                } else {
                    System.out.println("Tiene 1 dígito.");
                }
            }
        } while (valor!=0);
    }
    
}



