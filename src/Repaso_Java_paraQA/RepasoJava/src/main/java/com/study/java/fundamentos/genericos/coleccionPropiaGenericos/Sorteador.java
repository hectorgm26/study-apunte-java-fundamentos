package com.study.java.fundamentos.genericos.coleccionPropiaGenericos;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;

// Con los <> y con <T> se indica que es generico, que indica que no estaremos atados a un tipo de dato
// Se coloca en la clase, ya que es una clase generica que puede recibir cualquier tipo de dato
public class Sorteador<T> {

    // Necesita un atributo lista de tipo generico
    private ArrayList<T> elementos;
    private Random random;

    // Constructor de la clase
    public Sorteador() {
        this.elementos = new ArrayList<>();
        this.random = new Random();
    }

    // Agregar elemento al sorteador
    public void add(T elemento) {
        elementos.add(elemento);
    }

    // Obtener elemento de forma aleatoria
    public T get() {
        checkEmptyness();
        return elementos.get(rnd());
    }

    public T remove() {
        checkEmptyness();
        return elementos.remove(rnd());
    }

    private void checkEmptyness() {
        if (isEmpty()) {
            throw new NoSuchElementException("No hay mas elementos en el sorteador");
        }
    }

    private int rnd() {
        return random.nextInt(elementos.size());
    }

    // RETORNAR si esta o no vacio el sorteador
    public boolean isEmpty() {
        return elementos.isEmpty();
        // Metodo que delega el metodo propio del arraylist
    }

}
