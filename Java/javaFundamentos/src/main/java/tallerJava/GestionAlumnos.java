/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerJava;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Netec
 */
public class GestionAlumnos {    
    private ArrayList<String> listaAlumnos;

    public GestionAlumnos() {
        listaAlumnos = new ArrayList<>();
    }

    // Método para registrar un nuevo alumno
    public void registrarAlumno(String nombre) {
        listaAlumnos.add(nombre);
        System.out.println("Alumno registrado: " + nombre);
    }

    // Método para buscar un alumno por nombre
    public boolean buscarAlumno(String nombre) {
        return listaAlumnos.contains(nombre);
    }

    // Método para eliminar un alumno
    public boolean eliminarAlumno(String nombre) {
        if (listaAlumnos.remove(nombre)) {
            System.out.println("Alumno eliminado: " + nombre);
            return true;
        } else {
            System.out.println("Alumno no encontrado: " + nombre);
            return false;
        }
    }

    // Método para mostrar todos los alumnos
    public void mostrarAlumnos() {
        System.out.println("Lista de alumnos:");
        for (String alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }

    public static void main(String[] args) {
        GestionAlumnos gestion = new GestionAlumnos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nGestión de Alumnos");
            System.out.println("1. Registrar nuevo alumno");
            System.out.println("2. Buscar alumno por nombre");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos los alumnos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    gestion.registrarAlumno(nombre);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del alumno a buscar: ");
                    nombre = scanner.nextLine();
                    if (gestion.buscarAlumno(nombre)) {
                        System.out.println("Alumno encontrado: " + nombre);
                    } else {
                        System.out.println("Alumno no encontrado: " + nombre);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del alumno a eliminar: ");
                    nombre = scanner.nextLine();
                    gestion.eliminarAlumno(nombre);
                    break;
                case 4:
                    gestion.mostrarAlumnos();
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
