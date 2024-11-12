import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var random = new Random();

        int tamañoArray = ScannerManager.leerInt(scanner, "Ingrese el tamaño del array ");
        int min = ScannerManager.leerInt(scanner, "Ingrese el valor minimo ");
        int max = ScannerManager.leerInt(scanner, "Ingrese el valor maximo ");

        double[] arrayRadios = RandomUtilities.generarArrayRandomDouble(random, tamañoArray, min, max);

        double arrayPerimetros[] = calcularArrayPerimetro(arrayRadios);

        double arrayAreas[] = calcularArrayArea(arrayRadios);
        imprimirInformacion(arrayRadios, arrayPerimetros, arrayAreas);

    }

    static double[] calcularArrayPerimetro(double[] arrayRadios) {
        int tamañoArray = arrayRadios.length;
        double[] arrayPerimetros = new double[tamañoArray];

        for (int i = 0; i < tamañoArray; i++) {
            arrayPerimetros[i] = 2 * Math.PI * arrayRadios[i];
        }
        return arrayPerimetros;
    }

    static double[] calcularArrayArea(double[] arrayRadios) {
        int tamañoArray = arrayRadios.length;
        double[] arrayAreas = new double[tamañoArray];

        for (var i = 0; i < tamañoArray; i++) {
            arrayAreas[i] = Math.PI * Math.pow(arrayRadios[i], 2);
        }
        return arrayAreas;

    }

    static void imprimirInformacion(double[] arrayRadios, double[] arrayPerimetros, double[] arrayAreas) {
        System.out.printf("El array de radios es: %s%n", java.util.Arrays.toString(arrayRadios));
        System.out.printf("El array de perimetros es: %s%n", java.util.Arrays.toString(arrayPerimetros));
        System.out.printf("El array de areas es: %s%n", java.util.Arrays.toString(arrayAreas));
    }


}
