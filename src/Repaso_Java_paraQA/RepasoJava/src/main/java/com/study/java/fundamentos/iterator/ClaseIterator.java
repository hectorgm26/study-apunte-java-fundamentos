package com.study.java.fundamentos.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClaseIterator {

    public static void main(String[] args) {

        // La clase iterator es una interfaz que permite recorrer una colección de elementos de manera secuencial y sin exponer su representación interna.
        // Se utiliza comúnmente en colecciones como listas, conjuntos y mapas.
        // La interfaz Iterator proporciona métodos para verificar si hay más elementos en la colección y para obtener el siguiente elemento.
        // La clase Iterator es parte del paquete java.util y se utiliza para recorrer colecciones de manera uniforme.

        // La interfaz Iterator tiene tres métodos principales:
        // 1. hasNext(): devuelve true si hay más elementos en la colección.
        // 2. next(): devuelve el siguiente elemento de la colección.
        // 3. remove(): elimina el último elemento devuelto por el iterador de la colección.

        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("JavaScript");
        lenguajes.add("Python");
        lenguajes.add("Dart");
        lenguajes.add("PHP");

        // Sintaxis para crear un iterador
        // Iterator<T> nombreIterador = nombreColeccion.iterator();
        Iterator<String> it = lenguajes.iterator();

        // Mientras el iterador it tenga un siguiente, imprimiremos ese valor siguiente
        while (it.hasNext()) {
            System.out.println(it.next()); // se partira umprimiendo desde el primer elemento
        }


    }
}
