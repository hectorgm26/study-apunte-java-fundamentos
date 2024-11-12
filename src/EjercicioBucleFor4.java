import java.util.Random;

public class EjercicioBucleFor4 {

    public static void main(String[] args) {

        final var random = new Random();

        int n = RandomUtilities.generarRandomInt(random, 5, 20);
        System.out.println("El numero aleatorio es: " + n);

        int promedio = calcularPromedioSimple(n);

        imprimirResultado(promedio, n);
    }

    static int calcularPromedioSimple(int n) {
        int suma = 0;
        int numerador;
        int denominador;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        numerador = suma;
        denominador = n;
        return numerador / denominador;
    }

    static void imprimirResultado(int promedio, int n) {
        System.out.printf("El promedio simple desde 1 hasta %d es %d%n", n, promedio);
    }


}
