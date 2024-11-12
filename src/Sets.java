import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        // SI YA SE CONOCEN LOS VALORES INICIALES
        Set<Integer> setNumeros = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Set<String> setNombres = new HashSet<>(Arrays.asList("Juan", "Pedro", "Maria", "Luis", "Ana", "Juan"));

        // SI NO SE CONOCEN LOS VALORES INICIALES
        Set<Integer> setNumeros2 = new HashSet<>();
        Set<String> setNombres2 = new HashSet<>();

        // AGREGAR ELEMENTOS
        setNumeros2.add(1);

        // MOSTRARLOS EN CONSOLA
        System.out.printf("El set de numeros es: %s%n", setNumeros);

        // TAMAÑO - size()
        System.out.printf("El tamaño del set de numeros es: %d%n", setNumeros.size());

        // AL CARECER DE INDICES, SOLO SE RECORREN CON FOR EACH
        for (String nombre : setNombres) {
            System.out.printf("El nombre es: %s%n", nombre);
        }

        // Validar si elemento existe - contains - devuelve un boolean
        if (setNombres.contains("Juan")) {
            System.out.println("El nombre Juan si existe");
        } else {
            System.out.println("El nombre Juan no existe");
        }

        // ACUMULAR O CONTAR VALORES - solo con for each
        int suma = 0;
        for (int numero : setNumeros) {
            suma = suma + numero;
        }
        int contador = 0;
        for (String nombre : setNombres) {
            contador++;
        }

        // UNIR DATA ENTRE DOS SET - metodo addAll
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));

        setA.addAll(setB);
        System.out.printf("La union de los sets es: %s%n", setA);

        // INTERSECCION DE DOS SET - metodo retainAll - SON ELEMENTOS EN COMUN
        setA.retainAll(setB);
        System.out.printf("La interseccion de los sets es: %s%n", setA);

        // ELIMINAR ELEMENTOS DE OTRO SET - metodo removeAll - queda un solo set con los elementos unicos
        // ES LA DIFERENCIA ENTRE DOS SETS
        // eL SET que aplica el metodo queda con los elementos unicos de este, quitando los elementos comunes que se encontrasen en el otro
        // NO ES CONMUTATIVA, ES DECIR A-B NO ES LO MISMO QUE B-A
        setA.removeAll(setB);
        System.out.printf("El resultado de A - B es: %s%n", setA);


    }
}


/*
Coleccion que no acepta valores repetidos, y que tampoco tiene un orden definido, por no tener indices
Se usa en problemas de teoria de conjuntos o para filtrar valores repetidos de otra coleccion
tienen tamaño dinamico, pueden crecer o decrecer
El set debe contener el mismo tipo de dato, que debe ser una clase, es decir, Integers, Double, String, etc

PASARLOS COMO PARAMETRO
static void iprimirSet(Set<String> setNombres)

PASARLOS COMO RETORNO
static Set<String> getSetNombres()
    return new HashSet<>(Arrays.asList("Juan", "Pedro", "Maria", "Luis", "Ana", "Juan"));
 */
