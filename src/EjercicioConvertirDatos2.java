public class EjercicioConvertirDatos2 {
    public static void main(String[] args) {
        final String cantidad1 = "23";
        final String cantidad2 = "5";
        final String cantidad3 = "111";

        final int total = calcularSuma(cantidad1, cantidad2, cantidad3);

        imprimirSuma(total);
    }

    static int calcularSuma(String cantidad1, String cantidad2, String cantidad3) {
        final int cantidad1Int = Integer.parseInt(cantidad1);
        final int cantidad2Int = Integer.parseInt(cantidad2);
        final int cantidad3Int = Integer.parseInt(cantidad3);

        return cantidad1Int + cantidad2Int + cantidad3Int;
    }

    static void imprimirSuma(int suma) {
        System.out.println("La suma de las cantidades es: " + suma);
    }
}
