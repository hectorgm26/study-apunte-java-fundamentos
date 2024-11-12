public class EjercicioMateComplejo {
    public static void main(String[] args) {
        final var cateto1 = 55.12;
        final var cateto2 = 23.12;

        /*
        Hipotenusa = sqrt(cateto1^2 + cateto2^2)
        raiz cateto1 al cuadrado + cateto2 al cuadrado
         */

        var hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.printf("Para los catetos %.3f y %.3f, tenemos la hipotenusa %.3f%n", cateto1, cateto2, hipotenusa);
    }
}
