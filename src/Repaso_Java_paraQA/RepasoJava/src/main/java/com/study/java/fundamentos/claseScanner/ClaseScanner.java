package com.study.java.fundamentos.claseScanner;

import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        double estatura;

        /* Cada vez que se utiliza nextInt(), nextDouble(), se escanea un valor en consola, sin tener en cuenta que se debe apretar enter para validar,

        El problema es que la tecla enter produce un caracter mas, que la maquina interpreta. NextInt y NextDouble se saltan ese caracter automaticamente, pero NextLine no, ya que lee absolutamenteTodo lo que hay en la consola-

        Por eso es que se ve vacio cuando lo intenta capturar, ya que tomo el enter. ESTE PROBLEMA SIEMPRE EXISTIRA SI SE LEE PRIMERO UN NUMERO Y LUEGO STRINGS
        */

        System.out.print("Ingrese su edad: ");
        //edad = input.nextInt(); // Se usa nextInt() para leer un número entero
        edad = Integer.parseInt(input.nextLine());

        System.out.print("Ingrese su estatura: ");
        //estatura = input.nextDouble(); // Se usa nextDouble() para leer un número decimal
        estatura = Double.parseDouble(input.nextLine());

        // SOLUCION 1: LIMPIAR EL BUFFER - por medio de un nextLine() vacio entremedio del nextInt y el nextLine (NO OPTIMA)
        //input.nextLine();

        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine(); // Se usa nextLine() para leer una línea completa de texto

        // SOLUCION 2; USAR SIEMPRE NextLine() para cualquier tipo de dato, pero aplicandole un parseo a datos distintos a strings para convertirlo a su tipo correspondiente. El casteo es con parseInt, parseDouble, y colocando el tipo de dato correspondiente con mayuscula, es decir, Integer.parseInt, Double.parseDouble, etc. Y el Nextline si era string, se deja intacto,

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu estatura es: " + estatura);

    }
}