import java.util.Map;
import java.util.Scanner;

public class EjercicioMaps3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String juguete;
        final Map<String, Double> map = crearMap();

        mostrarMap(map);
        System.out.println("Ingrese un juguete para ver su precio");
        juguete = scanner.nextLine();

        if (map.containsKey(juguete)) {
            mostrarPrecioJuguete(juguete, map.get(juguete));
        } else {
            System.out.println("Juguete no encontrado");
        }
        scanner.close();
    }

    static Map<String, Double> crearMap() {
        return Map.of(
                "Carro", 25.12,
                "Camion", 5.64,
                "Pelota", 8.25,
                "Robot", 25.50
        );
    }

    static void mostrarMap(Map<String, Double> map) {
        System.out.printf("El map es: %s%n", map);
    }

    static void mostrarPrecioJuguete(String juguete, double precio) {
        System.out.printf("El precio del juguete %s es: %.2f%n", juguete, precio);
    }


}
