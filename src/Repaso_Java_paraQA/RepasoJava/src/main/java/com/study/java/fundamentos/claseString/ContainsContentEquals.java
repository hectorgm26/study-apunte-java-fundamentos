package com.study.java.fundamentos.claseString;

public class ContainsContentEquals {
    public static void main(String[] args) {

        // El metodo contains ubica una subcadena dentro de otra cadena, para encontrar una coincidencia
        // Este metodo devuelve un valor booleano, y es sensible a mayusculas y minusculas
        // Si la subcadena se encuentra dentro de la cadena, aunque no sea la palabra completa, devuelve true. Basta con que la subcadena coincida con una parte de la cadena
        String cadena = "Video tutoriales de Java desde 0";

        String palabra = "Python";

        Boolean r = cadena.contains("Java");
        System.out.println("La cadena contiene la subcadena: " + r);
        Boolean r2 = cadena.contains(palabra);
        System.out.println("La cadena contiene la subcadena: " + r2);


        // El metodo contentEquals verifica si una cadena es igual a otra cadena en su totalidad.
        // Es decir, si la cadena completa es igual a la subcadena

        String cadena2 = "Video tutoriales de Java desde 0";
        String word = "java";
        String word2 = "Video tutoriales de Java desde 0";

        boolean resultado_busqueda = cadena2.contentEquals(word);
        System.out.println("La cadena es igual a la subcadena: " + resultado_busqueda);

        boolean resultado_busqueda2 = cadena2.contentEquals(word2);
        System.out.println("La cadena es igual a la subcadena: " + resultado_busqueda2);
    }
}
