package com.study.java.fundamentos.claseString;

public class EqualsEndsWith {

    public static void main(String[] args) {

        // El metodo equals() compara dos cadenas de texto, verificando si son exactamente iguales. Debe devolver un valor booleano

        // NUNCA COMPARAR STRINGS CON ==, SIEMPRE CON EL METODO equals() O equalsIgnoreCase()
        String cadena1 = "Hola Mundo";
        String cadena2 = "Hola mundo";

        if (cadena1.equals(cadena2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        // El metodo equalsIgnoreCase() compara dos cadenas de texto, verificando si son exactamente iguales,
        // pero ignorando las mayusculas y minusculas

        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Son iguales (ignora mayusculas y minusculas)");
        } else {
            System.out.println("No son iguales (ignora mayusculas y minusculas)");
        }


        // El metodo endsWith() verifica si una cadena termina con una subcadena especifica. Solo analiza el final de la cadena
        // Este metodo devuelve un valor booleano, y es sensible a mayusculas y minusculas

        String cadena3 = "Hola Mundo";
        String cadena4 = "Mundo";

        if (cadena3.endsWith(cadena4)) {
            System.out.println("La cadena termina con la subcadena");
        } else {
            System.out.println("La cadena no termina con la subcadena");
        }

        if (cadena3.endsWith("UWU")) {
            System.out.println("La cadena termina con la subcadena");
        } else {
            System.out.println("La cadena no termina con la subcadena");
        }

    }
}
