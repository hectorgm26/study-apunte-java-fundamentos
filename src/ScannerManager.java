import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerManager {

    static int leerInt(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Solo se aceptan numeros enteros");
            return -1;
        }
    }

    static double leerDouble(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextDouble();
    }

    static String leerString(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextLine();
    }

    static char leerChar(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.next().charAt(0);
    }
    // LOS DATOS CHAR SIEMPRE DEBEN IR CON COMILLAS SIMPLES

    static boolean leerBoolean(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextBoolean();
    }
}
