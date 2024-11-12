import java.util.Scanner;

public class EjercicioSwitchCase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        char opcion;

        numero1 = ScannerManager.leerInt(scanner, "Ingrese un primer numero");
        numero2 = ScannerManager.leerInt(scanner, "Ingrese un segundo numero");

        mostrarMenu();

        opcion = ScannerManager.leerChar(scanner, "Ingrese una opcion: ");

        ejecutarOpcion(opcion, numero1, numero2);
    }

    static void mostrarMenu() {
        System.out.println("\nMenu de opciones");
        System.out.println("Opcion A/a: Sumar");
        System.out.println("Opcion B/b: Restar");
        System.out.println("Opcion C/c: Multiplicar");
        System.out.println("Opcion D/d: Dividir");
        System.out.println("Opcion E/e: Resto");
        System.out.println("Opcion Incorrecta");
    }

    static int calcularSuma(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    static int calcularResta(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    static int calcularMultiplicacion(int numero1, int numero2) {
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    static int calcularDivision(int numero1, int numero2) {
        int division = numero1 / numero2;
        return division;
    }

    static int calcularResto(int numero1, int numero2) {
        int resto = numero1 % numero2;
        return resto;
    }

    static void ejecutarOpcion(char opcion, int numero1, int numero2) {

        switch (opcion) {
            case 'a', 'A' ->
                    System.out.printf("La suma de %d y %d es %d%n", numero1, numero2, calcularSuma(numero1, numero2));
            case 'b', 'B' ->
                    System.out.printf("La resta de %d y %d es %d%n", numero1, numero2, calcularResta(numero1, numero2));
            case 'c', 'C' ->
                    System.out.printf("La multiplicacion de %d y %d es %d%n", numero1, numero2, calcularMultiplicacion(numero1, numero2));
            case 'd', 'D' ->
                    System.out.printf("La division de %d y %d es %d%n", numero1, numero2, calcularDivision(numero1, numero2));
            case 'e', 'E' ->
                    System.out.printf("El resto de %d y %d es %d%n", numero1, numero2, calcularResto(numero1, numero2));
            default -> System.out.println("Opcion incorrecta");

            /* ESTO SE PUDO HABER HECHO DE OTRA FORMA:

            final int resultado = switch (opcion) {
                case 'a', 'A' -> calcularSuma(numero1, numero2);
                case 'b', 'B' -> calcularResta(numero1, numero2);
                case 'c', 'C' -> calcularMultiplicacion(numero1, numero2);
                case 'd', 'D' -> calcularDivision(numero1, numero2);
                case 'e', 'E' -> calcularResto(numero1, numero2);
                default -> -1;                         // si la opcion es incorrecta, se retorna -1
            };

            if (resultado != -1) {                     // si el resultado es diferente de -1, es porque la opcion es correcta
                System.out.printf("El resultado es %d%n", resultado);
            } else {                                   // si el resultado es -1, es porque la opcion es incorrecta
                System.out.println("Opcion incorrecta");
            }

             */
        }
    }


}
