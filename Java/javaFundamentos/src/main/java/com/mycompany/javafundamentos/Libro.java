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
public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private String genero;
    private int cantidad;

    public Libro(String titulo, String autor, String genero, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.cantidad = cantidad;
    }
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    public void imprimirInformacion() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Género: " + this.genero);
        System.out.println("Cantidad: " + this.cantidad);
    }
}

