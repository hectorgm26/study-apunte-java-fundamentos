import java.util.Scanner;

public class EsMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        boolean esPar = esPar(numero);
        boolean esMultiplo5 = esMultiplo5(numero);

        imprimirResultado(numero, esPar, esMultiplo5);
    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;

    }

    static boolean esMultiplo5(int numero) {
        return numero % 5 == 0;

    }

    static void imprimirResultado(int numero, boolean esPar, boolean esMultiplo5) {
        System.out.printf("¿El numero %d es par?. %b%n", numero, esPar);
        System.out.printf("¿El numero %d es multiplo de 5?. %b%n", numero, esMultiplo5);
    }
}