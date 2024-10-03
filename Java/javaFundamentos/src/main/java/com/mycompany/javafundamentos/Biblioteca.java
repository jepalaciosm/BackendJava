/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafundamentos;

/**
 *
 * @author Netec
 */
public class Biblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro("El libro Numero 1",  "John",  "M",  200);
        
        libro.imprimirInformacion();
    }
}
