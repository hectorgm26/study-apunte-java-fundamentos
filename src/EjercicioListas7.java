import java.util.List;
import java.util.Random;

public class EjercicioListas7 {
    public static void main(String[] args) {
        final var random = new Random();

        List<Integer> listaAleatoria = RandomUtilities.generarListaIntAleatoria(random, 30, 3, 300);

        mostrarLista(listaAleatoria);

        int cantidadPrimos = contarPrimos(listaAleatoria);
        mostrarMensajeCantidadPrimos(cantidadPrimos);
    }

    static void mostrarLista(List<Integer> lista) {
        System.out.printf("La lista aleatoria es: %s%n", lista);
    }


    static int contarPrimos(List<Integer> lista) {
        int contadorPrimos = 0;

        for (int numero : lista) { // en cada elemento actual de la lista, se le asigna a la variable numero
            if (esPrimo(numero)) {
                contadorPrimos++;
            }
        }

        return contadorPrimos;
    }

    static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números menores o iguales a 1 no son primos
        }

        // Verifica si el número tiene divisores distintos de 1 y él mismo
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; // Si tiene un divisor, no es primo
            }
        }

        return true; // Si no tiene divisores, es primo
    }

    static void mostrarMensajeCantidadPrimos(int contadorPrimos) {
        if (contadorPrimos == 0) {
            System.out.println("No hay números primos en la lista");
        } else {
            System.out.printf("La cantidad de números primos en la lista es: %d%n", contadorPrimos);
        }
    }
}
