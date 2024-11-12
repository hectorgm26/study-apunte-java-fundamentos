import java.util.Scanner;

public class EjercicioScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int gallinas = ScannerManager.leerInt(scanner, "Escribe el numero de gallinas");
        final int vacas = ScannerManager.leerInt(scanner, "Escribe el numero de vacas");

        scanner.close();

        final int cabezasTotales = calcularCantidadCabezas(gallinas, vacas);
        final int patasTotales = calcularCantidadPatas(gallinas, vacas);

        imprimirMensaje(vacas, gallinas, cabezasTotales, patasTotales);
        
    }

    static int calcularCantidadCabezas(int numeroGallinas, int numeroVacas) {
        return numeroGallinas + numeroVacas;
    }

    static int calcularCantidadPatas(int numeroGallinas, int numeroVacas) {
        return (numeroGallinas * 2) + (numeroVacas * 4);
    }

    static void imprimirMensaje(int vacas, int gallinas, int cabezasTotales, int patasTotales) {
        System.out.printf("En %d vacas y %d gallinas, hay %d cabezas%n", vacas, gallinas, cabezasTotales);
        System.out.printf("En %d vacas y %d gallinas, hay %d patas%n", vacas, gallinas, patasTotales);
    }
}
