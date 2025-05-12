package com.study.java.fundamentos.claseString;

public class IsEmpty {
    public static void main(String[] args) {

        // El metodo isEmpty() verifica si una cadena de texto esta vacia o no

        // Si la cadena de texto no tiene caracteres, devuelve true
        // Si la cadena de texto tiene al menos un caracter, devuelve false

        String cadena = "UwU";
        boolean esVacio = cadena.isEmpty();
        System.out.println("La cadena esta vacia?: " + esVacio);

        String cadena2 = "";
        boolean esVacio2 = cadena2.isEmpty();
        System.out.println("La cadena 2 esta vacia?: " + esVacio2);

    }
}
