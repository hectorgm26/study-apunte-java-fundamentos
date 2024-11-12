import java.util.Scanner;

public class EjercicioOrdenamientoBurbuja3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        array[0] = ScannerManager.leerInt(scanner, "Ingrese el primer número "); // 75
        array[1] = ScannerManager.leerInt(scanner, "Ingrese el segundo número "); // 64
        array[2] = ScannerManager.leerInt(scanner, "Ingrese el tercer número "); // 99
        array[3] = ScannerManager.leerInt(scanner, "Ingrese el cuarto número "); // 21
        array[4] = ScannerManager.leerInt(scanner, "Ingrese el quinto número "); // 32

        System.out.printf("El array aleatorio es: %s%n", java.util.Arrays.toString(array));

        int n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }

        System.out.printf("El array ordenado de mayor a menor es: %s", java.util.Arrays.toString(array));


    }
}
