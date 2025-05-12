package com.study.java.fundamentos.comparatorOrdenarListas;

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

        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("AFGFGD", 3333));
        autos.add(new Auto("AFGFGD", 1111));
        autos.add(new Auto("AFGFGD", 2222));
        autos.add(new Auto("AFGFGD", 4444));


        // Podemos enviar la lista, junto a un comparator como segundo argumento (objeto que permite designar un criterio de ordenamiento, sin que necesariamente lo tenga que implementar la clase)
        Collections.sort(autos, new ComparadorDeAutosPorKilometraje(true)); // el true indicara que si se hara de ascendente
        mostrarLista(autos);

    }

    public static void mostrarLista(List<?> lista) {
        for (Object o : lista) {
            System.out.println(o);
        }
    }
}
