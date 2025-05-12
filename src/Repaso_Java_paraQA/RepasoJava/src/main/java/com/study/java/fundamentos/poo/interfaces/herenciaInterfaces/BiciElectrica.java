package com.study.java.fundamentos.poo.interfaces.herenciaInterfaces;

// public class BiciElectrica implements Recargable, Vehiculo (de esta forma repetimos el codigo, que no es optimo)
public class BiciElectrica implements VehiculoRecargable {
    // Implementando VehiculoRecargable, que extiende a Vehiculo y Recargable, hacemos que se puedan usar los metodos de ambas interfaces
    // Java no permite la herencia multiple, PERO SI EN INTERFACES (una interfaz puede extender a varias interfaces)

    @Override
    public void recargar() {
        System.out.println("Recargando la batería de la bici");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor de la bici");
    }

}
