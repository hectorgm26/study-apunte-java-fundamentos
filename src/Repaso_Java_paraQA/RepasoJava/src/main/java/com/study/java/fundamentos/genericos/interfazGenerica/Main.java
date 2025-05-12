package com.study.java.fundamentos.genericos.interfazGenerica;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona(12345678, "Juan", "Perez");
        Auto a = new Auto("ABC123", "Rojo");

        identificar(p);
        identificar(a);

        a.setId("XYZ789");
        p.setId(87654321);

        System.out.println();
        identificar(p);
        identificar(a);
    }

    public static void identificar(Identificable objIdentif) {
        System.out.println("Yo soy: " + objIdentif.getId());
    }
}
