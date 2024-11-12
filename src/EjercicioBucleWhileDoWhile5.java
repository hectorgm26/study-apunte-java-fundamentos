import java.util.Scanner;

public class EjercicioBucleWhileDoWhile5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double cantidadDolares = ScannerManager.leerDouble(scanner, "Ingrese la cantidad de dolares a convertir");
        char opcion;

        do {
            mostrarMenu();
            opcion = ScannerManager.leerChar(scanner, "Ingrese una opción");
            System.out.println();

            if (opcion != 'D' && opcion != 'd') {
                ejecutarOpcion(opcion, cantidadDolares);
            }

        } while (opcion != 'D' && opcion != 'd');
        
        scanner.close();
    }

    static void mostrarMenu() {
        System.out.println("A/a: Convertir a soles");
        System.out.println("B/b: Convertir a euros");
        System.out.println("C/c: Convertir a yenes");
        System.out.println("D/d: Salir del programa");
    }

    static double convertirASoles(double cantidadDolares) {
        return cantidadDolares * 3.90;
    }

    static double convertirAEuros(double cantidadDolares) {
        return cantidadDolares * 0.99;
    }

    static double convertirAYenes(double cantidadDolares) {
        return cantidadDolares * 145.66;
    }

    static void ejecutarOpcion(char opcion, double cantidadDolares) {
        switch (opcion) {
            case 'A', 'a' -> {
                double soles = convertirASoles(cantidadDolares);
                System.out.printf("La cantidad de dolares %.2f, equivale a %.2f soles%n", cantidadDolares, soles);
            }
            case 'B', 'b' -> {
                double euros = convertirAEuros(cantidadDolares);
                System.out.printf("La cantidad de dolares %.2f, equivale a %.2f euros%n", cantidadDolares, euros);
            }
            case 'C', 'c' -> {
                double yenes = convertirAYenes(cantidadDolares);
                System.out.printf("La cantidad de dolares %.2f, equivale a %.2f yenes%n", cantidadDolares, yenes);
            }
            case 'D', 'd' -> System.out.println("Saliendo del programa");
            default -> System.out.println("Opción no válida");
        }
    }
}
