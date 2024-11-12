import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EjercicioListas1 {
    public static void main(String[] args) {

        List<String> nombresIMCAlto = new ArrayList<String>();
        List<String> nombresIMCMedio = new ArrayList<String>();
        List<String> nombresIMCBajo = new ArrayList<String>();

        String[] nombres = crearArrayNombres();
        double[] imc = creaArayIMC();

        rellenarListasIMC(nombresIMCAlto, nombresIMCMedio, nombresIMCBajo, nombres, imc);

        System.out.printf("Lista de nombres con IMC alto: %s%n", nombresIMCAlto);
        System.out.printf("Lista de nombres con IMC medio: %s%n", nombresIMCMedio);
        System.out.printf("Lista de nombres con IMC bajo: %s%n", nombresIMCBajo);

    }

    static String[] crearArrayNombres() {
        String[] arrayNombres = new String[]{"Carlos", "Antonio", "Jorge", "Ana", "Mayra", "Julieta", "Maria", "Rodrigo", "Anabel", "Luz"};
        return arrayNombres;
    }

    static double[] creaArayIMC() {
        final var random = new Random();
        double[] arrayIMC = RandomUtilities.generarArrayRandomDouble(random, 10, 1, 50);
        return arrayIMC;
    }

    static void rellenarListasIMC(List<String> nombresIMCAlto, List<String> nombresIMCMedio, List<String> nombresIMCBajo, String[] arrayNombres, double[] arrayIMC) {

        int tamaño = arrayNombres.length;

        for (var i = 0; i < tamaño; i++) {
            final double imc = arrayIMC[i];
            final String nombre = arrayNombres[i];

            if (imc >= 40) {
                nombresIMCAlto.add(nombre);
            } else if (imc >= 25) {
                nombresIMCMedio.add(nombre);
            } else {
                nombresIMCBajo.add(nombre);
            }

        }

        /* CON BUCLE FOR EACH - NO RECOMENDADO, PORQUE NO SE PUEDE ACCEDER A LOS INDICES, Y AQUI SE NECESITA ACCEDER A LOS INDICES
        for (String nombre : arrayNombres) {
            for (double imc : arrayIMC) {
                if (imc >= 40) {
                    nombresIMCAlto.add(nombre);
                } else if (imc >= 25) {
                    nombresIMCMedio.add(nombre);
                } else {
                    nombresIMCBajo.add(nombre);
                }
            }
         */
    }
}
