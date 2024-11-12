import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InvertirLista {
    public static void main(String[] args) {
        final var random = new Random();
        List<Integer> listaOriginal = RandomUtilities.generarListaIntAleatoria(random, 10, 3, 300);

        List<Integer> listaInvertida = invertirLista(listaOriginal);

        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista Invertida: " + listaInvertida);
    }

    static List<Integer> invertirLista(List<Integer> listaOriginal) {

        List<Integer> listaInvertida = new ArrayList<>();
        int n = listaOriginal.size();

        // Recorrer la lista desde el final hasta el principio
        // se parte i por n - 1, que es la ultima posicion
        // hasta que i sea mayor o igual a 0, ya que el 0 es la primera posición
        for (int i = n - 1; i >= 0; i--) {
            listaInvertida.add(listaOriginal.get(i)); // Agregar cada número a la lista invertida
        }
        return listaInvertida;
    }
}
