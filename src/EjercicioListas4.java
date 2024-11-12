import java.util.Arrays;
import java.util.List;

public class EjercicioListas4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 10, 2, 3, 4, 22);
        int numeroPares = 0;
        int numeroImpares = 0;

        for (int contador : numeros) {
            if (contador % 2 == 0) {
                numeroPares = numeroPares + 1;
            } else {
                numeroImpares = numeroImpares + 1;
            }
        }

        System.out.printf("La lista es %s%n", numeros);
        System.out.printf("La cantidad de numeros pares es %d%n", numeroPares);
        System.out.printf("La cantidad de numeros impares es %d%n", numeroImpares);
    }
}
