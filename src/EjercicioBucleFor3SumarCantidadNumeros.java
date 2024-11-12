import java.util.Random;

public class EjercicioBucleFor3SumarCantidadNumeros {

    public static void main(String[] args) {
        final var random = new Random();

        int n = RandomUtilities.generarRandomInt(random, 15, 100);

        int suma1 = calcularSuma1(n);
        int suma2 = calcularSuma2(n);
        int suma3 = calcularSuma3(n);

        System.out.printf("La suma de los numeros del 1 al %d es: %d%n", n, suma1);
        System.out.printf("La suma de los numeros pares del 1 al %d es: %d%n", n, suma2);
        System.out.printf("La suma de los numeros multiplos de 7, del 1 al %d es: %d%n", n, suma3);
    }

    static int calcularSuma1(int n) {
        int suma1 = 0;
        for (int i = 1; i <= n; i++) {
            suma1 += i;
        }
        return suma1;
    }

    static int calcularSuma2(int n) {
        int suma2 = 0;
        for (int y = 1; y < n; y++) {
            if (y % 2 == 0) {
                suma2 += y;
            }
        }
        return suma2;
    }

    static int calcularSuma3(int n) {
        int suma3 = 0;
        for (int z = 1; z < n; z++) {
            if (z % 7 != 0) {
                suma3 += z;
            }
        }
        return suma3;
    }
}
