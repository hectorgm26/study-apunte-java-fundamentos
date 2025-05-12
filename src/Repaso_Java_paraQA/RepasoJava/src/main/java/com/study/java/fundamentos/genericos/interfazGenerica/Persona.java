package com.study.java.fundamentos.genericos.interfazGenerica;

// Aca como la interfaz es generica, y busca el dato unico por el cual identificar, tenemos que ver que tipo de dato es en la clase
// Como es int, la clase Auto implementa la interfaz Identificable<Integer>
public class Persona implements Identificable<Integer> {

    private int DNI;
    private String nombre;
    private String apellido;

    public Persona(int dNI, String nombre, String apellido) {
        this.DNI = dNI;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI=" + DNI +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public Integer getId() {
        return this.DNI;
    }

    @Override
    public void setId(Integer x) {
        this.DNI = x;
    }
}
