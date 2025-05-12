package com.study.java.fundamentos.parse;

public class ParseCasting {
    public static void main(String[] args) {

        // Java puede realizar conversiones, pero en contextos permitidos. Por ejemplo, no se puede transformar un string a un int
        // pero si se puede transformar un int a un string.
        // Para eso existen los metodos parseInt, parseDouble, etc. que permiten convertir un string a su tipo correspondiente, y el metodo valueOf, que permite convertir un tipo primitivo a su tipo objeto correspondiente.

        // Ejemplo - Math.pow(a,b) recibe dos parametros double, pero si le pasamos un int, lo convierte automaticamente a double

        // En cambio si intentamos almacenar un double en una var int,dara error si no hacemos casting explicito
        // Ejemplo - double a = 5.5; int b = a; // Error de compilacion
        // Solucion = int b = (int) a; // Casting explicito, se pierde la parte decimal

        // *********** PARSE ***********
        // El parse permite convertir un string a cualquir valor numerico, inclusive un booleano. Se utiiizan clases envolturas que permiten trabajar con tipos primitivos, pero como si fueran objetos.
        // Normalmente se utiliza la clase envoltura, que tiene el mismo nombre que el tipo de dato primitivo (Int-integer, Double-double, etc.)

        String cadena = "12345";
        int myInt = Integer.parseInt(cadena); // Convierte un string a un int

        /* TABLA DE PARSE de string a tipo primitivo - NombreClase.parseTipoDato:

        byte -> Byte.parseByte(cadena)
        short -> Short.parseShort(cadena)
        int -> Integer.parseInt(cadena)
        long -> Long.parseLong(cadena)
        float -> Float.parseFloat(cadena)
        double -> Double.parseDouble(cadena)
        boolean -> Boolean.parseBoolean(cadena)
        char -> cadena.charAt(0) // Convierte un string a un char, pero solo el primer caracter

        Para convertir un char a string:
        char letra = 'A';
        string frase = Character.toString(letra);

        Para convertir un char a int:
        char num = '2';
        a = Character.getNumericValue(num); // Convierte un char a un int
        */
    }
}
