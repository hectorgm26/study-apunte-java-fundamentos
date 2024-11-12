public class AumentarDecrementarVariables {
    public static void main(String[] args) {

        int numero = 10;
        System.out.println("Numero " + numero);

        numero += 15;
        System.out.println("Numero aumentado " + numero);
        // De esta forma se aumenta en 15 el valor de la variable numero, lo que que da 25
    }

    /* Estas operaciones se usan mayoritariamente en bucles y con datos tipo int

    Aumentar en valor 1 una variable: ++
    Decrementar en valor 1 una variable: --

    Aumentar en valor n una variable: += numero en que se quiere aumentar
    Decrementar en valor n una variable: -= numero en que se quiere decrementar
    Ejemplo:
    var int n = 10;
    var int m = 5;
    n += m;    Aqui n se le aumenta el valor de m, que es 5, por lo que n quedaria en 15

    ESTOS ULTIMOS DOS SIGNOS SE USAN PARA actualizar el valor de una variable, acumulando o sumando otro valor a esa variable.
    += vendria a ser lo mismo que variable = variable + n
    */
}
