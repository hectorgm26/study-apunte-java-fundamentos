package com.study.java.fundamentos.datosPrimitivos;

public class TiposDatosPrimitivos {
    public static void main(String[] args) {

        /* Tipos de datos primitivos

        1- Numeros enteros:
        byte: 8 bits, -128 a 127
        short: 16 bits, -32,768 a 32,767
        int: 32 bits, -2,147,483,648 a 2,147,483,647
        long: 64 bits, -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

        2- Mumeros de punto flotante (decimales):
        float: 32 bits, -3.40282347E+38 a 3.40282347E+38
        double: 64 bits, -1.79769313486231570E+308 a 1.79769313486231570E+308

        3- Caracter:
        char: 16 bits, 0 a 65,535 (Unicode)

        4- Booleano:
        boolean: 1 bit, true o false

        5- String: no es un tipo de dato primitivo, es un objeto que representa una secuencia de caracteres
        6- null: no es un tipo de dato, es un valor que indica que una variable no tiene un valor asignado
        7- BigDecimal: no es un tipo de dato primitivo, es una clase que representa un numero decimal de precision arbitraria
        8- BigInteger: no es un tipo de dato primitivo, es una clase que representa un numero entero de precision arbitraria
         */

        // En java podemos expresar valores numericos como binario, octal, decimal y hexadecimal, y podemos imprimir sus valores con los metodos
        // Integer.toBinaryString(), Integer.toOctalString(), Integer.toHexString() y Integer.toString() de las clases Integer o Long

        int a = 100;
        long b = 100L; // el sufijo L indica que es un long

        System.out.println("Integer.toBinaryString(a) = " + Integer.toBinaryString(a)); // 1100100
        System.out.println("Integer.toOctalString(b) = " + Long.toOctalString(b)); // 144
        System.out.println("Integer.toHexString(a) = " + Integer.toHexString(a)); // 64

        // valor por defecto de char es el 0, que es el caracter nulo
        char c = '\u0000';

        // espacio en char
        char d = '\u0020';

        /* CAMINO PARA EXPRESAR VALORES

        - binary = prejijo 0b - ejemplo: 0b1100100
        - octal = prejijo 0 - ejemplo: 0144
        - decimal = sin prejijo - ejemplo: 100
        - hexadecimal = prejijo 0x - ejemplo: 0x64
        - long = sufijo L al final - ejemplo: 100L

        - exponencial = una e o E al final,que indica que es un numero en notacion cientifica - ejemplo: 1.0e2
        - float = sufijo F al final - ejemplo: 100.0F
        - double = sufijo D al final - ejemplo: 100.0D

        - ascii = '\101' - ejemplo: 'A'
        - unicode = '\u0041' - ejemplo: 'A'
        - escape sequence = '\n' - ejemplo: salto de linea
        - escape sequence = '\t' - ejemplo: tabulador
        - new line = '\n' - ejemplo: salto de linea
        - tab = '\t' - ejemplo: tabulador
         */

        /*  DECLARACION E INICIALIZACION DE VARIABLES PRIMITIVAS

        [type] [variableName] = [value];

        - Pueden ser declaradas sin inicializarse, pero no se puede usar una variable sin inicializar
        - los valores char deben ir con comillas simples ''
        - tipos de datos menores son automaticamente promocionados a tipos de datos mayores, es otras palabras, no se puede asignar un valor de un tipo de dato mayor a uno menor, pero si al reves
        - La asignacion de una variable a otra crea una copia de su valor
        - Valores booleans solo pueden ser true o false

         */

        int binary = 0b1100100;
        int octal = 0144;
        int decimal = 100;
        int hexadecimal = 0x64;

        System.out.println("binary = " + binary); // 100
        System.out.println("octal = " + octal); // 100
        System.out.println("decimal = " + decimal); // 100
        System.out.println("hexadecimal = " + hexadecimal); // 100

        System.out.println();

        float normal = 100.0F; // float
        double exponencial = 1.0e2; // double

        System.out.println("normal = " + normal); // 100.0
        System.out.println("exponencial = " + exponencial); // 100.0

        System.out.println();

        char caracter = 'A'; // char
        char unicode = '\u0041'; // unicode
        char ascii = '\101'; // ascii
        char escape = '\n'; // escape sequence
        char tab = '\t'; // tab
        System.out.println("caracter = " + caracter); // A
        System.out.println("unicode = " + unicode); // A
        System.out.println("ascii = " + ascii); // A
        System.out.println("escape = " + escape); // salto de linea
        System.out.println("tab = " + tab); // tab

        System.out.println();

        // PROMOCION
        int value = 10;
        long promocion = value; // se promueve a long

        // Inverso no es posible
        float f = 10.5F;
        // f = value; // no se puede asignar un int a un float, ya que el float es un tipo de dato mayor

    }
}
