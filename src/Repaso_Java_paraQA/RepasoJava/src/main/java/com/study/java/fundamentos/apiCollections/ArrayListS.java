package com.study.java.fundamentos.apiCollections;

import java.util.Collections;
import java.util.List;


public class ArrayListS {

    public static void main(String[] args) {

        // El api collections de java nos permite trabajar con estructuras de datos como listas, conjuntos y mapas
        // Listas: ArrayList, LinkedListS
        // Conjuntos: HashSet, TreeSet
        // Mapas: HashMap, TreeMap

        // Las colecciones son clases para almacenar y agrupar objetos.
        // Son dinámicas, es decir, no es necesario definir el tamaño de la colección al momento de crearla, ni siquiera es necesario definir el tipo de objeto que se va a almacenar
        // Respetan el orden de ingreso, es decir, el primer elemento que se agrega es el primero que se obtiene al recorrer la colección
        // Pero los set no respetan el orden de ingreso, ya que no permiten elementos duplicados, pero los listas si lo permiten

        List<String> lista = new java.util.ArrayList<>();
        lista.add("Pepe");
        lista.add("Juan");
        lista.add("Maria");
        lista.add("Hector");

        System.out.println("Lista: " + lista);

        // Acceder a posiciones especificas - metodo get + la posicion
        System.out.println("Arreglo.get(1): " + lista.get(1));

        // Eliminar un elemento de la lista - metodo remove + la posicion
        lista.remove(1);
        System.out.println("Lista: " + lista);

        // Modificar/ remplazando un elemento de la lista - metodo set, y se le pasa la posicion y el nuevo valor como parametro
        lista.set(0, "Yanira");
        System.out.println("Lista: " + lista);

        // Buscar si un elemento existe en el arreglo - metodo contains
        boolean esta = lista.contains("Ana");
        System.out.println("Esta Ana en la lista? " + esta);

        // Ordenar la lista - usando la interfaz Collections y el metodo sort
        Collections.sort(lista);
        System.out.println("Lista: " + lista);
    }
}
