import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var random = new Random();
        int tamañoArray = ScannerManager.leerInt(scanner, "Ingrese el tamaño del array");
        int min = ScannerManager.leerInt(scanner, "Ingrese el valor minimo");
        int max = ScannerManager.leerInt(scanner, "Ingrese el valor maximo");

        int[] array1 = RandomUtilities.generarArrayRandomInt(random, tamañoArray, min, max);
        int[] array2 = RandomUtilities.generarArrayRandomInt(random, tamañoArray, min, max);

        int[] arraySuma = calcularSumaArrays(array1, array2);
        imprimirInformacion(array1, array2, arraySuma);

    }


    static int[] calcularSumaArrays(int[] array1, int[] array2) {
        int tamañoArray = array1.length;
        int[] arraySuma = new int[tamañoArray];

        for (var i = 0; i < tamañoArray; i++) {
            arraySuma[i] = array1[i] + array2[i];
        }
        return arraySuma;
    }

    static void imprimirInformacion(int[] array1, int[] array2, int[] arraySuma) {
        System.out.printf("El array 1 es: %s%n", java.util.Arrays.toString(array1));
        System.out.printf("El array 2 es: %s%n", java.util.Arrays.toString(array2));
        System.out.printf("La suma de los arrays es: %s%n", java.util.Arrays.toString(arraySuma));

    }

}
