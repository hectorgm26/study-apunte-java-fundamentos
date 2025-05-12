package com.study.java.fundamentos.excepciones;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {

        int x = 10;
        int y, z;
        System.out.println("Ingrese el valor de y: ");
        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace(System.err);
        } finally {
            System.out.println("Ejecucion finalizada");
        }
    }
}
