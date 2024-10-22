/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerJava;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Netec
 */
public class GestionEstudiantes {
    private HashMap<String, Integer> estudiantes;

    public GestionEstudiantes() {
        estudiantes = new HashMap<>();
    }

    // Método para agregar un nuevo estudiante
    public void agregarEstudiante(String nombre, int calificacion) {
        estudiantes.put(nombre, calificacion);
        System.out.println("Estudiante agregado: " + nombre + " con calificación: " + calificacion);
    }

    // Método para buscar la calificación de un estudiante
    public Integer buscarCalificacion(String nombre) {
        return estudiantes.get(nombre);
    }

    // Método para actualizar la calificación de un estudiante
    public void actualizarCalificacion(String nombre, int nuevaCalificacion) {
        if (estudiantes.containsKey(nombre)) {
            estudiantes.put(nombre, nuevaCalificacion);
            System.out.println("Calificación actualizada para " + nombre + ": " + nuevaCalificacion);
        } else {
            System.out.println("Estudiante no encontrado: " + nombre);
        }
    }

    // Método para mostrar todos los estudiantes y sus calificaciones
    public void mostrarEstudiantes() {
        System.out.println("Lista de estudiantes y sus calificaciones:");
        for (HashMap.Entry<String, Integer> entry : estudiantes.entrySet()) {
            System.out.println("Estudiante: " + entry.getKey() + ", Calificación: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nGestión de Estudiantes");
            System.out.println("1. Agregar nuevo estudiante");
            System.out.println("2. Buscar calificación de estudiante");
            System.out.println("3. Actualizar calificación de estudiante");
            System.out.println("4. Mostrar todos los estudiantes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la calificación del estudiante: ");
                    int calificacion = scanner.nextInt();
                    gestion.agregarEstudiante(nombre, calificacion);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    nombre = scanner.nextLine();
                    Integer calif = gestion.buscarCalificacion(nombre);
                    if (calif != null) {
                        System.out.println("Calificación de " + nombre + ": " + calif);
                    } else {
                        System.out.println("Estudiante no encontrado: " + nombre);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la nueva calificación del estudiante: ");
                    int nuevaCalificacion = scanner.nextInt();
                    gestion.actualizarCalificacion(nombre, nuevaCalificacion);
                    break;
                case 4:
                    gestion.mostrarEstudiantes();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
    
}
