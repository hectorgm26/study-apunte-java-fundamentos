package com.study.java.fundamentos.poo.superConstructor;

public class Auto extends Vehiculo {

    private boolean tieneAire;

    public Auto(boolean tieneAire, String marca, String modelo, String patente) {
        // Siempre el constructor de la clase que hereda de otra, invocara primero al constructor de la superclase (clase padre)
        // Para invocar al constructor de la superclase, se utiliza la palabra reservada super, seguido de los argumentos que recibe el constructor de la superclase sin el "this", ni el tipo de dato
        super(marca, modelo, patente); // SIEMRPRE DEBE IR PRIMERO
        this.tieneAire = tieneAire;
    }

    public void prenderAire() {
        if (tieneAire) {
            System.out.println("Prendiendo aire acondicionado...");
        } else {
            System.out.println("El auto no tiene aire acondicionado.");
        }
    }

    public boolean isTieneAire() {
        return tieneAire;
    }

    public void setTieneAire(boolean tieneAire) {
        this.tieneAire = tieneAire;
    }

}
