package com.study.java.fundamentos.poo.interfaces;

public class Main {
    public static void main(String[] args) {

        PartidoDelBuenCodigo p = new PartidoDelBuenCodigo();

        p.agregarMensajero(new PalomaMensajera());
        // aL implementar una interfaz e implementar los metodos, se puede agregar en un arraylist del tipo de la interfaz, ya que cumple con el contrato
        p.agregarMensajero(new TelefonoMovil());
        p.agregarMensajero(new Persona());

        p.hacerCampania();
    }
}
