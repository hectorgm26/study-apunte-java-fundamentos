import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var random = new Random();
        int tamañoArray = ScannerManager.leerInt(scanner, "Ingrese el tamaño del array ");
        int min = ScannerManager.leerInt(scanner, "Ingrese el valor minimo ");
        int max = ScannerManager.leerInt(scanner, "Ingrese el valor maximo ");

        double[] array1 = RandomUtilities.generarArrayRandomDouble(random, tamañoArray, min, max);
        double[] array2 = RandomUtilities.generarArrayRandomDouble(random, tamañoArray, min, max);

        double promedioPonderado = calcularPromedioPonderado(array1, array2);
        imprimirInformacion(array1, array2, promedioPonderado);

    }

    static double calcularPromedioPonderado(double[] array1, double[] array2) {
        double suma = 0;
        double producto;
        int tamañoArray = array1.length;

        for (var i = 0; i < tamañoArray; i++) {
            producto = array1[i] * array2[i];
            suma = suma + producto;
            // esto se podia hacer en una sola linea
            // suma += array1[i] * array2[i];
            // suma = suma + (array1[i] * array2[i]);
        }
        return suma / tamañoArray;
    }

    static void imprimirInformacion(double[] array1, double[] array2, double promedioPonderado) {
        System.out.printf("El array 1 es: %s%n", java.util.Arrays.toString(array1));
        System.out.printf("El array 2 es: %s%n", java.util.Arrays.toString(array2));
        System.out.printf("El promedio ponderado es: %.2f%n", promedioPonderado);
    }


}
