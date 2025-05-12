package com.study.java.fundamentos.genericos.interfazGenerica;

// Aca como la interfaz es generica, y busca el dato unico por el cual identificar, tenemos que ver que tipo de dato es en la clase
// Como es String, la clase Auto implementa la interfaz Identificable<String>
public class Auto implements Identificable<String> {

    private String patente;
    private String color;

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public String getId() {
        return this.patente;
    }

    @Override
    public void setId(String x) {
        this.patente = x;
    }
}
