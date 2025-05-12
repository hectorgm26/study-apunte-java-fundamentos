package com.study.java.fundamentos.poo.upcasting;

import java.util.ArrayList;

public class Concesionaria {

    //private ArrayList<Auto> autos;
    //private ArrayList<Moto> motos;

    // Sin upcasting deberiamos tener dos listas distintas para autos y motos, pero con upcasting podemos tener una sola lista de vehiculos
    private ArrayList<Vehiculo> vehiculos;

    public Concesionaria() {
        //this.autos = new ArrayList<>();
        //this.motos = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        //this.autos.add(a);
        this.vehiculos.add(v);
    }

}
