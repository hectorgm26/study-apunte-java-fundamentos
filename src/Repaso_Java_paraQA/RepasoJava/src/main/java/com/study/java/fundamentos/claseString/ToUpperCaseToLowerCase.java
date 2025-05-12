package com.study.java.fundamentos.claseString;

public class ToUpperCaseToLowerCase {
    public static void main(String[] args) {

        // El metodo toUpperCase() convierte una cadena de texto a mayusculas
        // No recibe ningun parametro
        
        String nombre = "hector";
        String nombreMayusculas = nombre.toUpperCase();
        System.out.println(nombre + " en mayusculas es: " + nombreMayusculas);

        // El metodo toLowerCase() convierte una cadena de texto a minusculas
        String apellido = "GONZALEZ";
        String apellidoMinusculas = apellido.toLowerCase();
        System.out.println(apellido + " en minusculas es: " + apellidoMinusculas);
    }
}
