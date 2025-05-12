package com.study.java.fundamentos.genericos.comodines;

import java.util.ArrayList;

// el comodin se usa para poder recibir cualquier tipo de dato en un metodo o variable, pero no se puede usar en una clase
public class Main {
    public static void main(String[] args) {

        ArrayList<Auto> misAutos = new ArrayList<>();
        ArrayList<Persona> misAmigos = new ArrayList<>();

        misAmigos.add(new Persona("Juan", "Perez"));
        misAmigos.add(new Persona("Hector", "Gonzalez"));
        misAmigos.add(new Persona("Yanira", "Fontalba"));

        misAutos.add(new Auto("1223", "blanco"));
        misAutos.add(new Auto("15676", "negro"));
        misAutos.add(new Auto("3543", "rojo"));
        misAutos.add(new Auto("17657", "verde"));

        UtilListas.mostrarLista(misAmigos);
        UtilListas.mostrarLista(misAutos);

        System.out.println();

        // USO DE COMODINES LIMITADOS
        Persona juan = new Persona("Juan", "Perez");
        Deportista usain = new Deportista("Usain", "Bolt", 100);
        Deportista roger = new Deportista("Roger", "Federer", 100);
        Futbolista leo = new Futbolista("Lionel", "Messi", 100, 10);
        Futbolista cristiano = new Futbolista("Cristiano", "Ronaldo", 100, 7);

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(juan);
        personas.add(usain);
        personas.add(roger);
        personas.add(leo);
        personas.add(cristiano);

        ArrayList<Deportista> deportistas = new ArrayList<>();
        deportistas.add(usain);
        deportistas.add(roger);

        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(leo);
        futbolistas.add(cristiano);

        UtilListas.mostrarListaDePersonas(personas);
        UtilListas.mostrarListaDePersonas(deportistas);
        UtilListas.mostrarListaDePersonas(futbolistas);


        UtilListas.agregarDeportistaALaLista(deportistas, "Neymar", "Junior", 100);
        UtilListas.mostrarLista(deportistas);

        UtilListas.agregarDeportistaALaLista(personas, "Pepe", "Gomez", 100);
        UtilListas.mostrarLista(personas);

        // Los genericos se usan en clases, metodos y variables para poder crear una clase o metodo que pueda recibir cualquier tipo de dato
    }
}
