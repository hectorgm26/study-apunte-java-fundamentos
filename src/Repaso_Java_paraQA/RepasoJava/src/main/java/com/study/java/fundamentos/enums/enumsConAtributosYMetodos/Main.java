package com.study.java.fundamentos.enums.enumsConAtributosYMetodos;

public class Main {
    public static void main(String[] args) {

        Continente[] continentes = Continente.values();

        for (int i = 0; i < continentes.length; i++) {
            System.out.println(continentes[i].densidadPoblacion());
        }

    }
}
