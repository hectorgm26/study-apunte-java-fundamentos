import java.util.Random;

public class EjercicioBucleFor1SerieNumeros {
// EJERCICIO PARA MOSTRAR UNA SERIE DE NUMEROS EN ORDEN

    public static void main(String[] args) {

        final var random = new Random();
        int n = RandomUtilities.generarRandomInt(random, 5, 20);
        System.out.println("El numero aleatorio es: " + n);

        mostrarNumeros1(n);
        mostrarNumeros2(n);
        mostrarNumeros3(n);
    }

    static void mostrarNumeros1(int n) {
        for (int i = 1; i < n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println(); // el salto de linea colocarlo siempre despues que termine el bucle for
    }

    static void mostrarNumeros2(int n) {
        for (int y = 1; y <= n; y++) {
            if (y % 2 == 1) {
                System.out.printf("%d ", y);
            }
        }
        System.out.println();  // el salto de linea colocarlo siempre despues que termine el bucle for
    }

    static void mostrarNumeros3(int n) {
        for (int z = n; z >= 1; z--) {
            System.out.printf("%d ", z);
        }
        System.out.println();   // el salto de linea colocarlo siempre despues que termine el bucle for
    }


}
