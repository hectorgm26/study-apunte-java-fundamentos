import java.util.Scanner;

public class EjercicioBucleWhileDoWhile4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double lado = ScannerManager.leerDouble(scanner, "Ingrese el lado del triangulo");
        char opcion;

        do {
            mostrarMenu();
            opcion = ScannerManager.leerChar(scanner, "Ingrese una opción");
            System.out.println();

            if (opcion != 'C' && opcion != 'c') {
                ejecturarOpcion(lado, opcion);
            }
        } while (opcion != 'C' && opcion != 'c');

    }

    static void mostrarMenu() {
        System.out.println("A/a: Calcular el area");
        System.out.println("B/b: Calcular el perimetro");
        System.out.println("C/c: Salir del programa");
    }

    static void ejecturarOpcion(double lado, char opcion) {
        switch (opcion) {
            case 'A', 'a' -> {
                double numerador = Math.sqrt(3);
                double denominador = 4;
                double area = (numerador / denominador) * Math.pow(lado, 2);
                System.out.printf("El area del triangulo es: %.2f%n", area);
            }
            case 'B', 'b' -> {
                double perimetro = 3 * lado;
                System.out.printf("El perimetro del triangulo es: %.2f%n", perimetro);
            }
            case 'C', 'c' -> System.out.println("Saliendo del programa");
            default -> System.out.println("Opción no válida");
        }
    }

}
