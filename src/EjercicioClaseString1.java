public class EjercicioClaseString1 {
    public static void main(String[] args) {

        String[] nombres = new String[]{"Carlos", "Rodrigo", "Juan", "Arturo", "Daniel", "Mayra"};
        System.out.println(java.util.Arrays.toString(nombres));

        ordenarArray(nombres);
        mostrarArray(nombres);
    }

    static void ordenarArray(String[] array) {
        int n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) { // pregunta si el actual es mayor alfabeticamente al siguiente, es decir, si el actual va despues del siguiente
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void mostrarArray(String[] array) {
        System.out.printf("El array ordenado es: %s%n", java.util.Arrays.toString(array));
    }
}
