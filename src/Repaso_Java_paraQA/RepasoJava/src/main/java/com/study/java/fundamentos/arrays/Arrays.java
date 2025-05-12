package com.study.java.fundamentos.arrays;

public class Arrays {
    public static void main(String[] args) {

        // Los arrays son estructuras de datos que permiten almacenar múltiples valores en una sola variable, de un solo tipo de dato.
        // Conviene darles nombres en plural
        // Se declaran de la siguiente manera:
        // tipoDato[] nombreArray = new tipoDatp[tamaño];
        // El indice comienza en 0 y el tamaño es la cantidad de elementos que puede almacenar el array.
        // Ejemplo de un array de enteros
        int[] numeros = new int[5];
        double[] decimales = new double[5];
        String[] nombres = new String[5];
        char[] letras = new char[5];
        boolean[] booleanos = new boolean[5];


        // Se pueden inicializar de la siguiente manera:
        // tipoDato[] nombreArray = {valor1, valor2, valor3};
        // Ejemplo de un array de enteros
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5}; // Otra forma de inicializar un array

        double[] decimales2 = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] nombres2 = {"Juan", "Pedro", "Maria", "Ana", "Luis"};
        char[] letras2 = {'a', 'b', 'c', 'd', 'e'};
        boolean[] booleanos2 = {true, false, true, false, true};


        // Para agregar valores a un array se utiliza el índice dentro de un []. Estos comienzan en 0.
        // Ejemplo de asignación de valores a un array
        numeros[0] = 1;
        decimales[0] = 1;
        nombres[0] = "Juan";
        letras[0] = 'a';
        booleanos[0] = true;


        // Podeos referir una variable al valor de una posición de un array
        String palabra = nombres[3];


        // Podemos motrar los valores en base a su indice
        System.out.println(numeros2[3]);
        numeros2[3] = 10; // Podemos cambiar y pisar el valor de un elemento en base a su indice
        System.out.println(numeros2[3]);


        // Se pueden recorrer los arrays utilizando un bucle for para imprimir todos los elementos
        // NUNCA USAR system.out.println con solo el nombre del array para imprimirlo, ya que imprime la referencia de memoria del vector
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
            // int elemento = numeros[i];
        }

        // También se pueden recorrer los arrays utilizando un bucle for-each
        for (int numero : numeros2) {
            System.out.println("Elemento: " + numero);
        }
    }
}
