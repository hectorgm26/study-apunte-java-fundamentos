import java.util.Random;

public class TryCatch {
    public static void main(String[] args) {
        final var random = new Random();
        int[] array1 = RandomUtilities.generarArrayRandomInt(random, 15, 0, 6);
        int[] array2 = RandomUtilities.generarArrayRandomInt(random, 15, 0, 6);
        System.out.printf("Array 1: %s%n", java.util.Arrays.toString(array1));
        System.out.printf("Array 2: %s%n", java.util.Arrays.toString(array2));
        int tamaño = array1.length;
        int cociente;
        int[] arrayDeDivision = new int[tamaño];

        for (var i = 0; i < tamaño; i++) {

            try {
                cociente = array1[i] / array2[i];
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por 0, se asignara -1 a los valores 0 del array resultante");
                cociente = -1;
            }
            arrayDeDivision[i] = cociente;
        }

        System.out.printf("Array de division: %s%n", java.util.Arrays.toString(arrayDeDivision));
    }
}

/*
Se percicen cuando el codgio ya se esya ejecutando. EJEMPLOS:

ArithmeticException: OPERACION ARIRMETICA NO VALIDA, COMO DIVIDIR POR 0
NullPointerException: CUANDO SE INTENTA ACCEDER A UN OBJETO O VARIABLE QUE NO HA SIDO INICIALIZADO
IndexOutOfBoundsException: CUANDO SE INTENTA ACCEDER A UNA POSICION QUE NO EXISTE EN UN ARRAY O LISTA
InputMismatchException: CUANDO SE INTENTA LEER UN DATO DE UN TIPO DIFERENTE AL QUE SE ESPERA EL SCANNER
FileNotFoundException: CUANDO SE INTENTA ABRIR UN ARCHIVO QUE NO EXISTE
NoSuchElementException: CUANDO SE INTENTA ACCEDER A UN ELEMENTO QUE NO EXISTE EN UNA COLECCION
IOException: CUANDO SE INTENTA LEER, ESCRIBIR, MODIFICAR. BORRAR UN ARCHIVO Y OCURRE UN ERROR
NumberFormatException: CUANDO SE INTENTA CONVERTIR UN STRING A UN NUMERO Y NO SE PUEDE
InterruptedException: CUANDO UN HILO ES INTERRUMPIDO MIENTRAS ESTA EN ESPERA

Podemos indicar en el encabezado del metodo que puede lanzar una excepcion, con la palabra throws
PERO NO ESTAMOS MANEJANDO LA EXCEPCION, SOLO LA ESTAMOS INDICANDO QUE LA PODRA LANZAR

PARA MANEJARLAS SE USA EL BLOQUE TRY CATCH

En el try se llanan a los metodos que podrian llamar la excepcion
En el catch se captura la excepcion y se muestra un mensaje
Y EXISTE EL BLOQUE FINALLY, que es un bloque que se ejecuta siempre, sin importar si hay excepcion o no
 */
