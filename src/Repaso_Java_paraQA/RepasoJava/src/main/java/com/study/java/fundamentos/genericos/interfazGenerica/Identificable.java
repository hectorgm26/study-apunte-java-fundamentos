package com.study.java.fundamentos.genericos.interfazGenerica;

// Para que la interfaz funcione con cualquier tipo de objeto, se le debe agregar un tipo generico <T>
public interface Identificable<T> {

    public abstract T getId();

    public abstract void setId(T x);
}
