package com.study.java.fundamentos.apiCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetS {
    public static void main(String[] args) {

        // Tanto sets y maps emplean el algortimo hash code para almacenar elementos no duplicados
        // Esto hace que a pesar de aplicar interfaces diferentes, el funcionamiento es el mismo, almacenar elementos

        // Los hashset permiten almacenar elementos no duplicados, pero no respetan el orden de ingreso
        // Los treeset si respetan el orden de ingreso, pero no permiten elementos duplicados
        // Los linkedhashset si permiten almacenar elementos no duplicados y respetan el orden de ingreso

        Set<String> cadenas = new HashSet<>();
        // Inicializar con valores definidos
        Set<Integer> setNumeros = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        cadenas.add("Pepe");
        cadenas.add("Juan");
        cadenas.add("Maria");
        cadenas.add("Hector");
        // No respetan el orden de insersion, y se ordenan por el hashcode, es decir, por el valor del objeto de manera aleatoria

        // No permite aregar valores repetidos
        cadenas.add("Pepe");

        // Para imprimir un set se usa el metodo toString
        System.out.println("cadena.toString(): " + cadenas);

        // TAMPOCO PODEMOS ORDENAR CON LA INTERFAZ COLLECTIONS.sort
        // Collections.sort(cadenas);
        // Si tenemos la necesidad de ordenar el set, tenemos que transformarlo mediante un arraylist, pasandole el set como parametro
        List<String> lista = new ArrayList<>(cadenas);
        Collections.sort(lista);
        System.out.println("Lista.toString: " + lista);

        // Buscar un elemento - metodo contains
        boolean esta = cadenas.contains("Ana");
        System.out.println("Esta Ana en el set? " + esta);

        // Actualizacion de dato
        // Si quisieramos implementar un crud, y en el caso de querer actualizar/pisar un dato, debemos encontrar el elemento a eliminarlo y luego agregar el nuevo elemento
        cadenas.remove("Hector");
        cadenas.add("Yanira");
        System.out.println("cadena: " + cadenas);

        // PERO SI CAMBIAMOS AL HASHSET POR UN TREESET, PROVOCARA QUE AHORA LOS ELEMENTOS SE ORDENEN ALFABETICAMENTE Y NO POR EL HASHCODE, PERO TAMPOCO SE ACEPTAN ELEMENTOS DUPLICADOS
        // Esto hace que tengan un coste de balanceo, es decir, que al agregar un elemento, el arbol se reordena para mantener el orden
        // Tienen todos los metodos de un hashset, pero ordenan los elementos alfabéticamente
        Set<String> cadenas2 = new TreeSet<>();
        cadenas2.add("Pepe");
        cadenas2.add("Juan");
        cadenas2.add("Maria");
        cadenas2.add("Hector");
    }
}
