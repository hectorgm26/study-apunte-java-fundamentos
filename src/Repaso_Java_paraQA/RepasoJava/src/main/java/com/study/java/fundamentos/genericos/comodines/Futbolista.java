package com.study.java.fundamentos.genericos.comodines;

public class Futbolista extends Deportista {

    private int nroCamiseta;

    public Futbolista(String nombre, String apellido, int energia, int nroCamiseta) {
        super(nombre, apellido, energia);
        this.nroCamiseta = nroCamiseta;
    }

    public void patear() {
        System.out.println("Pateando el balon");
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "nroCamiseta=" + nroCamiseta +
                '}';
    }
}
