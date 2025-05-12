package com.study.java.fundamentos.excepciones.excepcionesPropias;

public class Calculadora {

    public int factorial(int num) {

        if (num < 0) {
            throw new ArithmeticException("No se puede calcular el factorial de un numero negativo");
            // Este mensaje se mostrara en la consola luego del tipo de error
        }

        if (num > 12) {
            throw new IntegerOverflowException("Por limitaciones tecnicas, no se puede calcular el factorial de un numero mayor a 12");
        }

        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
