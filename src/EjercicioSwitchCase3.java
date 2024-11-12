import java.util.Scanner;

public class EjercicioSwitchCase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double lado = ScannerManager.leerDouble(scanner, "Ingrese el lado del cuadrado");

        mostrarMenu();
        final char opcion = ScannerManager.leerChar(scanner, "Ingrese una opcion");

        double resultado = calcularResultado(lado, opcion);

        imprimirMensaje(resultado);
    }

    static void mostrarMenu() {
        System.out.println("Opcion A/a: Calcular el area");
        System.out.println("Opcion B/b: Calcular el perimetro");
    }

    static double calcularResultado(double lado, char opcion) {
        return switch (opcion) {
            case 'A', 'a' -> {
                double numerador = Math.sqrt(3);
                double denomiador = 4;
                double area = (numerador / denomiador) * Math.pow(lado, 2);
                yield area;
            }
            case 'B', 'b' -> {
                double perimetro = 3 * lado;
                yield perimetro;
            }
            default -> -1.0;
        };
    }

    static void imprimirMensaje(double resultado) {
        if (resultado != -1.0) {
            System.out.printf("El resultado es %.2f", resultado);
        } else {
            System.out.println("Opcion no valida");

        }
    }
}
