import java.util.Scanner;

public class EjercicioBucleWhileDoWhile6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int n = ScannerManager.leerInt(scanner, "Ingrese un número");
        char opcion;

        do {
            mostrarMenu(n);
            opcion = ScannerManager.leerChar(scanner, "Ingrese una opción");
            System.out.println();

            if (opcion != 'D' && opcion != 'd') {
                EjecutarOpcion(n, opcion);
            }

        } while (opcion != 'D' && opcion != 'd');

    }

    static void mostrarMenu(int n) {
        System.out.printf("A/a: Calcular suma desde 1 hasta %d%n", n);
        System.out.printf("B/b: Calcular multiplicacion desde 1 hasta %d%n", n);
        System.out.printf("C/c: Mostrar numeros desde 1 hasta %d%n", n);
        System.out.printf("D/d: Salir del programa%n");
    }

    static void calcularSuma(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
            // suma = suma + i
        }
        System.out.println("La suma es: " + suma);
    }

    static void calcularProducto(int n) {
        int producto = 1;   // se inicializa en 1 porque el producto de cualquier número por 1 es el mismo número, y si se multiplica por 0, el resultado siemore sera 0
        for (int i = 1; i <= n; i++) {
            producto *= i;
            // producto = producto * i
        }
        System.out.println("El producto es: " + producto);
    }

    static void imprimirSerie(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    static void EjecutarOpcion(int n, char opcion) {
        switch (opcion) {
            case 'A', 'a' -> calcularSuma(n);
            case 'B', 'b' -> calcularProducto(n);
            case 'C', 'c' -> imprimirSerie(n);
            case 'D', 'd' -> System.out.println("Saliendo del programa");
            default -> System.out.println("Opción no válida");
        }

    }
}
