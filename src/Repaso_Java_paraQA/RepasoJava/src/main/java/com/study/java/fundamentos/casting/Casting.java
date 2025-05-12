package com.study.java.fundamentos.casting;

public class Casting {
    public static void main(String[] args) {

        double porcentajeAprobados;
        int total = 50;
        int aprobados = 25;

        porcentajeAprobados = ((double) aprobados / total) * 100; // Casting de int a double, PARA QUE LA DIVISION SE REALICE DE FORMA CORRECTA

        // El casting es un metodo que permite tratar un valor como si fuese de otro tipo
        // No le cambia el valor ni el tipo de dato, si no que solo en el contexto donde se aplique el casting, se trata como el tipo de dato que le indicamos
        // En otras partes del codigo, seguira siendo como era originalmente

        // CASTING POR ENSANCHAMIENTO, es decir, añandiendo decimales a un entero - ES IMPLICITO
        int z = 6;
        double x = 3.12;
        double valorDouble = z; // ESTE CASTING ES IMPLICITO, YA QUE NO SE COLOCA () ANTES
        System.out.println(valorDouble);

        // CASTING POR ESTRECHAMIENTO, es decir, eliminando decimales de un double, para pasarlo a un int - ES EXPLICITO
        // Tenemos un valor que necesita cierta cantidad en memoria para representarse, y utilizamos una variable de mucho menos capacidad para alojarlo
        int valorEntero = (int) x; // POSIBLE PERDIDA DE INFORMACION, ya que el valor decimal se pierde, Y NO HACE EL CAST AUTOMATICO, HAY QUE EXPLICITARLO
        System.out.println(valorEntero);
    }
}
