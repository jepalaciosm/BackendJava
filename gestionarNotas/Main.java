//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Sistema de Gestion de Notas Escuela DYF");
        docente profe = new docente();

        System.out.println("Hola "+profe.getNombre());
        profe.ingresarNNotas();
        System.out.println(profe.toString());
        }
    }
