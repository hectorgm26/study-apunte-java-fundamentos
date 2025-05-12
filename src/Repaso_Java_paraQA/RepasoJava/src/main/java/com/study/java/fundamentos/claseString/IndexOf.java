package com.study.java.fundamentos.claseString;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {

        // El metodo indexOf() busca una subcadena dentro de otra cadena, y devuelve la posicion de la primera coincidencia
        // No devuelve el valor booleano, ni tampoco devuelve la subcadena, sino la posicion de la subcadena dentro de la cadena en donde se encuentra la subcadena
        // Es sensible a mayusculas y minusculas
        // Devuelve un tipo de dato entero, que consiste en la posicion donde comienza y coincide la subcadena dentro de la cadena

        System.out.print("Ingrese su correo: ");
        Scanner input = new Scanner(System.in);

        String cadena = input.nextLine();
        String search = "@";

        int posicion = cadena.indexOf(search);
        // Si no encuentra la subcadena, devuelve -1 por defecto
        System.out.println("La posicion de la subcadena es: " + posicion);

        System.out.println();

        // IndexOf puede recibir un segundo argumento, que indica la posicion desde donde se comenzara a buscar en adelante
        // Si se indica una posicion mayor a la longitud de la cadena, se lanzara una excepcion de tipo StringIndexOutOfBoundsException
        // Si se indica una posicion menor a 0, se lanzara una excepcion de tipo StringIndexOutOfBoundsException
        // Si no encuentra la subcadena, devuelve -1 por defecto

        String correo = "hhector.agm@gmail.com";
        String buscar = "hh";
        int inicioP = 5;

        int posicion2 = correo.indexOf(buscar, inicioP);
        System.out.println("El correo es: " + correo);
        System.out.println("La subcadena a buscar es: " + buscar + " desde la posicion: " + inicioP + " en adelante");
        System.out.println("El resultado de la busqueda es: " + posicion2);

    }
}