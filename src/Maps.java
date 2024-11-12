import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        // SI YA SE CONOCEN LOS VALORES INICIALES
        final Map<Integer, String> mapPersonas = Map.of(
                1, "Carlos",
                2, "Rodrigo",
                3, "Jorge",
                4, "Alonso"
        );

        // SI NO SE CONOCEN LOS VALORES INICIALES
        final Map<Integer, String> mapPersonas2 = new HashMap<Integer, String>(); // key es integer y la clave un string
        final Map<Integer, Double> mapNumeros = new HashMap<Integer, Double>();   // key es integer y la clave un double

        // AGREGAR VALORES - metodo put
        mapPersonas2.put(1, "Carlos"); // se le pasa el par key-value
        mapPersonas2.put(2, "Ana");

        // OBTENER VALORES - metodo get y se le pasa la key del valor
        System.out.printf("La persona con id=2 tiene el nombre de %s%n", mapPersonas2.get(2));

        // MOSTRAR MAP EN CONSOLA- printf y %s
        System.out.printf("El map es: %s%n", mapPersonas2);

        // VALIDAR ELEMENTOS EXISTENTES EN UN MAP - metodo containsKey y containsValue (retorna un boolean)
        if (mapPersonas.containsKey(2)) {
            System.out.println("El map contiene la key 2");
        } else {
            System.out.println("El map no contiene la key 2");
        }

        if (mapPersonas.containsValue("Jorge")) {
            System.out.println("El map contiene el valor Jorge");
        } else {
            System.out.println("El map no contiene el valor Jorge");
        }

        // RECORRER MAP CON BUCLE FOR EACH
        // se usa un objeto de tipo Entry que es un par de datos
        // se usa el metodo entrySet() para obtener los pares de datos
        // no se itera el map, si no el entrySet
        // SOLO CON ENTRY SET PODEMOS ACCEDER A LA KEY
        for (Map.Entry<Integer, String> par : mapPersonas.entrySet()) {
            System.out.printf("Key %d - value %s%n", par.getKey(), par.getValue());
        }

    }
}
/*
Coleccion de datos que se almacenan pares de datos en clave-valor
Especifica key sencillas para acceder a valores complicados
El key es generalmente unico, y de tipo Integer o String
El valor puede ser de cualquier tipo, pero tiene que ser una clase Integer, String, Double, etc
El map no mantiene el orden de los elementos de los pares que se ingresa

Ejemplo:
Key 252 - value Carlos

MAPS EN HEADERS DE METODOS
static void imprimirValores(Map<String, Integer> map) {
    for (Map.Entry<String, Integer> par : map.entrySet()) {
        System.out.printf("Key %s - value %d%n", par.getKey(), par.getValue());
    }

MAPS EN RETORNO DE METODOS
static Map<String, Integer> crearMapStock() {
    return Map.of(
    "Papas", 100,
    "Manzanas", 50,
    "Peras", 30
);
 */
