package com.study.java.fundamentos.claseString;

public class Format {
    public static void main(String[] args) {

        // El metodo format es un metodo estatico que pertenece a la clase String, y regresa una nueva cadena formateada
        // Tiene dos parametros, uno es de tipo string y el otro de tipo object ARGS
        // El primer parametro es el formato de la cadena de como se quiere que se vea, y el segundo son los valores que se van a formatear
        // Esto es lo mismo que system.out.printf, pero no imprime en consola

        //%b - representa un booleano
        //%d - representa un entero
        //%f - representa un numero decimal - para definir cantidad de decimales se coloca un punto y la cantidad de decimales que se quieren mostrar, antes de la f (ejemplo %.2f)
        //%s - representa una cadena de texto
        //%n - representa un salto de linea
        //%c - representa un caracter
        // Nulos - si se le pasa un valor nulo, en el formato de la cadena se debe de escribir el valor nulo como "null" o "NULL"

        // Ejemplo de formato de cadena
        String nombre = "Juan";
        String apellido = "Pérez";
        int edad = 30;
        String cadena = String.format("Hola, mi nombre es %s %s y tengo %d años", nombre, apellido, edad);
        System.out.println(cadena);


        // Ejemplo 2
        String cadenaNula = null;
        String cadenaTexto = "dos";
        String cadena_Uno = String.format("Ejemplo: %b", cadenaTexto);
        String cadena_Dos = String.format("Ejemplo: NULL", cadenaNula);
        System.out.println(cadena_Uno);
        System.out.println(cadena_Dos);


        // Ejemplo 3
        short num = 305;
        String frase = String.format("El resultado de la operacion fue de -%06d-", num);
        // el resultado de la operacion fue de -000305-
        // el 0 indica que se quiere rellenar con ceros, el 6 indica que se quiere un total de 6 digitos, estando posicionados a la izquierda, ya que el signo menos indica que se quiere un numero negativo
        System.out.println(frase);

    }
}
