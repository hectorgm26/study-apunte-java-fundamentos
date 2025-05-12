package com.study.java.fundamentos.poo.upcasting;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String patente;

    // Los constructores no se heredan bajo ninguna circunstancia
    // Siempre en las clases que no hay un constructor, java por defecto e implicitamente crea uno (uno vacio sin argumentos)
    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

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
