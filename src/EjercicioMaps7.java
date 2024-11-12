import java.util.Map;
import java.util.Scanner;

public class EjercicioMaps7 {
    public static void main(String[] args) {
        double suma = 0.0;
        Scanner scanner = new Scanner(System.in);
        String curso;

        final Map<String, Double> map = crearMap();
        mostrarKeys(map);

        do {
            System.out.println("Ingrese el curso:");
            curso = scanner.nextLine();

            if (!curso.equals("salir")) {

                if (map.containsKey(curso)) {
                    suma = suma + map.get(curso);
                } else {
                    System.out.println("Curso no encontrado");
                }
            }

        } while (!curso.equals("salir"));
        scanner.close();
        mostrarPrecioFinal(suma);
    }

    static Map<String, Double> crearMap() {
        return Map.of(
                "Java", 49.99,
                "Selenium", 55.55,
                "Appium", 44.99,
                "RestAssured", 39.99
        );
    }

    static void mostrarKeys(Map<String, Double> map) {
        for (Map.Entry<String, Double> key : map.entrySet()) {
            System.out.printf("Key: %s%n", key.getKey());
        }
    }

    static void mostrarPrecioFinal(double suma) {
        System.out.printf("El precio total de los cursos ingresados es %.2f%n", suma);
    }

}
