import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InvertirNumeros {
    public static void main(String[] args) {
        final var random = new Random();
        List<Integer> listaOriginal = RandomUtilities.generarListaIntAleatoria(random, 10, 3, 300);

        List<Integer> listaInvertida = invertirLista(listaOriginal);

        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista Invertida: " + listaInvertida);
    }

    static List<Integer> invertirLista(List<Integer> listaOriginal) {
        List<Integer> listaInvertida = new ArrayList<>();

        // Recorrer cada número en la lista original
        for (int numero : listaOriginal) {
            // Invertir los dígitos del número
            int numeroInvertido = invertirNumero(numero);
            listaInvertida.add(numeroInvertido); // Agregar el número invertido a la lista invertida
        }

        return listaInvertida; // Retornar la lista de números invertidos
    }

    // Método para invertir los dígitos de un número
    static int invertirNumero(int numero) {
        int numeroInvertido = 0;

        while (numero > 0) {
            // Obtener el último dígito
            int digito = numero % 10;
            // Añadir el dígito a la nueva posición
            numeroInvertido = numeroInvertido * 10 + digito;
            // Eliminar el último dígito del número original
            numero /= 10;
        }

        return numeroInvertido; // Retornar el número invertido
    }
}
