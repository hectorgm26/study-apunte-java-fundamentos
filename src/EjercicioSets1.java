import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioSets1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> grupo1 = crearSetGrupo1();
        Set<String> grupo2 = crearSetGrupo2(scanner);

        grupo1.addAll(grupo2);
        imprimirSet(grupo1);
    }

    static Set<String> crearSetGrupo1() {
        return new HashSet<>(Arrays.asList("oso", "carro", "patito", "robot", "pelota"));
    }

    static Set<String> crearSetGrupo2(Scanner scanner) {
        Set<String> grupo2 = new HashSet<>();
        String regalo;

        while (true) {
            System.out.println("Ingresa regalos para el grupo 2:");
            regalo = scanner.nextLine();

            if ((regalo.equals("salir"))) {
                break;
            } else {
                grupo2.add(regalo);
            }
        }
        return grupo2;
    }

    static void imprimirSet(Set<String> grupo1) {
        System.out.printf("El set de regalos completos es: %s%n", grupo1);
    }
}
