import java.util.Random;

public class MetodosDentroDeMetodos {

    public static void main(String[] args) {
        final var random = new Random();
        final var aleatorio = Utilities.generarRandom(random, 1, 10);
        System.out.printf("El numero aleatorio es: %d%n", aleatorio);
    }


    public class Utilities {
        static int generarRandom(Random random, int min, int max) {
            return random.nextInt(max - min + 1) + min;
        }
    }

}
        /* Podemos crear clases ques solo tengan metodos y llamarlos de otras clases
        Se les llama utilities
        Estas clases no tienen un metodo main, ya que solo albergan metodos
        Se utlizan para reutilizar codigo y encapsular metodos
         */

        /*
        Se llaman mediante la notacion:
        NombreClase.NombreMetodo(parametro1, parametro2....);
         */


// Bloques de codigo que pueden devolver un valor (o no), y que pueden recibir parametros (o no)
// Encapsulan sentencias en un metodo
// Tienen dos partes: encabezado (donde va el nombre, tipo de dato a retornar y parametros) y cuerpo

    /* SINTAXIS DE UN METODO PERSONALIZADO:
    static tipoDatoRetorno nombreMetodo(tipoDato nombreParametro1, tipoDato nombreParametro2) {
        return valorRetorno;
    }
     */

// En caso que no tenga retorno, se coloca la palabra void
// En caso que no reciba parametros, se coloca un parentesis vacio
// el nombre del metodo empieza en minuscula, y luego camel case

    /*
    Sobre el retorno: Los metodos void no devuelven nada, solo ejecutan un bloque de codigo, como por ejemplo un mensaje en consola
    NO HAY RELACION ENTRE EL TIPO DE DATO DE LOS PARAMETROS, Y EL TIPO DE DATO DE RETORNO (PUEDEN SER DISTINTOS)
     */

    /*
    Los metodos se especifican dentro de la clase principal, pero no van dentro del main, sino que al mismo nivel
    Y con la misma indentacion
    Se declara primero el main, y luego los demas metodos
     */

    /*
    Los datos declarados en un metodo, solo existen dentro de ese metodo, y se llaman variables locales
    Por tanto, si se quiere usar una varaible de otro metodo, debe ser utilizada como parametro
     */

    /*
    Sobre las llamadas a los metodos: se pueden llamar una vez ya declarados
    En caso de ser void, se llama mediante el nombre del metodo, seguido de los parentesis, y en caso de tener parametros, se colocan dentro de los parentesis
    En caso de si tener retorno, se debe guardar en una variable del mismo tipo de dato, para asi capturar el valor retornado
     */

    /* Ejemplo:
    public class MetodosPersonalizados {
        public static void main(String[] args) {
            final var a = 10;
            final var b = 1;
            final var resultado = sumar(a, b);
            System.out.println(resultado);
        }

        static int sumar(int x, int y) {
            return x + y;
        }
     */

// Los nombres de los parametros no tienen que ser iguales a los de las variables que se pasan como argumento
// En el ejemplo anterior, los parametros son x e y, y los argumentos son a y b
// Los parametros son variables locales del metodo, y los argumentos son las variables que se pasan al metodo
// Lo que importa es pasar la cantidad correcta de argumentos, el tipo correcto de dato, y en el orden correcto
// No es necesario que se llamen igual

    /*
    No hay relacion entre si es void y el numero de parametros
    Puede ser void y tener 10 parametros
    o puede retornar un int y tener 0 parametros
    */

    /*
    No hay relacion entre los tipos de datos de los parametros y el tipo de dato de retorno
    Puedo pasarle 5 int y retornar un string
    o puedo pasarle 0 parametros y devolver un int
    */

// Se puede pasar cualquier tipo de parametro, en cualquier cantidad, y en cualquier orden

    /*
    Sobre la sobrecarga de metodos: se puede tener dos metodos con el mismo nombre, pero con diferente cantidad de parametros
    En caso de tener la misma cantidad de parametros, se debe tener diferente tipo de dato en los parametros
    En caso de tener la misma cantidad de parametros, y el mismo tipo de dato, se debe tener diferente orden de los parametros
    En caso de tener la misma cantidad de parametros, el mismo tipo de dato, y el mismo orden, no se puede hacer la sobrecarga
     */
