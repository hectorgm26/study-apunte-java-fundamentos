import java.util.Scanner;

public class EjercicioBucleWhileDoWhile3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = ScannerManager.leerInt(scanner, "Ingrese un numero");
        char opcion;

        do {
            mostrarMenu();
            opcion = ScannerManager.leerChar(scanner, "Ingrese una opción");
            System.out.println();

            if (opcion != 'D' && opcion != 'd') {
                ejecutarOpcion(opcion, numero);
            }
        } while (opcion != 'D' && opcion != 'd');

        scanner.close();
    }

    static void mostrarMenu() {
        System.out.println("A/a: Verificar si el número es par y mayor que 50");
        System.out.println("B/b: Verificar si el número es múltiplo de 5 y es menor que 30");
        System.out.println("C/c: Verificar si el número termina en 0 y es mayor que 500");
        System.out.println("D/d: Salir del programa");
    }

    static void ejecutarOpcion(char opcion, int numero) {
        switch (opcion) {
            case 'A', 'a' -> {
                if (numero % 2 == 0 && numero > 50) {
                    System.out.println("El número es par y mayor que 50");
                } else {
                    System.out.println("El número NO ES par y NO ES mayor que 50");
                }
            }
            case 'B', 'b' -> {
                if (numero % 5 == 0 && numero < 30) {
                    System.out.println("El número es múltiplo de 5 y es menor que 30");
                } else {
                    System.out.println("El número NO ES múltiplo de 5 y NO ES menor que 30");
                }
            }
            case 'C', 'c' -> {
                if (numero % 10 == 0 && numero > 500) {
                    System.out.println("El número termina en 0 y es mayor que 500");
                } else {
                    System.out.println("El número NO termina en 0 y NO ES mayor que 500");
                }
            }
            case 'D', 'd' -> System.out.println("Saliendo del programa");
            default -> System.out.println("Opción no válida");
        }
    }
}
