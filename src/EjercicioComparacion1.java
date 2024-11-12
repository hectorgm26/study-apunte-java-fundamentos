import java.util.Random;

public class EjercicioComparacion1 {
    public static void main(String[] args) {

        final var random = new Random();
        final int numero = RandomUtilities.generarRandomInt(random, 10, 200);

        final boolean resultadoCondiciones1 = preguntarCondiciones1(numero);
        final boolean resultadoCondiciones2 = preguntarCondiciones2(numero);

        System.out.printf("¿El numero %d es par y mayor que 50?. %b%n", numero, resultadoCondiciones1);
        System.out.printf("¿El numero %d es multiplo de 3 y mayor o igual que 50?. %b%n", numero, resultadoCondiciones2);
    }

    static boolean preguntarCondiciones1(int numero) {
        return numero % 2 == 0 && numero > 50;
    }

    static boolean preguntarCondiciones2(int numero) {
        return numero % 3 == 0 && numero >= 50;
    }

}
