package com.study.java.fundamentos.claseString;

public class IntroClaseString {
    public static void main(String[] args) {

        // La clase String es la que se encarga de manipular las cadenas de texto.

        // En Java, las cadenas de texto son inmutables, es decir, no se pueden modificar una vez creadas.
        // ES POR ESO QUE, En su lugar, se crean nuevas cadenas de texto cada vez que se realiza una operación sobre una cadena existente.

        // Esta clase por pertenecer a java, no necesitamos importar nada, ni crearla, solo basta llamar metodos e invocarlos

        String cadena = new String("texto");
        // Esto es lo mismo que:
        String cadena2 = "texto";

        System.out.println(cadena);
        System.out.println(cadena2);

    }
}