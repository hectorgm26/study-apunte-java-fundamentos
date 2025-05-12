package com.study.java.fundamentos.poo.superConstructor;

public class Main {
    public static void main(String[] args) {

        Auto a = new Auto(true, "Marca Falsa", "XYZ", "ABC123");
        a.acelerar();
        System.out.println(a);
    }
}
