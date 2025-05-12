package com.study.java.fundamentos.genericos.coleccionPropiaGenericos;

public enum PaisSudamericano {

    ARGENTINA,
    BRASIL,
    URUGUAY,
    PARAGUAY,
    CHILE,
    BOLIVIA,
    ECUADOR,
    PERU,
    COLOMBIA,
    VENEZUELA,
    GUYANA,
    SURINAME;

    private PaisSudamericano() {
        // evita que se cree una instancia de la clase
    }

    @Override
    public String toString() {
        // RETORNA EL NOMBRE CAPITALIZADO, ES DECIR, EL NOMBRE CON LA PRIMERA LETRA EN MAYUSCULA
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }
}
