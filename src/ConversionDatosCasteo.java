public class ConversionDatosCasteo {
    public static void main(String[] args) {
        int entero = 10;
        double decimal = 10.5;
        String cadena = "10";

        // Conversión de String a entero
        int cadenaAEntero = Integer.parseInt(cadena);
        System.out.println("Cadena a entero: " + cadenaAEntero);

        // Conversion de String a double
        double cadenaADouble = Double.parseDouble(cadena);
        System.out.println("Cadena a double: " + cadenaADouble);

        // Conversion de String a boolean
        boolean cadenaABoolean = Boolean.parseBoolean(cadena);
        System.out.println("Cadena a boolean: " + cadenaABoolean);

        // Conversion de entero o double, a String
        String numACadena = String.valueOf(entero); // o String.valueOf(decimal)
        System.out.println("Numero a cadena: " + numACadena);

        // Conversión de entero a double
        double enteroADouble = (double) entero;
        System.out.println("Entero a double: " + enteroADouble);

        // Conversión de double a entero
        int doubleAEntero = (int) decimal;
        System.out.println("Double a entero: " + doubleAEntero);


        /* Alternativa

        Conversión de entero a String

        String enteroACadena = Integer.toString(entero);
        System.out.println("Entero a cadena: " + enteroACadena);

        Conversión de double a String

        String doubleACadena = Double.toString(decimal);
        System.out.println("Double a cadena: " + doubleACadena);
        */
    }
}
