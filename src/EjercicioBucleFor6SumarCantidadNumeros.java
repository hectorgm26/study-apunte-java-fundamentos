import java.util.Scanner;

public class EjercicioBucleFor6SumarCantidadNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int n = ScannerManager.leerInt(scanner, "Ingrese un numero mayor a 5");

        int cantidad = calcularCantidad(n);

        mostrarResultado(n, cantidad);

    }

    static int calcularCantidad(int n) {
        int cantidad = 0;
        for (int i = 6; i < n; i++) {
            if (i % 2 == 0)
                cantidad++;
        }
        return cantidad;
    }

    /*
    Esto se podria hacer de otra forma:
    static int calcularCantidad(int n) {
        int cantidad = 0;
        for (int i = 6; i < n; i+=2) {
            cantidad++;
        }
        return cantidad;
    }
    Explicacion:
    - Se inicia en 6 porque es el primer numero par despues de 5
    - Se incrementa de 2 en 2 porque los numeros pares son de 2 en 2
     */

    static void mostrarResultado(int n, int cantidad) {
        System.out.printf("La cantidad de numeros pares entre 5 y %d es: %d%n", n, cantidad);
    }


}
