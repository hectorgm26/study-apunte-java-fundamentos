package com.study.java.fundamentos.genericos;

import java.util.ArrayList;


// Los genericos se usan en clases, metodos y variables para poder crear una clase o metodo que pueda recibir cualquier tipo de dato

public class Main {
    public static void main(String[] args) {

        // Los arraylist son genericos, ya que se adaptan a cualquier tipo de objeto
        // Solo existe una clase arraylist, y nosotros como programadores le decimos de que tipo sera el arraylist
        // Los genericos se asocian a la clase, no al objeto, y se identifican con la letra <T> o <E> dentro de los angulos
        // Es un mecanismo de seguridad de tipos, ya desde el tiempo de compilacion, porque si los tipos no coinciden, el compilador nos avisa

        ArrayList<Auto> misAutos = new ArrayList<>();
        ArrayList<Persona> misAmigos = new ArrayList<>();

        // No podemos usar tipos primitivos cuando hay genericidad
        ArrayList<Integer> numeros = new ArrayList<>();
        // si fuera <int> no funcionaria, ya que int no es un objeto ni clase Wrapper envoltorio, sino un tipo primitivo


        misAmigos.add(new Persona("Juan", "Pérez"));

    }
}
