package com.study.java.fundamentos.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

// Se puede capturar varias excepciones en un solo bloque catch, separando las excepciones por comas.
// Y tambien se puede capturar varias excepciones con distintos bloques catch uno tras otro, siendo el ultimo el bloque catch generico.

// ES MUY IMPORTANTE EL ORDEN EN QUE SE CAPTURAN LAS EXCEPCIONES, YA QUE SI SE CAPTURAN EN UN ORDEN INCORRECTO,
// PUEDE QUE NO SE CAPTURE LA EXCEPCION QUE SE QUIERE CAPTURAR.
// EJEMPLO: SI SE CAPTURA PRIMERO LA MAS GENERICA, NO SE CAPTURARA NINGUNA OTRA EXCEPCION QUE HEREDA DE ELLA,
// YA QUE EL BLOQUE CATCH SE EJECUTARA Y NO SE EJECUTARAN LOS BLOQUES CATCH QUE VIENEN DESPUES, POR SIEMPRE CAERA EN EL BLOQUE GENERICO.

public class Multicatch {
    public static void main(String[] args) {

        int x = 10;
        int y, z;
        System.out.println("Ingrese el valor de y: ");

        try {
            y = new Scanner(System.in).nextInt();
            z = x / y;
            System.out.println("Resultado: " + z);

        } catch (InputMismatchException e) {
            System.out.println("No es un numero entero" + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace(System.err);

        } finally {
            System.out.println("Ejecucion finalizada");
        }
    }
}
