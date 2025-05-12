package com.study.java.fundamentos.equalsCompararStrings;

import java.util.Scanner;

public class CompararStrings {
    public static void main(String[] args) {

        // El operador relacional de comparacion == tiene problemas al comparar strings, ya que compara la referencia de memoria, y no el contenido

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombrePersona = input.nextLine();

        String nombreEsperado = "Yanira";

        System.out.println(nombrePersona == nombreEsperado);
        // Se supone que si se ingresa la misma cadena deberia dar true, PERO DARA FALSE, YA QUE EL CODIGO FIJO NO ES EL MISMO CODIGO QUE EL USUARIO PONE EN CONSOLA.
        // EN JAVA las cadenas de texto son objetos, y el doble == compara la identidad de esos objetos (referencia en memmoria), y al ser objetos diferentes da falso

        // SOLUCION: USAR EL METODO equals() para comparar el contenido de los strings
        // El metodo equals() compara el contenido de los strings, y no la referencia de memoria, por lo que si son iguales, devolvera true
        // Se toma la cadena que se quiere comparar, se le aplica el metodo equals(), y se le pasa como parametro la cadena con la que queremos comparar
        System.out.println(nombrePersona.equals(nombreEsperado));

        // EQUALS EVALUA DE FORMA ESTRICTA CARACTER POR CARACTER, POR LO QUE SI SE QUIERE IGNORAR LAS MAYUSCULAS
        // SE DEBE USAR EL METODO equalsIgnoreCase()
        System.out.println(nombrePersona.equalsIgnoreCase(nombreEsperado));
    }
}
