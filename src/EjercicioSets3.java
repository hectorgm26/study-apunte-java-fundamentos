import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioSets3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> animales1 = crearSetAnimales1();
        Set<String> animales2 = crearSetAnimales2(scanner);

        animales1.retainAll(animales2);

        imprimirSet(animales1);
    }

    static Set<String> crearSetAnimales1() {
        return new HashSet<>(Arrays.asList("oso", "gorila", "zebra", "leon", "pantera"));
    }

    static Set<String> crearSetAnimales2(Scanner scanner) {
        Set<String> lista2 = new HashSet<>();
        String animales;

        do {
            System.out.println("Ingrse el animal que desea saber si lo tiene en comun: ");
            animales = scanner.nextLine();

            if (!animales.equals("salir")) {
                lista2.add(animales);
            }

        } while (!animales.equals("salir"));
        return lista2;
    }

    static void imprimirSet(Set<String> listaAnimales) {
        System.out.printf("Los animales en comun son: %s%n", listaAnimales);
    }

}
