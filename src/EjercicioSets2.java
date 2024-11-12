import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjercicioSets2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> listaUtilesHijoMayor = crearSeUtiles1();
        Set<String> listaUtilesHijoMenor = crearSetUtiles2(scanner);

        listaUtilesHijoMayor.removeAll(listaUtilesHijoMenor); // elimina los elementos que se encuentran en ambos sets, ya que los padres necesitan corroborar que utiles les faltan
        imprimirSet(listaUtilesHijoMayor);                      // lo cual deja solo los utiles que faltans
    }

    static Set<String> crearSeUtiles1() {
        return new HashSet<>(Arrays.asList("lapicero", "borrador", "lonchera", "mochila", "corrector", "goma", "tijera"));
    }

    static Set<String> crearSetUtiles2(Scanner scanner) {
        Set<String> lista2 = new HashSet<>();
        String utiles;

        do {
            System.out.println("Ingrese los utiles que necesita su hijo: ");
            utiles = scanner.nextLine();

            if (!utiles.equals("salir")) {
                lista2.add(utiles);
            }

        } while (!utiles.equals("salir"));
        return lista2;
    }

    static void imprimirSet(Set<String> listaUtilesHijoMayor) {
        System.out.printf("El set de utiles del hijo mayor es: %s%n", listaUtilesHijoMayor);
    }
}
/*
A UNA FAMILIA SE LE PERDIO LA LISTA DE UTILES DE SU HIJO
Y TIENEN LA LISTA ANTIGUO DE SU HIJO MAYOR, Y NECESITAN SABER QUE UTILES LES FALTAB
 */
