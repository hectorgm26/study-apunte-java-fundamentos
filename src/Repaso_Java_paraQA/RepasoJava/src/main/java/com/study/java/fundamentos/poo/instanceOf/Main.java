package com.study.java.fundamentos.poo.instanceOf;

public class Main {
    public static void main(String[] args) {

        Vehiculo v = new Vehiculo("Toyota", "Corolla", "ABC123");
        Auto a = new Auto(true, "Honda", "Civic", "XYZ789");
        Moto m = new Moto(20, "Yamaha", "MNO456", "300XLDD");

        Concesionaria c = new Concesionaria();
        c.agregarVehiculo(a);
        c.agregarVehiculo(m);

        // El instanceof es un operador que se utiliza para comprobar si un objeto es una instancia de una clase o de una interfaz.
        // En este caso se aplica en la clase Consesionaria, ya que es la que recibe el vehiculo como lista general, pudiendo recibir autos, motos, etc.

    }
}
