public class EjercicioConvertirDatos {
    public static void main(String[] args) {
        final String precio1 = "45.50";
        final String precio2 = "32.20";
        final String precio3 = "75.12";

        double precioTotal = calcularSuma(precio1, precio2, precio3);

        imprimirSuma(precioTotal);
    }

    static double calcularSuma(String precio1, String precio2, String precio3) {
        return Double.parseDouble(precio1) + Double.parseDouble(precio2) + Double.parseDouble(precio3);
    }
    
    static void imprimirSuma(double precioTotal) {
        System.out.printf("El precio total es de %.2f", precioTotal);
    }
}
