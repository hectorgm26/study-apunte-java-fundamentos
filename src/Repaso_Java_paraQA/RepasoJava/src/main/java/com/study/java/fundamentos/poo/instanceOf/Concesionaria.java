package com.study.java.fundamentos.poo.instanceOf;

import java.util.ArrayList;

public class Concesionaria {

    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    // No sabemos que tipo de objeto esta llegando. Por ende para discriminar esto se usa el instanceof
    // El instanceof es un operador que se utiliza para comprobar si un objeto es una instancia de una clase o de una interfaz.
    // Devuelve true si el objeto es una instancia de la clase o interfaz especificada, y false en caso contrario.
    // Se pueden preguntar por objetos arriba en jerarquia y abajo en jerarquia
    // Es como un operador ==, pero para clases y a nivel de tipo de datos (no de valores)
    public void agregarVehiculo(Vehiculo v) {
        this.vehiculos.add(v);

        if (v instanceof Auto) {
            System.out.println("Se agrego un auto");
        }

        if (v instanceof Moto) {
            System.out.println("Se agrego una moto");
        }
    }

}
