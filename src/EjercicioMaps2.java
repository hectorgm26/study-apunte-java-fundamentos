import java.util.Map;
import java.util.Scanner;

public class EjercicioMaps2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String producto;
        final Map<String, Double> map = crearMap();
        double precioTotal = 0;

        System.out.println(map);

        do {
            System.out.println("Ingrese el item que desea comprar:");
            producto = scanner.nextLine();

            if (!producto.equals("salir")) {
                precioTotal = precioTotal + calcularPrecio(producto, map);
            }

        } while (!producto.equals("salir"));

        scanner.close();
        System.out.printf("El precio total de los productos es: %.2f%n", precioTotal);

    }

    static Map<String, Double> crearMap() {
        return Map.of(
                "Robot", 15.21,
                "Pelota", 23.12,
                "Carro", 11.68,
                "Oso", 5.84,
                "Baraja", 9.99,
                "Bateria", 43.12
        );
    }

    static double calcularPrecio(String producto, Map<String, Double> map) {

        if (map.containsKey(producto)) {
            return map.get(producto);
        } else {
            System.out.println("Producto no encontrado");
            return 0;
        }
        // NO SE AGREGA EL ACUMULADOR DE PRECIO TOTAL ACA, YA QUE AL INICIALIZARSE EN 0, POR CADA ITERACION, SE PERDERA EL VALOR ACUMULADO
    }
}
