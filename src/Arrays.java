public class Arrays {

    public static void main(String[] args) {

        // DOS FORMAS DE DECLARAR UN ARREGLO

        // Forma 1 = cuando se conocen exactamente los elementos
        final String[] arrayNombres = new String[]{"Juan", "Pedro", "Maria", "Luisa"};
        final int[] arrayNumeros = new int[]{1, 2, 3, 4, 5};

        // Forma 2 = cuando no se conocen los elementos, pero si el tamaño
        final String[] arrayNombres2 = new String[3];
        final int[] arrayNumeros2 = new int[3];

        arrayNumeros2[0] = 10;
        arrayNumeros2[1] = 1;
        arrayNumeros2[2] = 11;

        // SIEMPRE PARA ACCEDER A UNA POSICION, ES CON CORCHETES Y EL INDICE []
        System.out.printf("El valor de la casilla en posicion 2 es %s%n", arrayNumeros2[1]);

        /*
        Con el printf, no hay un % para los array,
        por lo que se pueden convertir a string, para poder imprimir el array como %s
        ESTO ES POSIBLE POR EL METODO Arrays.toString(nombreDelArray)
        */
        System.out.printf("El valor del array es es %s%n", java.util.Arrays.toString(arrayNumeros2));

        // SI SE QUIERE SABER EL TAMAÑO DE UN ARREGLO, SE PUEDE USAR EL METODO length
        System.out.printf("El tamaño del array es %d%n", arrayNumeros2.length);

        // Sabiendo el tamaño, podemos acceder al ultimo elemento del array, ya que el tamaño es tamaño - 1
        System.out.printf("Ultimo elemento del array es %d%n", arrayNumeros2[arrayNumeros2.length - 1]);


        /* RECORRER UN ARREGLO CON UN CICLO FOR
        La secuencia de indices parte de 0, hasta el tamaño - 1
        */

        String[] arrayNombres3 = new String[]{"Hector", "Yanira", "Javier", "JP"};

        int tamano = arrayNombres3.length;

        for (int i = 0; i < tamano; i++) {  // siempre se inicia en 0, y va hasta tamaño - 1, por ende, i tiene que ser menor a tamaño, y porque i nunca toma el valor del tamaño
            System.out.printf("El nombre en la posicion %d es %s%n", i, arrayNombres3[i]);
        }

        /* RELLENAR ARRAY CON UN CICLO FOR
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
         */

        /* COMO USAR ARRAYS COMO PARAMETROS EN METODOS
        Primero tipo de dato + corchetes vacios + nombre del parametro

        static void mostrarNombres(String[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("El nombre en la posicion %d es %s%n", i, nombres[i]);
            }
        }
        */

        /*
        COMO USAR ARRAYS COMO TIPO DE RETORNO
        solos see especifica el tipo de dato y luego los corchetes vacios

        static int[] obtenerNumeros() {
            return new int[]{1, 2, 3, 4, 5};
         */


    }


}
