package com.study.java.fundamentos.claseString;

public class ValueOfConvertirAString {
    public static void main(String[] args) {

        // El metodo valorOf() de la clase String, convierte un valor de una variable a un String
        // Devuelve un String del resultado de la conversion
        // Se puede usar para convertir un entero, un booleano, un char, un double, etc. a String

        // Ejemplo de conversion de un entero a String
        int numero = 10;
        String numeroString = String.valueOf(numero);
        System.out.println("El valor de numeroString es: " + numeroString);


        // Ejemplo de conversion de un booleano a String
        boolean verdadero = true;
        String verdaderoString = String.valueOf(verdadero);
        System.out.println("El valor de verdaderoString es: " + verdaderoString);


        // Ejemplo de conversion de un char a String
        char letra = 'A';
        String letraString = String.valueOf(letra);
        System.out.println("El valor de letraString es: " + letraString);


        // Ejemplo de conversion de un double a String
        double decimal = 3.14;
        String decimalString = String.valueOf(decimal);
        System.out.println("El valor de decimalString es: " + decimalString);

        
        // Ejemplo de conversion de un arreglo de caracteres a String
        char[] arregloCaracteres = {'H', 'o', 'l', 'a'};
        String arregloCaracteresString = String.valueOf(arregloCaracteres);
        System.out.println("El valor de arregloCaracteresString es: " + arregloCaracteresString);
        // Une todos los caracteres del arreglo en un solo String


    }
}
