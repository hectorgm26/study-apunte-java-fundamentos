package com.study.java.fundamentos.apiCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapS {
    public static void main(String[] args) {

        // Los mapas son estructuras de datos que almacenan pares de clave-valor
        // Estamos con ellos obligados a usar una clave para acceder a un valor
        // Las claves no pueden ser duplicadas, pero los valores si

        // Se dividen en dos tipos:
        // HashMap: no respetan el orden de ingreso, pero permiten almacenar elementos no duplicados
        // TreeMap: respetan el orden de ingreso, pero no permiten elementos duplicados

        // Sintaxis: Map<tipo clave, tipo valor> nombre = new HashMap<>(); Y se usan datos de tipo primitivo
        Map<Integer, String> mapa = new HashMap<>();

        // Con valores iniciales
        Map<Integer, String> mapaInicializado = new HashMap<>(Map.of(
                1, "Pepe",
                2, "Juan",
                3, "Maria"));

        Map<Integer, Persona> mapa2 = new HashMap<>();
        Persona p1 = new Persona("Hector", 27);
        Persona p2 = new Persona("Yanira", 25);
        Persona p3 = new Persona("Javier", 24);

        // Agregar elementos al mapa - metodo put
        mapa.put(1, "Pepe");
        mapa.put(2, "Juan");
        mapa.put(3, "Maria");
        mapa.put(10, "Jp");
        // se puede agregar un elemento con cualquier clave, y el orden en que se almacenan no es el mismo en que se ingresan, si no que se ordenan por el hashcode, sin permitir duplicados

        mapa2.put(1, p1);
        mapa2.put(2, p2);
        mapa2.put(3, p3);

        // Imprimir el mapa - metodo toString
        System.out.println("Mapa: " + mapa.toString());
        System.out.println("Mapa2: " + mapa2.toString());

        // buscar elemento en el map - metodo get y se le pasa la clave por parametro para asi encontrar el valor
        Persona encontrada = mapa2.get(2);
        System.out.println("Elemento encontrado: " + encontrada.toString());

        // Eliminar elemento del mapa - metodo remove
        mapa2.remove(3);
        System.out.println("Mapa2: " + mapa2.toString());

        // Actualizar valor existente por otro - metodo put. Se le pasa la clave existente y el nuevo valor
        Persona p4 = new Persona("Niko", 26);
        mapa2.put(1, p4);
        System.out.println("Mapa2: " + mapa2.toString());

        // Metodo constainsKey y constainsValue- verifica si existe la clave en el mapa y si existe el valor en el mapa
        boolean e = mapa2.containsKey(10);
        System.out.println("La key 10 existe?: " + e);

        boolean e2 = mapa.containsValue("Jp");
        System.out.println("El valor Jp existe?: " + e2);


        // Iterar sobre el mapa - clase Collection aplicando values para obtener los valores y keySet para obtener las claves
        Collection<Persona> personas = mapa2.values();
        // Esto devuelve una coleccion de los valores del mapa, y se puede iterar sobre ella, y con el tipo de dato que se le paso al mapa y que se espeifique luego del Collection

        for (Persona p : personas) {
            System.out.println("p.getNombre() = " + p.getNombre());
        }

        Collection<Integer> keyPersonas = mapa2.keySet();
        // Esto devuelve una coleccion de las claves del mapa, y se puede iterar sobre ella, y con el tipo de dato que se le paso al mapa y que se espeifique luego del Collection

        for (Integer keys : keyPersonas) {
            System.out.println("keys.getNombre() = " + keys);
        }

        // RECORRER MAP CON BUCLE FOR EACH
        // se usa un objeto de tipo Entry que es un par de datos. El metodo entrySet() es para obtener los pares de datos
        // no se itera el map, si no el entrySet
        // SOLO CON ENTRY SET PODEMOS ACCEDER A LA KEY
        for (Map.Entry<Integer, String> par : mapa.entrySet()) {
            System.out.printf("Key %d - value %s%n", par.getKey(), par.getValue());
        }

        // Metodo containsKey y constainsValue - verifica si existe la clave en el mapa y si existe el valor en el mapa
        boolean existe = mapa.containsKey(10);
        System.out.println("La key 10 existe?: " + existe);
        boolean existe2 = mapa.containsValue("Jp");
        System.out.println("El valor Jp existe?: " + existe2);

        // Metodo size - devuelve la cantidad de elementos en el mapa
        int size = mapa.size();
        System.out.println("El tamaño del mapa es: " + size);


        // TreeMap
        Map<Integer, String> mapaT = new TreeMap<>();
        // La diferencia entre HashMap y TreeMap es que el TreeMap respeta el orden de ingreso, pero no permite elementos duplicados
        // Tienen los mismos metodos que el HashMap, pero el TreeMap tiene un orden de ingreso

    }
}
