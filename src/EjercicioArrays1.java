import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var random = new Random();
        int tamañoArray;
        int min;
        int max;
        int escalar;

        System.out.println("Ingrese el tamaño del array: ");
        tamañoArray = scanner.nextInt();

        System.out.println("Ingrese el valor minimo: ");
        min = scanner.nextInt();
        System.out.println("Ingrese el valor maximo: ");
        max = scanner.nextInt();
        System.out.println("Ingrese el valor del escalar: ");
        escalar = scanner.nextInt();

        int[] array = RandomUtilities.generarArrayRandomInt(random, tamañoArray, min, max);

        int[] arrayProductoEscalar = calcularProductoEscalar(array, escalar);
        imprimirInformacion(array, arrayProductoEscalar);
        
    }


    static int[] calcularProductoEscalar(int[] array, int escalar) {

        int[] arrayProductoEscalar = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayProductoEscalar[i] = array[i] * escalar;
        }
        return arrayProductoEscalar;
    }

    static void imprimirInformacion(int[] array, int[] arrayProductoEscalar) {
        System.out.printf("El array original es: %s%n", java.util.Arrays.toString(array));
        System.out.printf("El array con el producto escalar es: %s%n", java.util.Arrays.toString(arrayProductoEscalar));
    }

}
