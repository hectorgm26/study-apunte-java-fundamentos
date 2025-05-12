package com.study.java.fundamentos.poo.upcasting;

public class Moto extends Vehiculo {

    private int anchoManubrio;

    public Moto(int anchoManubrio, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.anchoManubrio = anchoManubrio;
    }

    public void hacerWheelie() {
        System.out.println("Haciendo wheelie con la moto...");
    }
}
