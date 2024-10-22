/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerJava;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Netec
 */
public class ColasPilas {
    public static void main(String[] args) {
        //Implemntacion de Colas FIFO
        Queue<String> colaFIFO = new LinkedList<>();
        colaFIFO.offer("Elemento1");
        colaFIFO.offer("Elemento2");
        colaFIFO.offer("Elemento3");
        
        //Sacamos un elemento de la cola
        String primeroEnCola = colaFIFO.poll();
        System.out.println("Cola FIFO primer elemento: "+ primeroEnCola);        
        
        //Implementacion de Pila LIFO
        Deque<String> pilaLIFO = new LinkedList<>();
        pilaLIFO.addFirst("Elemento1");
        pilaLIFO.addFirst("Elemento2");
        pilaLIFO.addFirst("Elemento3");
        
        String primeroEnPila = pilaLIFO.removeFirst();
        System.out.println("Pila LIFO primer elemento: "+ primeroEnPila);  
    }
    
}
