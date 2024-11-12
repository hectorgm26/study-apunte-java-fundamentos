import java.util.List;
import java.util.Random;

public class EjercicioListas3 {
    public static void main(String[] args) {
        final var random = new Random();
        List<Integer> lista = RandomUtilities.generarListaIntAleatoria(random, 30, 10, 500);

        imprimirLista(lista);
        orderLista(lista);
        imprimirLista(lista);
    }

    static List<Integer> imprimirLista(List<Integer> lista) {
        System.out.printf("La lista aleatoria es: %s%n", lista);
        return lista;
    }

    static void orderLista(List<Integer> lista) {
        int n = lista.size();

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    final var temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);   // SIEMPRE LAS LISTAS SE ACCEDEN A TRAVÉS DE LOS MÉTODOS GET Y SET
                }
            }
        }
    }
}
