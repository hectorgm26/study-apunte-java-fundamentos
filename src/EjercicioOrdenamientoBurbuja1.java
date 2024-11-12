import java.util.Random;

public class EjercicioOrdenamientoBurbuja1 {
    public static void main(String[] args) {

        final var random = new Random();
        int[] array = RandomUtilities.generarArrayRandomInt(random, 30, 10, 500);
        System.out.printf("El array aleatorio es: %s%n", java.util.Arrays.toString(array));

        ordenarArray(array);

        imprimirInformacion(array);


    }

    static void ordenarArray(int[] array) {
        int n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void imprimirInformacion(int[] array) {
        System.out.printf("El array ordenado de menor a mayor es: %s", java.util.Arrays.toString(array));
    }
}
