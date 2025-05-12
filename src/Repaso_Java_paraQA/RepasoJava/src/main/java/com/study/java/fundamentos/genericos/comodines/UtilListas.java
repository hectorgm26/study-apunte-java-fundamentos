package com.study.java.fundamentos.genericos.comodines;

import java.util.List;

// el comodin se usa para poder recibir cualquier tipo de dato en un metodo o variable, pero no se puede usar en una clase
public class UtilListas {

    // Se llama unbound wildcard, o comodin sin limite
    // Pese a que con la herencia, los objetos son Objects, PERO UNA COLECCION DE OBJETOS NO ES LO MISMO QUE UNA COLECCION DE OBJECTS
    // Se usa como parametro la interfaz List, ya que List es una interfaz generica
    // Y luego usamos el operador comodin <?> que nos permite recibir cualquier tipo de dato para la lista
    public static void mostrarLista(List<?> lista) {
        for (Object o : lista) {
            System.out.println(o);
        }
    }

    // Comodin de limite superior, EN INGLES SE LLAMA UPPER BOUND WILDCARD
    // Se pueden usar con superclases e interfaces
    // CON <? extends Persona> le decimos que la lista puede ser Persona o cualquier dervado de Persona (que extienda de Persona)
    public static void mostrarListaDePersonas(List<? extends Persona> laLista) {
        for (Persona persona : laLista) {
            System.out.println(persona.nombreCompleto());
        }
    }

    // Si usamos extends Entrenable, ahora solo funcionara con las clases que empleen la interfaz Entrenable, que serian solo Deportista y Futbolista
    public static void mostrarListaDeEntenables(List<? extends Entrenable> laLista) {
        for (Entrenable persona : laLista) {
            persona.entrenar();
        }
    }

    // Comodin de limite inferior, EN INGLES SE LLAMA LOWER BOUND WILDCARD
    // Para asegurarnos de guardar elementos de x tipo, se debe recurrir a la superclase
    // Para ello, haciendo <? super Deportista> le decimos que la lista puede ser Deportista o cualquier superclase de Deportista
    // Esto ya que por ejemplo un Futbolista es un Deportista, pero no al reves, ya que un Deportista podria ser un nadador, un tenista, etc
    public static void agregarDeportistaALaLista(List<? super Deportista> laLista, String nom, String ape, int ene) {
        Deportista d = new Deportista(nom, ape, ene);
        laLista.add(d);
    }
}
