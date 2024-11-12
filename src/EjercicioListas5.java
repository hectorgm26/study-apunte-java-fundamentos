import java.util.ArrayList;
import java.util.List;

public class EjercicioListas5 {
    public static void main(String[] args) {
        List<Integer> listaInts = new ArrayList<Integer>();
        int contador0 = 0;
        int contador5 = 0;

        listaInts.add(32);
        listaInts.add(10);
        listaInts.add(25);
        listaInts.add(36);
        listaInts.add(42);
        listaInts.add(50);
        listaInts.add(100);

        for (int cuenta : listaInts) {
            if (cuenta % 10 == 0) {
                contador0 = contador0 + 1;
            }
            
            if (cuenta % 5 == 0) {
                contador5 = contador5 + 1;
            }
        }

        System.out.printf("La lista es %s%n", listaInts);
        System.out.printf("La cantidad de numeros que terminan en 10 es %d%n", contador0);
        System.out.printf("La cantidad de numeros que terminan en 5 es %d%n", contador5);
    }
}
