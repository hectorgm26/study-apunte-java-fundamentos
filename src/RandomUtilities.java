import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtilities {
    static int generarRandomInt(Random random, int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    static double generarRandomDouble(Random random, double min, double max) {
        return (max - min) * random.nextDouble() + min;
    }

    static int[] generarArrayRandomInt(Random random, int n, int min, int max) {
        final int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = generarRandomInt(random, min, max);
        }
        return array;
    }
    // Se crea un método que recibe un objeto de tipo Random, un entero n, un entero min y un entero max
    // Se crea un arreglo, siendo n el tamaño del arreglo
    // Se recorre el arreglo y se asigna a cada posición un número entero aleatorio entre min y max
    // Se retorna el arreglo

    static double[] generarArrayRandomDouble(Random random, int n, double min, double max) {
        final double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            array[i] = generarRandomDouble(random, min, max);
        }
        return array;
    }

    static List<Integer> generarListaIntAleatoria(Random random, int n, int min, int max) {
        final List<Integer> listaAleatoria = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomInt(random, min, max));
        }
        return listaAleatoria;
    }

    static List<Double> generarListaDoubleAleatoria(Random random, int n, double min, double max) {
        final List<Double> listaAleatoria = new ArrayList<Double>();

        for (int i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomDouble(random, min, max));
        }
        return listaAleatoria;
    }

}