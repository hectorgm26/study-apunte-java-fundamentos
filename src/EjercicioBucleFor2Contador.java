import java.util.Random;

public class EjercicioBucleFor2Contador {
// EJERCICIO PARA CONTAR NUMEROS PARES, MULTIPLOS DE 3 Y MULTIPLOS DE 10, PROVENIENTES DE UNA SECUENCIA

    public static void main(String[] args) {

        final var random = new Random();

        int n = RandomUtilities.generarRandomInt(random, 15, 100);
        System.out.println("El numero aleatorio es: " + n);

        System.out.printf("En total hay %d numeros pares%n", contarValores1(n));
        System.out.printf("En total hay %d numeros multiplos de 3%n", contarValores2(n));
        System.out.printf("En total hay %d numeros multiplos de 10", contarValores3(n));

    }

    static int contarValores1(int n) {
        int contador1 = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {                // filtro pares
                contador1++;                // contador de pares y su aumento cada vez que pasa el filtro
            }
        }
        return contador1;
    }

    static int contarValores2(int n) {
        int contador2 = 0;

        for (int y = 1; y <= n; y++) {
            if (y % 3 == 0) {                // filtro multiplos de 3
                contador2++;                 // contador de multiplos de 3 y su aumento cada vez que pasa el filtro
            }
        }
        return contador2;
    }

    static int contarValores3(int n) {
        int contador3 = 0;

        for (int z = 1; z <= n; z++) {
            if (z % 10 == 0) {                // filtro multiplos de 10
                contador3++;                 // contador de multiplos de 10 y su aumento cada vez que pasa el filtro
            }
        }
        return contador3;
    }

}
