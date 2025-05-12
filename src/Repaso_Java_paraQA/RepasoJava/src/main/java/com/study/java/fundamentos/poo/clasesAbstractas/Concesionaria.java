package com.study.java.fundamentos.poo.clasesAbstractas;

import java.util.ArrayList;

public class Concesionaria {

    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
    }
    
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
