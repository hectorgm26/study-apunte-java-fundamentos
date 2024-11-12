public class BucleForAcumularValores {

    public static void main(String[] args) {

        final int n = 6;

        // suma
        int suma = 0;
        for (var i = 0; i < n; i++) {
            suma += i;
            // lo mismo que suma = suma + i;
        }

        System.out.println("La suma total de los numeros es: " + suma);

        // multiplicacion
        int multiplicacion = 1;
        for (var i = 1; i <= n; i++) {
            multiplicacion *= i;
            // lo mismo que multiplicacion = multiplicacion * i;
        }

        System.out.println("La multiplicacion total de los numeros es: " + multiplicacion);

        // contador
        int contador = 0;
        for (var i = 0; i < n; i++) {
            contador++; // aumenta en 1 el valor del contador
        }
        // en este caso, el contador es igual a n,
        // porque en la vuelta 5, el contador será igual a 5, y por cumplirse la condicion, se ejecutará una vez mas
        // lo que hara que el contador sea igual a 6, y al no cumplirse la condicion, no se ejecutará mas veces el bloque de codigo

        System.out.println("El contador es: " + contador);
    }
}

// si se quisiera que se incrementara de 2 en 2, se puede hacer asi: i += 2
// si se quisiera que se decrementara de 2 en 2, se puede hacer asi: i -= 2
