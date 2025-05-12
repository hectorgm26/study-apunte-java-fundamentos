package com.study.java.fundamentos.excepciones.interpretarPilaErrores;

public class Verificador {

    public static void checkEsNegativo(int x) {
        if (x < 0) {
            throw new RuntimeException("El número no puede ser negativo");
        }
    }
}
