package com.study.java.fundamentos.poo.clasesAbstractas;

public class Moto extends Vehiculo {

    private int anchoManubrio;

    public Moto(int anchoManubrio, String marca, String modelo, String patente) {
        super(marca, modelo, patente);
        this.anchoManubrio = anchoManubrio;
    }

    public void hacerWheelie() {
        System.out.println("Haciendo wheelie con la moto...");
    }

    // El método acelerar() es una implementación específica para la clase Moto, por parte de la clase abstracta Vehiculo.
    // Se puede sobrescribir el método acelerar() de la clase Vehiculo para proporcionar una implementación específica para la clase Moto.
    // Esto es útil si queremos que la moto tenga un comportamiento diferente al de otros vehículos al acelerar.
    // Al sobrescribir el método, se puede cambiar su comportamiento sin afectar a la clase Vehiculo o a otras subclases.
    @Override
    public void acelerar() {
        System.out.println("Acelerando la moto...");
    }
}
