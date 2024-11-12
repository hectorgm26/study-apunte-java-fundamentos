import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Listas {
    public static void main(String[] args) {

        // SI SE CONOCEN VALORES INICIALMENTE
        // La listas creadas con Arrays.asList no pueden ser modificadas en su tamaño
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);
        List<String> listaNombres = Arrays.asList("Juan", "Pedro", "Maria", "Luisa");

        // SI NO SE CONOCEN VALORES INICIALMENTE
        List<Integer> listaNumeros2 = new ArrayList<Integer>();
        List<String> listaNombres2 = new ArrayList<String>();

        // AGREGAR ELEMENTOS A LA LISTA
        listaNumeros2.add(5); // indice 0
        listaNumeros2.add(3);
        listaNumeros2.add(1);

        //ACTUALIZAR ELEMENTO DE LA LISTA
        listaNumeros2.set(0, 15); // se actualiza el valor en la posicion 0, por el valor 15

        // OBTENER VALOR DE UNA POSICION - metodo get
        System.out.printf("El elemento con index 1 es: %d%n", listaNumeros2.get(1));

        // MOSTRAR LISTA COMPLETA (se convierte a string usando %s ya que se accede al metodo toString)
        System.out.printf("La lista de numeros es: %s%n", listaNumeros2);

        // OBTENER TAMAÑO - metodo size
        System.out.printf("El tamaño de la lista es: %d%n", listaNumeros2.size());

        // OBTENER ULTIMO ELEMENTO DE LA LISTA - size - 1
        System.out.printf("El ultimo elemento de la lista es: %d%n", listaNumeros2.get(listaNumeros2.size() - 1));

        // Recorrer lista con bucle for
        int n = listaNombres.size();
        for (var i = 0; i < n; i++) {
            System.out.printf("Index: %d, valor: %s%n", i, listaNombres.get(i));
        }

        // Recorrer lista con bucle for-each (si solo queremos los valores y no los indices)
        for (String nombres : listaNombres) {
            System.out.printf("Nombre: %s%n", nombres);
        }

        // VALIDAR SI UN ELEMENTO EXISTE EN LA LISTA - metodo contains
        List<String> listaInvitados = Arrays.asList("Carlos", "Jorge", "Mariana", "Rodrigo", "Jimena");

        if (listaInvitados.contains("Carlos")) {
            System.out.println("Carlos si esta en la lista de invitados");
        } else {
            System.out.println("Carlos no esta en la lista de invitados");
        }

        // VALIDAR SI LISTA ESTA VACIA - metodo isEmpty, retorna un boolean
        List<Integer> numeros = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> listaPares = new ArrayList<Integer>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                listaPares.add(numero);
            }
        }

        if (listaPares.isEmpty()) {
            System.out.println("No hay numeros pares en la lista");
        } else {
            System.out.printf("Los numeros pares son: %s%n", listaPares);
        }

        // AUMENTAR O CONTAR VALORES CON LISTAS
        int suma = 0;
        for (int elemento : listaNumeros) {
            suma = suma + elemento;
        }

        int contador = 0;
        for (int multiplos : listaNumeros) {
            if (multiplos % 5 == 0) {
                contador++;
            }
        }

        // LISTAS ALEATORIAS
        final var random = new Random();
        List<Integer> listaAleatoria = RandomUtilities.generarListaIntAleatoria(random, 20, 50, 100);
        System.out.printf("La lista aleatoria de numeros enteros es %s%n", listaAleatoria);


    }
}
/*
    Coleccion de datos
    tienen tamaño dinamico y se pueden agregar o quitar elementos, partiendo su indice de 0
    Deben contener un mimso tipo de dato y debe ser una clase, es decir Integer, Double, String, etc
    Y si se quieren usar tipos primitivos, se deben usar sus analogos en wrapper class

  */

/*   USARLOS EN LOS HEADERS DE LOS METODOS

    static void mostrarValores(List<String> lista) {
        for (String valor : lista) {
            System.out.printf("Valor: %s%n", valor);
        }
    }
*/

/*  USARLOS COMO RETORNO DE UN METODO

    static List<String> crearNombres() {
        returns Arrays.asList("Juan", "Pedro", "Maria", "Luisa");
    }
 */
