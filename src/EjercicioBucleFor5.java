public class EjercicioBucleFor5 {

    public static void main(String[] args) {

/*
        Scanner scanner = new Scanner(System.in);

        final int n = ScannerManager.leerInt(scanner, "Ingrese un número");
*/

        imprimirSerie();
    }

    static void imprimirSerie() {
        for (int i = 300; i > 100; i--) {
            if (i % 2 == 1) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }


}
