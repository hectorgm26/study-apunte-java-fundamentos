public class BucleForSecuencia {

    public static void main(String[] args) {
        final int n = 5;

        imprimirSecuencia(n);
    }

    static void imprimirSecuencia(int n) {
        for (var i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("El numero " + i + " es par");
            }
            
        }

    }
}
