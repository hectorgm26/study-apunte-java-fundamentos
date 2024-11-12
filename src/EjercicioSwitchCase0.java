import java.util.Scanner;

public class EjercicioSwitchCase0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int numero = ScannerManager.leerInt(scanner, "Ingrese un numero");

        mostrarMenu();
        final char opcion = ScannerManager.leerChar(scanner, "Ingrese una opcion");
        
        int verificacion = verificarCondicion(numero, opcion);

        imprimirMnesaje(numero, verificacion);

    }

    static void mostrarMenu() {
        System.out.println("Opcion A/a: Verificar si el número es par y mayor que 50");
        System.out.println("Opcion B/b: Verificar si el número es múltiplo de 5 y es menor que 30");
        System.out.println("Opcion C/c: Verificar si el número termina en 0 y es mayor que 500");
    }

    static int verificarCondicion(int numero, char opcion) {
        return switch (opcion) {
            case 'A', 'a' -> {
                if (numero % 2 == 0 && numero > 50) {
                    yield 1;
                } else {
                    yield 0;
                }
            }
            case 'B', 'b' -> {
                if (numero % 5 == 0 && numero < 30) {
                    yield 1;
                } else {
                    yield 0;
                }
            }
            case 'C', 'c' -> {
                if (numero % 10 == 0 && numero > 500) {
                    yield 1;
                } else {
                    yield 0;
                }
            }
            default -> -1;
        };
    }

    static void imprimirMnesaje(int numero, int verificacion) {
        if (verificacion == 1) {
            System.out.printf("El numero %d cumple con la condicion", numero);
        } else if (verificacion == 0) {
            System.out.printf("El numero %d no cumple con la condicion", numero);
        } else {
            System.out.println("Opcion no valida");
        }

        /*
        switch (verificacion) {
            case 1 -> System.out.printf("El numero %d cumple con la condicion", numero);
            case 0 -> System.out.printf("El numero %d no cumple con la condicion", numero);
            default -> System.out.println("Opcion no valida");
         */
    }
}
