package com.study.java.fundamentos.claseString;

public class LengthTrim {
    public static void main(String[] args) {

        // El metodo length() devuelve la longitud de una cadena de texto. Es decir, cuantos caracteres tiene en total
        // Devuelve un entero

        String nombre = "Hector";
        int longitud = nombre.length();
        System.out.println("La longitud de la cadena: " + nombre + " es: " + longitud);


        // El metodo trim() elimina los espacios en blanco al principio y al final de una cadena de texto
        // Si se quiere eliminar los espacios en blanco de una cadena de texto, se puede usar el metodo trim()
        // Devuelve la cadena de texto sin espacios en blanco al principio y al final

        String nombreConEspacios = "   Hector Gonzalez   ";
        String nombreSinEspacios = nombreConEspacios.trim();
        System.out.println("El nombre con espacios es: " + nombreConEspacios);
        System.out.println("El nombre sin espacios es: " + nombreSinEspacios);
    }
}
