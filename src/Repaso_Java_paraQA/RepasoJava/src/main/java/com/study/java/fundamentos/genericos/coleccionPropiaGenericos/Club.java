package com.study.java.fundamentos.genericos.coleccionPropiaGenericos;

public class Club {

    private String nombre;
    private PaisSudamericano pais;

    public Club(String nombre, PaisSudamericano pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Club{" +
                "nombre='" + nombre + '\'' +
                ", pais=" + pais +
                '}';
    }
}
