package com.study.java.fundamentos.divisionDecimales;

import java.util.Scanner;

public class DivisionDecimales {
    public static void main(String[] args) {

        // La division tiene un caso participar, ya que pese a esperar en ciertos casos resultados con coma, siempre recibimos datos enteros

        Scanner input = new Scanner(System.in);
        int total, aprobados;
        double porcAprobados;

        System.out.println("Cantidad total de alumnos: ");
        total = Integer.parseInt(input.nextLine());

        System.out.println("Cantidad de alumnos aprobados: ");
        aprobados = Integer.parseInt(input.nextLine());

        // (25 / 50) = 0.5 * 100 = 50, PERO DARA COMO RESULTADO 0, DEBIDO A QUE JAVA AL DIVIDIR ENTEROS EN EL (), SE QUEDA CON LA PARTE ENTERA
        // IGNORANDO LA PARTE DECIMAL DESPUES DE LA COMA O PUNTO
        // PARA QUE JAVA PRODUZCA UN RESULTADO CON DECIMALES EN UNA FUNCION ARITMETICA, NECESITAMOS AL MENOS UN OPERANDO DOUBLE INVOLUCRADO

        // SOLUCION:
        porcAprobados = (aprobados * 1.0 / total) * 100; // Colocar un .0 al valor, hara que cambie a tipo double, sin cambiar su valor
        // PERO EL PROBLEMA VIENE DEL PARENTESIS, por lo que podemos a uno de los valores multiplicarlo por 1.0, cambiando el tipo de dato, y manteniendo su valor

        // OTRA SOLUCION - Utilizando el casting
        // porcAprobados = ((double) aprobados / total) * 100;
        // Colocando un (double) antes de la variable, le decimos a java que lo convierta a double, y luego realice la division, PERO SIN CAMBIAR EL VALOR NI EL TIPO REALMENTE, YA QUE SOLO CAMBIA PARA LA OPERACION

        System.out.printf("Aprobo el %.2f%% de los alumnos\n", porcAprobados); // Asi podemos limitar los decimales a mostrar
    }
}
