package com.study.java.fundamentos.claseString;

public class Substring {
    public static void main(String[] args) {

        // El metodo substring() devuelve una subcadena de la cadena original.
        // El primer argumento es el indice de inicio (incluido) y el segundo argumento es el indice de fin (excluido).
        // Si solo se pasa un argumento, devuelve la subcadena desde el indice de inicio hasta el final de la cadena.
        String cadena = "Hola Mundo";
        String subcadena1 = cadena.substring(0, 4); // "Hola"
        String subcadena2 = cadena.substring(5); // "Mundo"
        String subcadena3 = cadena.substring(0, 9); // "Hola Mundi"
        String subcadena4 = cadena.substring(0, 10); // "Hola Mundo"
        String subcadena5 = cadena.substring(0, 11); // "Hola Mu
    }
}
