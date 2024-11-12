import java.util.Map;
import java.util.Scanner;

public class EjercicioMaps5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String curso;
        Map<String, Integer> map = crearMap();
        mostrarKeys(map);

        System.out.println("Ingrese el curso que desea buscar: ");
        curso = scanner.nextLine();

        if (map.containsKey(curso)) {
            mostrarResultado(curso, map.get(curso));
        } else {
            System.out.println("Curso no encontrado");
        }
    }

    static Map<String, Integer> crearMap() {
        return Map.of(
                "Matematica", 2,
                "Lenguaje", 3,
                "Fisica", 4,
                "Quimica", 5
        );
    }

    static void mostrarKeys(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> key : map.entrySet()) {
            System.out.printf("Key: %s%n", key.getKey());
        }
    }

    static void mostrarResultado(String curso, int cantidadCreditos) {
        System.out.printf("El curso %s tiene %d creditos%n", curso, cantidadCreditos);
    }

}
