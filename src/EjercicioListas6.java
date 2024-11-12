import java.util.List;
import java.util.Random;

public class EjercicioListas6 {
    public static void main(String[] args) {
        final var random = new Random();

        List<Integer> listaAleatoria = RandomUtilities.generarListaIntAleatoria(random, 30, 5, 70);
        int suma = 0;
        System.out.printf("La lista aleatoria es: %s%n", listaAleatoria);

        for (int cuenta : listaAleatoria) {
            if (cuenta % 3 == 0) {
                suma = suma + cuenta;
            }
        }

        System.out.printf("La suma de los numeros divisibles por 3 es %d%n", suma);

    }
}
