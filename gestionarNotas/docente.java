import java.util.ArrayList;
import java.util.Scanner;

public class docente {
    final String nombreEscuela = "DYF";
    String nombre;
    private ArrayList<Float> notas;

    public docente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del docente: ");
        String nombre = scanner.nextLine();
        this.nombre = nombre;
        this.notas=new ArrayList<Float>();

    }

    public docente(String nombre, ArrayList<Float> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Float> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Float> notas) {
        this.notas = notas;
    }

    public void ingresarNNotas(){
        Scanner scanner = new Scanner(System.in);
        int cantidad=0;
        System.out.println("Ingrese numero de notas");
        cantidad=scanner.nextInt();

        for(int i=0; i<cantidad; i++){
            System.out.println("Ingrese por fa la nota "+i+" :");
            Float nota=scanner.nextFloat();

            this.notas.add(nota);
        }
    }

    public float sumaNotas(){
        float totalNotas=0;
        for (Float nota : this.notas) {
            totalNotas += nota;
        }
        return totalNotas;
    }

    public float mayorNota(){
        float mayorNota=0;
        for (float nota : this.notas) {
            if (mayorNota < nota) {
                mayorNota = nota;
            }
        }
        return mayorNota;
    }

    public String mostrarNotas(){
        String listadoNotas="";
        for (float nota : this.notas) {
            listadoNotas+=nota+" - ";
        }
        return listadoNotas;
    }

    @Override
    public String toString(){
        return "El docente "+nombre+"\n tiene "+notas.size()+
                " notas \n Sumatoria de notas: "+ sumaNotas()+
                "\n La nota mayor es:"+mayorNota()+
                "\n notas ingresadas: "+mostrarNotas();
    }
}
