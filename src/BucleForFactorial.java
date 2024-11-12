import java.util.Random;

public class BucleForFactorial {
    public static void main(String[] args) {

        final var random = new Random();

        int n = RandomUtilities.generarRandomInt(random, 2, 10);
        System.out.println("El numero aleatorio es: " + n);

        int factorial = calcularFactorial(n);

        mostrarResultado(n, factorial);

    }

    static int calcularFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    static void mostrarResultado(int n, int factorial) {
        System.out.printf("El factorial de %d es: %d%n", n, factorial);
    }


}
