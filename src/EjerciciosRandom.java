import java.util.Random;

public class EjerciciosRandom {
    public static void main(String[] args) {
        final var random = new Random();

        final var x = RandomUtilities.generarRandomDouble(random, 10, 25);
        final var y = RandomUtilities.generarRandomDouble(random, 10, 25);
        final var z = RandomUtilities.generarRandomDouble(random, 10, 25);


        final var p1 = RandomUtilities.generarRandomInt(random, 2, 5);
        final var p2 = RandomUtilities.generarRandomInt(random, 2, 5);
        final var p3 = RandomUtilities.generarRandomInt(random, 2, 5);

        final var promedioPonderado = calcularPromedioPonderado(x, y, z, p1, p2, p3);
        imprimirMensaje(promedioPonderado);
    }

    static double calcularPromedioPonderado(double x, double y, double z, double p1, double p2, double p3) {
        final var numerador = (x * p1) + (y * p2) + (z * p3);
        final var denominador = p1 + p2 + p3;
        return numerador / denominador;
    }

    static void imprimirMensaje(double promedioPonderado) {
        System.out.printf("El promedio ponderado es de %.3f%n", promedioPonderado);
    }
}
