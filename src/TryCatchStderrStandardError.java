import java.util.Random;
import java.util.Scanner;

public class TryCatchStderrStandardError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final var random = new Random();
        int[] array = RandomUtilities.generarArrayRandomInt(random, 5, 10, 100);
        int opcion;
        System.out.printf("El array es %s%n", java.util.Arrays.toString(array));

        do {
            System.out.println("Ingrese un index para buscar el valor en el array, -1 para salir");
            opcion = scanner.nextInt();

            if (opcion != -1) {
                try {
                    System.out.printf("El vallor del array con index %d es %d%n", opcion, array[opcion]);

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.printf("Error de tipo ArrayIndexOutOfBoundsException: %s%n", e.getLocalizedMessage());
                    System.out.println("El index ingresado no existe en el array");
                } finally {
                    System.out.println("Ejecucion finalizada");
                }
            }
        } while (opcion != -1);
        scanner.close();
    }
}

/*
Cuando se lanza una excepcion, se puede mostrar un mensaje de error en la consola de la siguiente manera:
System.err.printf("Mensaje de error%n"), o System.err.println("Mensaje de error")
SALE EN ROJO EN CONSOLA
Es buena pratica mostrar los mensajes de error en la consola de error, para que se diferencie de los mensajes normales
Y tambien es buena pratica especificar el tipo de error que se esta mostrando en el catch con el siguiente formato:
System.err.printf("Error de tipo %s: %s%n", ArithmeticException.getLocalizedMessage());

EJEMPLO:
try {
    // CODIGO QUE PUEDE LANZAR UNA EXCEPCION
} catch (Exception e) {
    System.err.printf("Error de tipo %s: %s%n", ArithmeticException.getLocalizedMessage());
    system.out.println("Ha ocurrido un error");
}

ATAJO serr

EL PROGRAMA NO SE CAE, PESE A LANZAR UNA EXCEPCION Y EL ERROR, SIGUE CON SU EJECUCION
 */
