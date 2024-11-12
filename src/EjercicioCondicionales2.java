import java.util.Scanner;

public class EjercicioCondicionales2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double radio = ScannerManager.leerDouble(scanner, "Ingrese el radio del circulo");

        imprimirMenu();

        final char opcion = ScannerManager.leerChar(scanner, "Ingrese la opcion deseada");

        if (validarInput(opcion)) {
            if (opcion == 'A') {
                calcularArea(radio);
            } else if (opcion == 'B') {
                calcularPerimetro(radio);
            } else if (opcion == 'C') {
                calcularArea(radio);
                calcularPerimetro(radio);
            }
        } else {
            System.out.println("Opción inválida");
        }
        scanner.close();  // Se cierra, hasta terminado completamente de interactuar con él, es decir, después de haber validado la opción ingresada por el usuario y haber ejecutado las operaciones correspondientes.
    }

    static void imprimirMenu() {
        System.out.println("Menu de opciones");
        System.out.println("A. Calcular el area");
        System.out.println("B. Calcular el perimetro");
        System.out.println("C. Calcular ambos (area y perimetro)");
    }

    static boolean validarInput(char opcion) {
        return (opcion == 'A') || (opcion == 'B') || (opcion == 'C');
    }

    static double calcularArea(double radio) {
        final double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El area del circulo es: %.2f%n", area);
        return area;

    }

    static double calcularPerimetro(double radio) {
        final double perimetro = 2 * Math.PI * radio;
        System.out.printf("El perimetro del circulo es: %.2f%n", perimetro);
        return perimetro;
    }
}
