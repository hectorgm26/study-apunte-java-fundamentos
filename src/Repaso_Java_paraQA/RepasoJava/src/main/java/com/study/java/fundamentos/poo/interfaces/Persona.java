package com.study.java.fundamentos.poo.interfaces;

public class Persona implements EnviadorMensaje {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Yendo casa por casa a tocar el timbre para decir: " + mensaje);
    }
}
