import java.util.Scanner;

public class EjerciciosIfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int edad = ScannerManager.leerInt(scanner, "Ingrese su edad");
        final int ingresos = ScannerManager.leerInt(scanner, "Ingrese sus ingresos mensuales");

        mostrarMensaje(validarJubilacion(edad, ingresos));
    }

    static String validarJubilacion(int edad, int ingresos) {
        return (edad >= 65 && ingresos > 20000) ? "Puede jubilarse" : "No puede jubilarse";

        /*
        if (edad >= 65 && ingresos > 20000) {
            return "Puede jubilarse";
        } else {
            return "No puede jubilarse";
        }

         */
    }

    static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }


}
