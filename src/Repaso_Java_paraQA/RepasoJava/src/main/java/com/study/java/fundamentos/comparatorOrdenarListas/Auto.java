package com.study.java.fundamentos.comparatorOrdenarListas;

public class Auto {

    private String patente;
    private int kilometraje;

    public Auto(String patente, int kilometraje) {
        this.patente = patente;
        this.kilometraje = kilometraje;
    }

    public String getPatente() {
        return patente;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
