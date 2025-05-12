package com.study.java.fundamentos.poo.interfaces;

public class TelefonoMovil extends Dispositivo implements EnviadorMensaje {

    public void llamar() {
        System.out.print("Llamando desde el movil");
    }

    @Override
    public void enviarMensaje(String mensaje) {
        encender(); // Metodo de la clase padre Dispositivo
        System.out.println(" Conectando con la API de WhatsApp para enviar un mensaje que dice: " + mensaje);
    }
}
