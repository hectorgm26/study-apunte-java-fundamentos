import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EjercicioListas2 {
    public static void main(String[] args) {

        List<String> notasAltas = new ArrayList<String>();
        List<String> notasMedias = new ArrayList<String>();
        List<String> notasBajas = new ArrayList<String>();

        int[] arrayNotas = creaArrayNotas();
        String[] arrayNombres = creaArrayNombres();

        rellenarListasNotas(notasAltas, notasMedias, notasBajas, arrayNombres, arrayNotas);

        System.out.printf("Lista de nombres con notas altas: %s%n", notasAltas);
        System.out.printf("Lista de nombres con notas medias: %s%n", notasMedias);
        System.out.printf("Lista de nombres con notas bajas: %s%n", notasBajas);
    }

    static String[] creaArrayNombres() {
        return new String[]{"Carlos", "Antonio", "Jorge", "Ana", "Mayra", "Julieta", "Maria", "Rodrigo", "Anabel", "Luz"};
    }

    static int[] creaArrayNotas() {
        final var random = new Random();
        return RandomUtilities.generarArrayRandomInt(random, 10, 1, 20);
    }

    static void rellenarListasNotas(List<String> notasAltas, List<String> notasMedias, List<String> notasBajas, String[] arrayNombres, int[] arrayNotas) {
        int tamaño = arrayNombres.length;

        for (var i = 0; i < tamaño; i++) {
            final double nota = arrayNotas[i];
            final String nombre = arrayNombres[i];

            if (nota >= 16) {
                notasAltas.add(nombre);
            } else if (nota >= 10) {
                notasMedias.add(nombre);
            } else {
                notasBajas.add(nombre);
            }
        }
    }

}
