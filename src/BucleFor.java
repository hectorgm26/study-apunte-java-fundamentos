public class BucleFor {
    public static void main(String[] args) {

        // atajo fori
        // siempre se parte de 0
        // por ende, como dato, las iteraciones son de 0 a n-1

        final int n = 3;

        for (var i = 0; i < n; i++) {
            System.out.println("Vuelta " + i);
        }
        for (var z = 25; z > 0; z--) {
            System.out.println("Cuenta regresiva " + z);
        }
    }
    // en este ejemplo, se ejecuta 3 veces el bloque de codigo
    // en la primera vuelta, i = 0
    // en la segunda vuelta, i = 1
    // en la tercera vuelta, i = 2
    // al intentar una cuarta vuelta, i = 3, PERO como i no es menor a 3, NO SE EJECUTA el bloque de codigo

    // si se quisiera que se incrementara de 2 en 2, se puede hacer asi: i += 2
    // si se quisiera que se decrementara de 2 en 2, se puede hacer asi: i -= 2
}


    /*
    Sentencia que se usa para repetir un bloque de codigo un numero determinado de veces que si se conocen

    estructura:
    for (inicializacion; condicion; incremento) {
        // bloque de codigo

    inicializacion = se usa para declarar e inicializar una variable que se usara en la condicion
                     se usa para determinar el valor inicial de la variable que se usara en la condicion

    condicion = se usa para determinar hasta cuando se ejecuta o no el bloque de codigo
                si la condicion es verdadera, se ejecuta el bloque de codigo
                por ende si la condicion deja de ser verdadera, no se ejecuta el bloque de codigo

    incremento = se usa para aumentar o disminuir el valor de la variable que se usa en la condicion
                 se usa para determinar en cuanto aumenta o disminuye el valor de la variable que se usa en la condicion

    La inicializacion se da antes de empezar el bucle,
    la condicion al inicio de cada vuelta (iteracion),
    y el incremento al final de cada vuelta (iteracion)

    FOR COMUNES

    for (int i = 0; i < n; i++) {          NUMEROS DESDE 0 A N, SIN INCLUIR N
        // bloque de codigo
    }

    for (int i = 0; i <= n; i++) {         NUMEROS DESDE 0 A N, INCLUYENDO N
        // bloque de codigo
    }

    for (int i = n; i > 0; i--) {          NUMEROS DESDE N A 1, SIN INCLUIR 0
        // bloque de codigo
    }

    for (int i = n; i >= 0; i--) {         NUMEROS DESDE N A 0, INCLUYENDO 0
    // bloque de codigo
    }


    FOR EACH
    for (tipoDeDato variable : coleccion) {
        // bloque de codigo


     */
