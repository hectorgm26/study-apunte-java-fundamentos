public class EjercicioClaseString2 {
    public static void main(String[] args) {

        String data = "5,3,15,23,12,11";
        String[] array = data.split(",");

        int n = array.length;
        int[] arrayInt = new int[n];

        for (var i = 0; i < n; i++) {
            arrayInt[i] = Integer.parseInt(array[i]); // de string a int entero
        }

        calcularPromedioSimple(arrayInt);

        mostrarInformacion(array, arrayInt, calcularPromedioSimple(arrayInt));

    }

    static double calcularPromedioSimple(int[] array) {
        double suma = 0;
        int n = array.length;

        for (var i = 0; i < n; i++) {
            suma = suma + array[i];
        }

        return suma / n;
    }

    static void mostrarInformacion(String[] arrayS, int[] arrayI, double promedio) {
        System.out.printf("El array de strings es: %s%n", java.util.Arrays.toString(arrayS));
        System.out.printf("El array de enteros es: %s%n", java.util.Arrays.toString(arrayI));
        System.out.printf("El promedio simple es: %.2f%n", promedio);

    }
}
