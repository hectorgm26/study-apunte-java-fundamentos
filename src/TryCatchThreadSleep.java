import java.util.Scanner;

public class TryCatchThreadSleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = ScannerManager.leerInt(scanner, "Ingrese el tiempo del contador");
        scanner.close();

        mostrarContador(numero);
    }

    static void esperar(long n) {
        try {
            Thread.sleep(n * 1000); // convierte segundos a milisegundos
        } catch (InterruptedException e) {
            System.err.println("Error de tipo InterruptedException: " + e.getLocalizedMessage());
            System.out.println("Error al esperar");
        }
    }

    static void mostrarContador(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1); // se suma 1 para que empiece en 1, y no en 0, y i < n para que llegue hasta n
            esperar(1); // espera 1 segundo
        }
    }
}

/*
METODO QUE PARALIZA LA EJECUCION DEL PROGRAMA DE FORMA TOTAL, POR UNA CANTIDAD DE TIEMPO EN MILISEGUNDOS
SE USA EN AUTOMATIZACIONES, PARA QUE EL PROGRAMA ESPERE UN TIEMPO ANTES DE EJECUTAR OTRA ACCION
EL METODO LANZA UNA INTERRUPTED EXCEPTION, POR LO QUE DEBE ESTAR DENTRO DE UN BLOQUE TRY CATCH
 */
