package com.study.java.fundamentos.poo.upcasting;

public class Main {
    public static void main(String[] args) {

        Vehiculo v = new Vehiculo("Toyota", "Corolla", "ABC123");
        Auto a = new Auto(true, "Honda", "Civic", "XYZ789");
        Moto m = new Moto(20, "Yamaha", "MNO456", "300XLDD");

        // Upcasting: convertir un objeto de una subclase a su superclase. Sin herencia no podemos tener upcasting
        Vehiculo a2 = new Auto(true, "Honda", "Civic", "XYZ789");
        // En este caso se puede, porque un auto es un vehoculo, pero un auto NO es una moto, por lo que eso no se podria
        // Tiene que haber una estrecha relacion. Este proceso se llama generalizacion, que es cuando se toma un objeto de una subclase y se lo convierte a su superclase
        // Se hace implicitamente un casting o promocion de objeto
        Vehiculo a3 = a; // podemos hacerlo con objetos ya creados

        Concesionaria c = new Concesionaria();
        c.agregarVehiculo(a); // el auto se convierte a vehiculo y se guarda en la lista de vehiculos
        c.agregarVehiculo(m); // la moto se convierte a vehiculo y se guarda en la lista de vehiculos

        a.acelerar();
        a.toString();
        a.prenderAire();

        Vehiculo v1 = a;
        v1.acelerar();
        v1.toString();
        // v1.prenderAire(); // No se puede llamar a prenderAire porque no existe en la clase Vehiculo, pero si existe en la clase Auto
        // ESTO PORQUE GENERALIZAR HACER PERDER INFORMACION MUY ESPECIFICA, EN ESTE CASO, LOS UNICOS CAPACES DE PRENDER AIRE SON LOS AUTOS
        // Y HAY QUE ANALIZAR QUE SON CAPACES DE REALIZAR TODOS LOS VEHICULOS (SUPERCLASE)
        // ES DECIR, PERDEMOS LA CAPACIDAD DE PEDIR METODOS ESPECIFICOS DE LA SUBCLASE SI LOS CONVERTIMOS A LA SUPERCLASE


        // Tambien podemos hacer
        // c.agregarVehiculo(new Auto(true, "Honda", "Civic", "XYZ789"));
        // c.agregarVehiculo(new Moto(20, "Yamaha", "MNO456", "300XLDD"));
    }
}
