package com.study.java.fundamentos.poo.interfaces;

public class PalomaMensajera extends Ave implements EnviadorMensaje {

    public void volarRapido() {
        System.out.print("Volando...");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        volarRapido();
        System.out.println(" Lanzando un papelito que dice: " + mensaje);
    }
}
