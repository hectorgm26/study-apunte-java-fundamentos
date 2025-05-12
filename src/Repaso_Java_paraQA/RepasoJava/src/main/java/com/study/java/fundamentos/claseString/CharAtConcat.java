package com.study.java.fundamentos.claseString;

public class CharAtConcat {
    public static void main(String[] args) {

        // El metodo charAt() devuelve el caracter char en la posicion indicada en el parametro del metodo
        String nombre = "Hector";

        char letra = nombre.charAt(0);
        System.out.println("La letra en la posicion 0 es: " + letra);
        // Si se intenta acceder a un indice que no existe, se lanzara una excepcion de tipo StringIndexOutOfBoundsException


        // El metodo concat() une dos cadenas de texto, pegandolas sin espacio y manteniendo el orden
        String apellido = " Gonzalez";
        String nombreCompleto = nombre.concat(apellido);
        // Tambien se puede usar el .concat sin una variable, si no directomente pasandolo como argumento
        String nombreCompleto2 = nombre.concat(" Fontalba");
        System.out.println("El nombre completo es: " + nombreCompleto);
        System.out.println("El nombre completo 2 es: " + nombreCompleto2);

        // Se puede usar el .concat con un stringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hector");
        sb.append(" Gonzalez");
        String nombreCompleto3 = sb.toString();
        System.out.println("El nombre completo es: " + nombreCompleto3);

    }
}
