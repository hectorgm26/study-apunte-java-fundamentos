import java.util.Random;

public class NumerosAleatorios {
    /*
    Primero, se define un rango, con un número máximo y un número mínimo

    Segundo, se crea una constante tipo random
    Ejemplo = final var random = new Random();

    Luego se aplica las formulas a la variable random a declarar: (depende del tipo de dato)
    1) Si se quiere un entero int:
    final var numAleatorio = random.nextInt(max - min + 1) + min;
                (al agregar max - min se agrega antes automáticamente la palabra bound antes del max) - Ejemplo: final var radio = random.nextInt(bound: max - min + 1)

    2) Si se quiere un double decimal:
    final var numAleatorio = (max - min) * random.nextDouble() + min;

    */
    public static void main(String[] args) {
        final var max = 100;
        final var min = 20;

        final var random = new Random(); // se declara constante tipo random

        final var radio = random.nextInt(max - min + 1) + min; // se declara radio aleatorio

        final var area = Math.PI * Math.pow(radio, 2);

        final var perimetro = 2 * Math.PI * radio;

        System.out.printf("Para un radio de %d se tiene un perimetro de %.3f y un area de %.3f%n", radio, perimetro, area);
    }
}

