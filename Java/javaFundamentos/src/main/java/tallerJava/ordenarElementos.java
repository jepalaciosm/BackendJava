/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Netec
 */
public class ordenarElementos {
    public static void main(String[] args) {
        ArrayList<Tarea> listaTareas = new ArrayList<>();
        listaTareas.add(new Tarea("Realizar ejercicio 1","Alta"));
        listaTareas.add(new Tarea("Realizar ejercicio 2","Baja"));
        listaTareas.add(new Tarea("Realizar ejercicio 3","Media"));
        listaTareas.add(new Tarea("Realizar ejercicio 4","Alta"));
        
        Collections.sort(listaTareas, Comparator.comparing(tarea -> tarea.prioridad));
        
        for (Tarea tarea : listaTareas){
            System.out.println(tarea);
        }
    }
    
}
