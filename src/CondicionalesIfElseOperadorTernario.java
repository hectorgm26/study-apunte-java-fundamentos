import java.util.Random;
import java.util.Scanner;

public class CondicionalesIfElseOperadorTernario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int numero = ScannerManager.leerInt(scanner, "Ingrese un numero entre 1 y 6");
        scanner.close();

        if (validarNumero(numero)) {        // Dentro del if va un boolean, y dentro del metodo tambien va un boolean
            final int numeroAleatorio = RandomUtilities.generarRandomInt(new Random(), 1, 6);
            mostrarMensajeGanador(numero, numeroAleatorio);

        } else {
            System.out.println("El numero ingresado no es valido");
        }
    }

    static boolean validarNumero(int numero) {
        return (numero >= 1 && numero <= 6);  // valida que el numero esté entre 1 y 6
    }

    static void mostrarMensajeGanador(int numero, int numeroAleatorio) {
        System.out.printf("El numero aleatorio generado es %d%n", numeroAleatorio);

        if (numero == numeroAleatorio) {
            System.out.println("Felicidades, acertaste");
        } else {
            System.out.println("Lo siento, no acertaste");
        }
    }
}

/*
if /else Significa si / sino

if (condicion) {
    // si la condicion es verdadera, entre en este bloque true
} else {
    // si la condicion es falsa, entra en el bloque del else, es decir, false
}

En Java, cuando se ejecuta un return, la ejecución del método se detiene y se devuelve el valor especificado.
Esto significa que las condiciones siguientes nunca se evaluarán porque los return previos finalizan la ejecución.

TAMBIEN PUEDEN ANIDARSE - para analizar varias condiciones en secuecia. Si no se cumple condicion 1, se evalua la condicion 2, y asi sucesivamente

if (condicion) {
    // si la condicion es verdadera
} else if (condicion2) {
    // si la condicion es falsa y la condicion2 es verdadera
} else {
    // si la condicion y la condicion2 son falsas
}

TAMBIEN PODEMOS HACER RETURN EN LOS IF-ELSE

static String calcularMensajeAlumno (int nota) {
    if (nota > 10) {
        return "Sobresaliente";
    } else if (nota >= 70) {
        return "Aprobado";
    } else {
        return "Reprobado";
    }
}

TAMBIEN PODEMOS USAR OPERADORES TERNARIOS

final var mensajeParaAlumno = nota > 10 ? "Sobresaliente" : "Reprobado";

Se asignan dos valores, dependiendo de la expresion booleana. Aqui si la nota es mayor a 10, se asigna "Sobresaliente", sino, se asigna "Reprobado"
Y se puede combinar con un return

static String calcularMensajeAlumno (int nota) {
    return nota > 10 ? "Sobresaliente" : "Reprobado";
}


TAMBIEN PODEMOS USAR SWITCH

switch (nota) {
    case 10:
        System.out.println("Sobresaliente");
        break;
    case 7:
        System.out.println("Aprobado");
        break;
    default:
        System.out.println("Reprobado");
        break;

 */
