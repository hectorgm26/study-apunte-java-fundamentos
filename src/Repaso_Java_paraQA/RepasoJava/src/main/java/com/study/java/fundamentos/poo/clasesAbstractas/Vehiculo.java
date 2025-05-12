package com.study.java.fundamentos.poo.clasesAbstractas;

// La palabara abstract se utiliza para definir una clase abstracta, que no puede ser instanciada directamente.
// Se coloca la palabra abstract despues de la palabra class. o despues del public.
// La palabra abstract se utiliza para generalizar cuando no sabemos como se va a implementar un comportamiento, pero queremos definiarlo
// Si un metodo es abstracto, la clase tambien debe ser abstracta.
public abstract class Vehiculo {

    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public abstract void acelerar();
    // Los metodos abstractos no tienen cuerpo, solo la firma del metodo, ni tampoco parametros, ya que no se sabe como se va a implementar.

    public void frenar() {
        System.out.println("Frenando...");
    }

    public void chequearMotor() {
        System.out.println("Chequeando motor...");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void encender() {
        chequearMotor();
        System.out.println("Encendiendo vehiculo...");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", patente='" + patente + '\'' +
                '}';
    }
}
