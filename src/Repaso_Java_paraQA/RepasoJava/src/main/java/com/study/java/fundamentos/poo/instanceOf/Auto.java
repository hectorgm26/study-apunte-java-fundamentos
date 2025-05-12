package com.study.java.fundamentos.poo.instanceOf;

public class Auto extends Vehiculo {

    private boolean tieneAire;

    public Auto(boolean tieneAire, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
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
