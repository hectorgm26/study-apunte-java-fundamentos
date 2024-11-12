import java.util.Arrays;
import java.util.Random;

public class ArraysRandom {

    public static void main(String[] args) {
        final var random = new Random();

        final int[] arrayInt = RandomUtilities.generarArrayRandomInt(random, 10, 10, 100);
        final double[] arrayDouble = RandomUtilities.generarArrayRandomDouble(random, 5, 10, 30);

        System.out.printf("El array aleatorio de numeros enteros es: %s%n", Arrays.toString(arrayInt));

        System.out.printf("El array aleatorio de numeros decimales es: %s%n", Arrays.toString(arrayDouble));
    }


}
