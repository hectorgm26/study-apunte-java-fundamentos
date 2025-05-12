package com.study.java.fundamentos.comparableOrdenarListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(33);
        numeros.add(11);
        numeros.add(44);
        numeros.add(22);
        numeros.add(4);

        ArrayList<String> colores = new ArrayList<>();
        colores.add("rojo");
        colores.add("azul");
        colores.add("verde");
        colores.add("amarillo");
        colores.add("morado");
        colores.add("naranja");

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(2222, "Juan", "Perez", 1.82, EstadoCivil.CASADO));
        personas.add(new Persona(1111, "Ana", "Gomez", 1.65, EstadoCivil.SOLTERO));
        personas.add(new Persona(3333, "Luis", "Lopez", 1.75, EstadoCivil.DIVORCIADO));
        personas.add(new Persona(4444, "Maria", "Fernandez", 1.60, EstadoCivil.VIUDO));

        // Para ordenar listas, o bien usamos un algoritmo de ordenamiento, o le delegamos a java el ordenamiento
        Collections.sort(numeros); // ordenara de menor a mayor
        mostrarLista(numeros);

        System.out.println();

        Collections.sort(colores); // ordenara de menor a mayor, es decir siendo string, de forma alfabetica
        mostrarLista(colores);

        System.out.println();

        // El metodo sort se vale de que las personas sean comparables para ordenarlas
        Collections.sort(personas);
        // Los strings y numeros son comparables por default, pero no los objetos de tipo Persona ni de tipos creados por nosotros
        // No se pueden ordenar objetos de tipo Persona, ya que no implementa la interfaz Comparable,
        // por ende debemos implementar la interfaz Comparable para indicarle los criterios por los cuales se deben ordenar
        mostrarLista(personas);

    }

    public static void mostrarLista(List<?> lista) {
        for (Object o : lista) {
            System.out.println(o);
        }
    }
}
