import java.util.Arrays;
import java.util.List;

public class EjercicioClaseString3 {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("$125,32", "$63.831", "$632.7", "$110.25678");

        final double precioUsd = calcularSumaUsd(data);
        final double precioPen = calcularSumaPen(precioUsd);

        mostrarInformacion(precioUsd, precioPen);

    }

    static double obtenerPrecio(String precio) {
        final String precioLimpio = precio.replace("$", "");
        return Double.parseDouble(precioLimpio);
    }

    static double calcularSumaUsd(List<String> data) {
        double suma = 0;

        for (String elemento : data) {
            suma = suma + obtenerPrecio(elemento);
        }

        return suma;
    }

    static double calcularSumaPen(double precioUsd) {
        return precioUsd * 3.5;
    }

    static void mostrarInformacion(double precioUsd, double precioPen) {
        System.out.printf("El precio total en USD es %.2f%n", precioUsd);
        System.out.printf("El precio total en PEN es %.2f%n", precioPen);
    }
}
