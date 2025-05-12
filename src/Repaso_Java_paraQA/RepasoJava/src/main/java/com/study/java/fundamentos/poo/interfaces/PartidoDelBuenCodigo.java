package com.study.java.fundamentos.poo.interfaces;

import java.util.ArrayList;

public class PartidoDelBuenCodigo {

    private ArrayList<EnviadorMensaje> mensajeros;
    // aL implementar una interfaz e implementar los metodos, se puede agregar en un arraylist del tipo de la interfaz, ya que cumple con el contrato

    public PartidoDelBuenCodigo() {
        this.mensajeros = new ArrayList<>();
    }

    public void agregarMensajero(EnviadorMensaje mensajero) {
        this.mensajeros.add(mensajero);
    }

    public void hacerCampania() {
        for (EnviadorMensaje mensajero : mensajeros) {
            mensajero.enviarMensaje("Vote por el partido del Partido del Buen Código");
        }
    }
}
