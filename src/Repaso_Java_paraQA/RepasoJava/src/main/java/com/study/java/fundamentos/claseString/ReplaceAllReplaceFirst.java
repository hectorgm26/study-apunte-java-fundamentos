package com.study.java.fundamentos.claseString;

public class ReplaceAllReplaceFirst {
    public static void main(String[] args) {

        // El metodo replaceAll() reemplaza todas las coincidencias de una expresion regular en una cadena
        // Se diferencia del metodo replace(), en que el replace() solo reemplaza el primer valor que encuentra (las veces que se repita),
        // mientras que el replaceAll() reemplaza todos los valores que encuentra coincidentes
        // Recibe dos parametros, el primero es la expresion regular y el segundo es el valor por el que se quiere reemplazar
        // Devuelve una nueva cadena con los valores reemplazados

        String cadenaOriginal = "Que  tal,  buen   dia";
        String cadenaFinal = cadenaOriginal.replaceAll("\\s+", " ");
        System.out.println(cadenaOriginal);
        System.out.println(cadenaFinal);


        // El metodo replaceFirst() reemplaza la primera coincidencia de una expresion regular en una cadena
        // Devuelve una nueva cadena con el valor reemplazado
        // Recibe dos parametros, el primero es la expresion regular y el segundo es el valor por el que se quiere reemplazar

        String cadenaOriginal2 = "Buenos  dias,  buen  dia";
        String cadenaFinal2 = cadenaOriginal2.replaceFirst("\\s+", "X");
        System.out.println(cadenaFinal2);
    }
}
