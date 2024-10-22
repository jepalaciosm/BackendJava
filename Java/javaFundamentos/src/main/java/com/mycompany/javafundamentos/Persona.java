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
public class Persona {
    String Nombre;
    String Nacionalidad;
    double Altura;
    Integer Edad;

    public Persona() {
        this.Nombre = "John";
        this.Nacionalidad = "Colombiano";
        this.Altura = 1.80;
        this.Edad = 25;
    }
    

    public Persona(String Nombre, String Nacionalidad, float Altura, Integer Edad) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Altura = Altura;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }
    
    
    
}
