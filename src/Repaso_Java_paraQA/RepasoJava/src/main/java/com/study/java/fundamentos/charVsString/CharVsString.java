package com.study.java.fundamentos.charVsString;

import java.util.Scanner;

public class CharVsString {
    public static void main(String[] args) {

        // La diferencia de un char con string es el uso de las comillas, ya que los char usan comillas simples '', y los string son con comillas dobles ""

        // Los char estan ligados/mapeados a un numero entero, ejemplo: 'A' = 65, que es la tabla codigo ASCII
        // Los string enrealidad son arrays de char, por lo que se pueden recorrer como un array

        int elArroba = '@'; // el arroba es el 64 en la tabla ASCII
        char elOchenta = 80; // el 80 es la letra P en la tabla ASCII

        System.out.println(elArroba);
        System.out.println(elOchenta);

        // Como los chars enrealidad son numeros, podemos hacer operaciones matematicas con ellos
        char unaA = 'A'; // el 65
        System.out.println(unaA + 1); // el 66
        System.out.println((char) (unaA + 1)); // letra B, que es el 66

        // Podemos tambien hacer comparaciones
        char letra1 = 'A'; // el 65
        char letra2 = 'B'; // el 66
        System.out.println("¿" + letra1 + " esta antes que " + letra2 + "? ");
        System.out.println(letra1 < letra2); // true, ya que el 65 es menor que el 66

        // PEDIRLE UN CARACTER AL USUARIO
        Scanner input = new Scanner(System.in);
        char unCaracter;

        System.out.println("Ingrese un caracter");
        unCaracter = input.nextLine().charAt(0);
        // PARA CAPTURAR UN CHAR, SE USA EL METODO NEXTLINE() Y LUEGO SE CAPTURA EL PRIMER CARACTER DEL STRING CON charAt(0)
        // siendo 0 el indice del primer caracter
        System.out.println("El caracter ingresado es: " + unCaracter);
    }
}
