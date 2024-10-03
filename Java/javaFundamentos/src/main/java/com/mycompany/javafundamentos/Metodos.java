/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafundamentos;

/**
 *
 * @author Netec
 * Analizar el método proporcionado en el código.
• Identificar la complejidad, nombres inadecuados y parámetros mal
nombrados.
• Aplicar la refactorización necesaria para mejorar la claridad y
responsabilidad del método.
• Asegurarse de que el método modificado conserve su
funcionalidad original
 */
public class Metodos {
    private boolean estaEnRango(int valor, int limiteInferior, int limiteSuperior){
        return valor > limiteInferior && valor < limiteSuperior;
    } 
    
    private boolean esMenorQueLimiteInferior(int valor, int limiteInferior){
        return valor < limiteInferior ;
    } 
    
    private int aplicarOperacion1(int valor){
        return valor * 2 - 1;
    } 
    
    private int ajustarDatos(int valor, int ajuste){
        return Math.abs(valor + ajuste);
    } 
    
    private int elevarAlCuadrado(int valor, int exponente){
        return (int)Math.pow(valor, exponente);
    } 
    
    public void procesarDatos(int limiteInferior, int limiteSuperior, int[] datos){
        for(int i=0; i< datos.length; i++){
            if (estaEnRango(datos[i], limiteInferior,limiteSuperior)){
                datos[i]=aplicarOperacion1(datos[i]);
            } else if(esMenorQueLimiteInferior(datos[i], limiteInferior)){
                datos[i]=ajustarDatos(datos[i],limiteInferior);
            } else{
                datos[i]=elevarAlCuadrado(datos[i],limiteSuperior);
            }
        }
    }
}
