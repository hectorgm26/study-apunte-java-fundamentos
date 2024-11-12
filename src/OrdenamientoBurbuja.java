public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        int[] array = new int[5];
        final var n = array.length;

        for (var i = 0; i < n; i++) {   // cantidad de pasos, que es n - 1
            for (var j = 0; j < n - i - 1; j++) {   // cantidad de subpasos o comparaciones, que van de 0 hasta n - i - 1
                // n - i - 1, lo que significa que se comenzara en 0 hasta 4, luego 0 hasta 3, luego 0 hasta 2, luego 0 hasta 1, y por ultimo 0
                if (array[j] > array[j + 1]) {   // si se quiere de mayor a menor, se cambia el signo, ya que aca es de menor a mayor
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // son dos ciclos for, porque se necesita recorrer el array, para poder imprimirlo
        // el primer for se refiere a que el numero en la posicion 0 se comparara con los demas, y asi sucesivamente
        // y a traves del segundo for, ese numero se comparara con los numeros siguientes, y este cambia la posicion si es necesario

    }
}
