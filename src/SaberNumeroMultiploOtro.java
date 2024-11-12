import java.util.Random;

public class SaberNumeroMultiploOtro {
    public static void main(String[] args) {
        final var random = new Random();
        final var max = 25;
        final var min = 10;

        final var num = random.nextInt((max - min) + 1) + min;

        final var esPar = num % 2 == 0;  // Si es par, es divisible por 2, y no tiene resto
        final var esImpar = num % 2 != 0;  // Si es impar, al no ser divisible por 2, si tendra resto, es decir, tendra un numero distinto a cero

        final var esMultiplo3 = num % 3 == 0;
        final var esMultiplo5 = num % 5 == 0;

        System.out.printf("El numero generado es %d%n", num);
        System.out.printf("¿El numero es par? %b%n", esPar);
        System.out.printf("¿El numero es impar? %b%n", esImpar);
        System.out.printf("¿El numero es multiplo de 3? %b%n", esMultiplo3);
        System.out.printf("¿El numero es multiplo de 5? %b%n", esMultiplo5);
    }

    /*
    Se deben comparar el resto/residuo de la división de dos números para saber si uno es múltiplo del otro.
    Todas las comparacioes retornan un boolean
    Para el resto se utiliza el operador %
     */
}
