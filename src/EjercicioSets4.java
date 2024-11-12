import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioSets4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> juegosPersonales = crearSetJuegosPersonales();
        Set<String> juegosAmigo = crearSetJuegosAmigo(scanner);

        juegosPersonales.removeAll(juegosAmigo);

        System.out.printf("Los juegos que no tiene en comun son: %s%n", juegosPersonales);
    }

    static Set<String> crearSetJuegosPersonales() {
        return new HashSet<>(Arrays.asList("mario", "zelda", "metroid", "splatoon", "god of war", "gta 5"));
    }

    static Set<String> crearSetJuegosAmigo(Scanner scanner) {
        Set<String> lista2 = new HashSet<>();
        String juego;

        do {
            System.out.println("Ingrese el juego que desea saber si lo tiene en comun: ");
            juego = scanner.nextLine();

            if (!juego.equals("salir")) {
                lista2.add(juego);
            }

        } while (!juego.equals("salir"));

        return lista2;
    }
}
