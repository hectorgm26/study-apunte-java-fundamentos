import java.util.Random;

public class OperadoresComparacion {
    public static void main(String[] args) {

        final int a = RandomUtilities.generarRandomInt(new Random(), 20, 100);
        final int b = RandomUtilities.generarRandomInt(new Random(), 20, 100);

        boolean resultado = esNegativo(a);
        boolean resultado2 = esNegativo(b);

        imprimirResultado(a, resultado);
        imprimirResultado(b, resultado2);

    }

    static boolean esNegativo(int numero) {
        return numero < 0;
    }

    static void imprimirResultado(int numero, boolean resultado) {
        System.out.printf("El numero %d es negativo?. %b%n", numero, resultado);
    }

    /*
    Estas operaciones son entre dos numeros ints o doubles (ambos del mismo tipo)
    Operadores:

    == igualdad
    != desigualdad
    <  menor
    >  mayor
    <= menor o igual
    >= mayor o igual

    TODAS ESTAS COMPARACIONES DEVUELVEN UN BOOLEAN

     */
}
