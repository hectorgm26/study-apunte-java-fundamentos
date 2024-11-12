import java.util.Random;

public class EjercicioMetodos {
    public static void main(String[] args) {
        final var random = new Random();
        final var radio = RandomUtilities.generarRandomDouble(random, 10, 25);

        final var area = calcularArea(radio);
        final var perimetro = calcularPerimetro(radio);

        imprimirResultado(radio, area, perimetro);
    }

    static double calcularArea(double radio) {
        return (Math.PI * Math.pow(radio, 2));
    }

    static double calcularPerimetro(double radio) {
        return (2 * Math.PI * radio);
    }

    static void imprimirResultado(double radio, double area, double perimetro) {
        System.out.printf("Para un radio de %.3f se tiene un area de %.3f y un perimetro de %.3f%n", radio, area, perimetro);
    }
}
