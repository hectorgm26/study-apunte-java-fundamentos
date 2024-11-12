import java.util.Map;
import java.util.Random;

public class EjercicioMaps4 {
    public static void main(String[] args) {
        final var random = new Random();
        int numAleatorio = RandomUtilities.generarRandomInt(random, 1, 5);

        Map<Integer, String> map = crearMap();
        mostrarMap(map);

        if (map.containsKey(numAleatorio)) {
            mostrarResultado(numAleatorio, map.get(numAleatorio));
        }
    }

    static Map<Integer, String> crearMap() {
        return Map.of(
                1, "Jorge",
                2, "Rodrigo",
                3, "Mariana",
                4, "Casandra",
                5, "Lizbeth"
        );
    }

    static void mostrarMap(Map<Integer, String> map) {
        System.out.printf("El map es: %s%n", map);
    }

    static void mostrarResultado(int numAleatorio, String nombre) {
        System.out.printf("El numero aleatorio %d corresponde a %s%n", numAleatorio, nombre);
    }
}
