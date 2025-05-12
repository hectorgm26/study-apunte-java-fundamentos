package com.study.java.fundamentos.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarBuscarEliminarArrays {
    public static void main(String[] args) {

        String[] palabras = {"perro", "gato", "elefante", "ratón", "jirafa"};

        String[] productos = new String[7];
        productos[0] = "televisor";
        productos[1] = "lavadora";
        productos[2] = "nevera";
        productos[3] = "microondas";
        productos[4] = "horno";
        productos[5] = "secadora";
        productos[6] = "aspiradora";

        // Ordenar el array - importar clase Arrays - java.util.Arrays
        Arrays.sort(productos);

        // Iterar productos - el for each pide el tipo de dato que se tiene almacenado en el array - usar el atajo iter + tab
        for (String producto : productos) {
            System.out.println(producto);
        }

        System.out.println();

        Arrays.sort(palabras);
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor a buscar");
        String valorBuscado = input.nextLine();

        // Busqueda de un elemento en el array, recorriendolo para analizar posicion tras posicion el elemento
        // El bucle se rompera y dejara de entrar, cuando ya no hayan elementos a recorrer, o cuando se encuentre al elemento
        int i;
        for (i = 0; i < palabras.length && !palabras[i].equals(valorBuscado); i++) {
        } // Este array es solo para avanzar e ir incrementando el valor de i

        if (i == palabras.length) {
            System.out.println("El valor no se ha encontrado");
        } else {
            System.out.println("La palabra a buscar fue: " + palabras[i]);
            System.out.println("La posicion en que fue encontrada es: " + i);
        }

        /* ES LO MISMO QUE
        int i = 0;
        boolean encontrado = false;

        while (i < palabras.length) {
            if (palabras[i].equals("elefante")) {
                encontrado = true;
                break;
            }
            i++;
        }

        if (encontrado) {
            System.out.println("La palabra a buscar fue: " + palabras[i]);
            System.out.println("La posición en que fue encontrada es: " + i);
        } else {
            System.out.println("El valor no se ha encontrado");
        }
         */

        // Modificar el array eliminando un elemento

        for (int j = i; j < palabras.length - 1; j++) {
            palabras[j] = palabras[j + 1];
        }

        for (String palabra : palabras) {
            System.out.println("palabra: " + palabra);
        }
        // EXPLICACION: el for recorre el array desde la posicion en que se encontro el elemento a eliminar, hasta la penultima posicion del array, y le asigna el valor de la siguiente posicion al elemento actual.
        // De esta manera se elimina el elemento y se desplazan los elementos a la izquierda. El ultimo elemento queda vacio, pero no importa porque no lo vamos a usar. Se puede hacer un for normal, pero es mas largo y tedioso. Se puede hacer un for each, pero no se puede modificar el array.

        // Lo siguiente es necesario para arreglar que en el array anterior no se repita el ultimo elemento al eliminarlo
        String[] nuevo = new String[palabras.length - 1];
        System.arraycopy(palabras, 0, nuevo, 0, nuevo.length);
        // arrayCopy es un metodo de la clase Arrays, que copia un array a otro.
        // El primer parametro es el array de origen, el segundo es el array destino, el tercero es la posicion de inicio del array destino y el cuarto es la longitud del nuevo array.
        
        System.out.println();

        for (String p : nuevo) {
            System.out.println("palabra: " + p);
        }
    }
}
