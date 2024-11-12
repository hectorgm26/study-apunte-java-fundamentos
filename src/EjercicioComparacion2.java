import java.util.Scanner;

public class EjercicioComparacion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int b = scanner.nextInt();

        scanner.close();

        boolean resultadoComparacion = sonIguales(a, b);

        imprimirResultado(a, b, resultadoComparacion);
    }

    static boolean sonIguales(int a, int b) {
        return a == b;
    }

    static void imprimirResultado(int a, int b, boolean resultadoComparacion) {
        System.out.printf("El numero %d es igual al numero %d?. %b%n", a, b, resultadoComparacion);
    }
}
