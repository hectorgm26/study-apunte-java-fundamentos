package com.study.java.fundamentos.apiCollections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListS {

    public static void main(String[] args) {

        // La diferencia de un arraylist y un linkedlist es que el arraylist es un arreglo de objetos, y el linkedlist es una lista enlazada
        // Esto significa que el linkedlist tiene un nodo que apunta al siguiente nodo

        LinkedList<String> lista = new LinkedList<>();
        lista.add("Pepe");
        lista.add("Juan");
        lista.add("Maria");
        lista.add("Hector");

        lista.addFirst("Ana");
        lista.addLast("Salomon");

        System.out.println("Lista: " + lista);

        // Podemos recorrer esto con la clase ListIterator
        ListIterator<String> iterator = lista.listIterator();

        // Si tenemos un siguiente elemento, lo que haremos sera asignar ese siguiente a una variable e imprimirlo
        // Esto para tomar el primer elemento, y cada vez que se llame al metodo next, se ira al siguiente elemento
        if (iterator.hasNext()) {
            String cadena = iterator.next(); // se mueve al siguiente, poniendo el puntero al entemedio del siguiente elemento
            cadena = iterator.next(); // Ira al elemento siguiente en la lista, es decir, pondremos el puntero al inicio del dato anterior
            System.out.println("Cadena: " + cadena);
            cadena = iterator.previous(); // Se colocan dos para regresar al elemento anterior, ya que con uno volvera a mostrar el mismo valor
            cadena = iterator.previous();
            System.out.println("Cadena: " + cadena);
        }
        /*

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

        // TENEMOS UN PUNTERO AL ELEMENTO SIGUIENTE Y AL ANTERIOR
                 */

    }
}
