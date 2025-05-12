package com.study.java.fundamentos.poo.clasesAbstractas;

public class Main {
    public static void main(String[] args) {

        Concesionaria c = new Concesionaria();
        Auto a = new Auto(true, "Ford", "Fiesta", "ABC123");

        c.agregarVehiculo(a);
        c.agregarVehiculo(new Moto(10, "Yamaha", "YZF-R3", "XYZ789"));
        // c.agregarVehiculo(new Vehiculo("Toyota", "Corolla", "LMN456")); DARA ERROR POR VEHICULO SER UNA CLASE ABSTRACTA, QUE NO SE PUEDE INSTANCIAR

        // Una clase abstracta es una clase que no se puede instanciar directamente, pero puede ser extendida por otras clases. SON GENERALIZACIONES
        // por lo tanto no se puede crear un objeto de la clase Vehiculo directamente.
        // Sirve para definir un comportamiento común para todas las clases que la extienden, como un contrato.
        // Los metodos pueden ser implementados de diferentes maneras en las subclases
        // Las clases que extienden de una clase abstracta, OBLIGATORIAMENTE implementan los métodos abstractos definidos en la clase abstracta.
        // Una clase abstracta no impide que trabajemos con sus atributos y métodos no abstractos, ni tampoco impide trabajar con las subclases, o recibir parametros de la clase abstracta
    }
}
