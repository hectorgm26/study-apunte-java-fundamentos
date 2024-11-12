public class EjercicioOrdenamientoBurbuja2 {
    public static void main(String[] args) {

        int[] array = new int[]{15, 75, 42, 11, 32};

        System.out.printf("El array es: %s%n", java.util.Arrays.toString(array));
        int n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.printf("El array ordenado de menor a mayor es: %s", java.util.Arrays.toString(array));

    }
}
