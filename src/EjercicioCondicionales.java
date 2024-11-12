import java.util.Scanner;

public class EjercicioCondicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double prestamo = ScannerManager.leerDouble(scanner, "Ingrese el monto del prestamo");
        scanner.close();

        final double montoFinal = calcularMonto(prestamo);

        imprimirResultado(prestamo, montoFinal);

    }

    static double calcularMonto(double prestamo) {
        double aumento = 0;

        if (prestamo % 2 == 0) {
            aumento += prestamo * 0.1;
        }

        if (prestamo % 3 == 0) {
            aumento += 500;
        }

        if (prestamo > 500) {
            aumento += 300;
        }

        // Retornamos el monto del préstamo más el aumento total
        return prestamo + aumento;
    }

    static void imprimirResultado(double prestamo, double montoFinal) {
        System.out.printf("Para el prestamo %.2f, se cobrará en total %.2f%n", prestamo, montoFinal);
    }
}

/* Este ejercicio tambien se puede realizar con un operador ternario:

static double calcularMonto(double prestamo) {

    final var aumento1 = (prestamo % 2 == 0) ? prestamo * 0.1 : 0;   Si es par, se aumenta en un 10%, pero si no, queda en 0 la variable aumento1
    final var aumento2 = (prestamo % 3 == 0) ? 500 : 0;         Si es multiplo de 3, se aumenta en 500, si no, queda en 0 la variable aumento2
    final var aumento3 = (prestamo > 500) ? 300 : 0;          Si es mayor a 500, se aumenta en 300, si no, queda en 0 la variable aumento3

    return prestamo + aumento1 + aumento2 + aumento3;
}

 */