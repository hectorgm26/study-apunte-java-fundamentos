import java.util.Map;
import java.util.Scanner;

public class EjercicioMaps1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idUsuario;
        final Map<Integer, String> map = crearMap();

        do {
            System.out.println("Ingrese el id del usuario que desea buscar: ");
            idUsuario = scanner.nextInt();

            if (idUsuario != -1) {
                mostrarUsuario(idUsuario, map);
            }


        } while (idUsuario != -1);
        scanner.close();
    }

    static Map<Integer, String> crearMap() {
        return Map.of(
                1, "CocoX",
                2, "Socrates",
                3, "Calvario",
                4, "Kitty",
                5, "JavaJavaDu",
                6, "Rexxes"
        );
    }

    static void mostrarUsuario(int id, Map<Integer, String> map) {
        if (map.containsKey(id)) {
            System.out.printf("El usuario con id %d es %s%n", id, map.get(id));
        } else {
            System.out.printf("Id %d no encontrado en la BD%n", id);
        }
    }
}
