package com.study.java.fundamentos.excepciones.excepcionesPropias;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int y, z;
        System.out.println("Ingrese el valor de y: ");
        y = Integer.parseInt(new Scanner(System.in).nextLine());
        z = new Calculadora().factorial(y);
        System.out.println("Resultado: " + z);
        System.out.println("Fin del programa");
        
    }
}
