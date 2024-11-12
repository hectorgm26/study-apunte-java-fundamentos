import java.util.Random;
import java.util.Scanner;

public class EjercicioAumentarVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var random = new Random();

        int numero = ScannerManager.leerInt(scanner, "Introduce un número");
        scanner.close();
        System.out.printf("El valor ingresado fue %d%n", numero);

        numero++;
        System.out.printf("El valor de la variable numero aumentado en 1 es %d%n", numero);

        int n = RandomUtilities.generarRandomInt(random, 3, 10);
        System.out.printf("El valor random es de %d%n", n);

        // Incremento la variable numero en n, que es un numero random
        numero += n;

        System.out.printf("El valor de la variable numero aumentado en %d es %d%n", n, numero);
    }
}
