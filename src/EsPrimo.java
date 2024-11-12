import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int n = ScannerManager.leerInt(scanner, "Ingrese un número");

        int conteo = esPrimo(n);

        determinarPrimo(conteo);
    }


    static int esPrimo(int n) {
        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        return contador;
    }

    static void determinarPrimo(int contador) {
        if (contador == 2) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }
    }
}
