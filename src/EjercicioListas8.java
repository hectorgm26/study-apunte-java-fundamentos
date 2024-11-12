import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioListas8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la lista, tiene que ser mayor a 2");

        n = scanner.nextInt();

        while (n <= 2) {
            System.out.println("Ingrese el tamaño de la lista, tiene que ser mayor a 2");
            n = scanner.nextInt();
        }
        scanner.close();

        List<Integer> listaFibonacci = crearListaFinonacci(n);

        mostrarLista(listaFibonacci);

    }

    static void mostrarLista(List<Integer> listaFibonacci) {
        System.out.printf("La lista fibonacci es: %s%n", listaFibonacci);
    }


    static List<Integer> crearListaFinonacci(int n) {
        List<Integer> lista = new ArrayList<>();

        int anterior = 0;
        int actual = 1;
        lista.add(anterior);
        lista.add(actual);
        
        for (var i = 0; i < n - 2; i++) {
            int temp = anterior + actual;
            anterior = actual;
            actual = temp;

            lista.add(actual);
        }
        return lista;
    }

}

