import java.util.Scanner;

public class EjerciciosOperadoresLogicos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int edad = ScannerManager.leerInt(scanner, "Ingrese su edad");
        scanner.close();

        boolean validacion = validarDescuento(edad);

        imprimirMensaje(edad, validacion);
    }

    static boolean validarDescuento(int edad) {
        return edad > 20 && edad < 50;
    }

    static void imprimirMensaje(int edad, boolean validacion) {
        System.out.printf("Tienes una edad de %d, ¿cumples la condicion?. %b%n", edad, validacion);
    }
}