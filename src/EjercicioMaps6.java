import java.util.Map;
import java.util.Scanner;

public class EjercicioMaps6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Map<String, Integer> map = crearMap();
        mostrarKeys(map);
        String navegador;

        do {
            System.out.println("Ingrese el navegador por el cual consulta");
            navegador = scanner.nextLine();

            if (!navegador.equals("salir")) {
                mostrarRamNavegador(navegador, map.get(navegador));
            }

        } while (!navegador.equals("salir"));
        scanner.close();

    }

    static Map<String, Integer> crearMap() {
        return Map.of(
                "Chrome", 16,
                "Safari", 8,
                "Firefox", 4,
                "Edge", 8
        );
    }

    static void mostrarKeys(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> key : map.entrySet()) {
            System.out.printf("Key: %s%n", key.getKey());
        }
    }

    static void mostrarRamNavegador(String navegador, int ram) {
        System.out.printf("El navegador %s consume %d GB de RAM%n", navegador, ram);
    }


}
