import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = ScannerManager.leerInt(scanner, "Ingrese un numero: ");
        scanner.close();

        final boolean esMayor50 = numero > 50;
        final boolean esPar = numero % 2 == 0;

        final boolean resultado = esMayor50 && esPar;
        System.out.println(esMayor50);
        System.out.println(esPar);
        System.out.println(resultado);
    }

    /*
    Opradores logicos:
    ! es negacion                          Ejemplo !datoBooleano
    && es and, que significa y             Ejemplo a == b && a == c
    || es or, que significa o              Ejemplo a != b || b != c
     */
}