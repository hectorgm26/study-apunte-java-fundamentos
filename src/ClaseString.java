public class ClaseString {

    public static void main(String[] args) {

        // Transformar String en un array de chars - Método toCharArray()
        final String texto = "Aloha";

        final char[] arrayChar = texto.toCharArray();

        for (var i = 0; i < arrayChar.length; i++) {
            System.out.printf("Index %d, valor %c\n", i, arrayChar[i]);
        }

        // STRING COMO CLASE

        // TAMAÑO DE CADENA - Método length()
        System.out.printf("El tamaño del texto es: %d\n", texto.length());

        // OBTENER CHAR SEGUN SU INDEX - Método charAt()
        for (var i = 0; i < arrayChar.length; i++) {
            System.out.printf("Index %d, valor %c\n", i, texto.charAt(i));
        }

        // INDICAR DONDE COMIENZA EL INDICE DEL CHAR O STRING - Método indexOf()
        System.out.printf("El índice de la letra 'l' es: %d\n", texto.indexOf('l'));
        System.out.printf("El String 'oha' comienza en el índice: %d\n", texto.indexOf("oha"));

        // INDICAR DONDE TERMINA EL INDICE DEL CHAR O STRING - Método lastIndexOf()
        System.out.printf("El índice de la última letra 'a' es: %d\n", texto.lastIndexOf('a'));
        System.out.printf("El String 'lo' termina en el índice: %d\n", texto.lastIndexOf("lo"));

        // METODO STRING.FORMAT (MISMA FUNCIONALIDAD QUE PRINTF, PERO DEVUELVE UN STRING EN LUGAR DE IMPRIMIRLO EM CONSOLA)
        /*
        static String obtenerStringFormateado(String texto, int numero) {
            return String.format("Texto: %s, número: %d", texto, numero);
         */

        // DESDE JAVA 15 EXISTEN LOS TEXT BLOCKS O STRINGS MULTILINEA - Se utilizan con tres comillas dobles
        final String multilinea = """
                nombre: Hector
                altura: 1.71
                edad: 27
                """;
        System.out.println(multilinea);

        final String multilinea2 = """
                nombre: %s
                altura: %.2f
                edad: %d
                """;
        System.out.printf(multilinea2, "Hector", 1.71, 27); // o string.format

        // COMPARAR DOS STRING
        // 1. Método equals() - Compara el contenido de dos strings - retorna un boolean
        if (multilinea.equals(multilinea2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        // 2. Método equalsIgnoreCase() - Compara el contenido de dos strings sin importar mayúsculas o minúsculas - retorna un boolean
        if (multilinea.equalsIgnoreCase(multilinea2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        // 3. Metodo contains() - Comprueba si un string contiene otro string - retorna un boolean
        if (multilinea.contains("Hector")) {
            System.out.println("Contiene el nombre");
        } else {
            System.out.println("No contiene el nombre");
        }

        // CONVERTIR STRING A MAYÚSCULAS O MINÚSCULAS
        // 1. Método toUpperCase() - Convierte un string a mayúsculas
        System.out.println(texto.toUpperCase());

        // 2. Método toLowerCase() - Convierte un string a minúsculas
        System.out.println(texto.toLowerCase());

        // REEMPLAZAR UNA PARTE DE UN STRING
        // Método replace() - Reemplaza una parte de un string por otra
        // PRIMER PARAMETRO: EL STRING QUE SE VA A REEMPLAZAR, EL SEGUNDO PARAMETRO: EL STRING POR EL QUE SE VA A REEMPLAZAR
        System.out.println(texto.replace("Aloha", "Hola"));

        // COMPARTIR UN STRING ALFABETICAMENTE - Método compareTo()
        // Devuelve un número negativo si el string es menor al string que se compara
        // Devuelve un número positivo si el string es mayor al string que se compara
        // Devuelve 0 si los strings son iguales
        if (texto.compareTo("Hola") == 0) {
            System.out.println("Son iguales");
        } else if (texto.compareTo("Hola") < 0) {
            System.out.println("Es menor");
        } else {
            System.out.println("Es mayor");
        }

        // OTRO EJEMPLO DE ORDENAMIENTO
        /* DE FORMA ASCENDENTE, ES DECIR DE MENOR A MAYOR
        public int compareTo(Cuenta otraCuenta) {
        if (this.numero < otraCuenta.numero) {    // Si MI número de cuenta es MENOR
        return -1;                            // MI cuenta va ANTES
        }
        if (this.numero > otraCuenta.numero) {    // Si MI número de cuenta es MAYOR
        return 1;                             // MI cuenta va DESPUÉS
        }
        return 0;                                 // Si son IGUALES, mantienen su posición
        }
         */

        /*
        // DE FORMA DESCENDENTE, ES DECIR DE MAYOR A MENOR
        public int compareTo(Cuenta otraCuenta) {
        if (this.numero < otraCuenta.numero) {
        return 1;        // Ahora si MI cuenta es menor, va DESPUÉS
        }
        if (this.numero > otraCuenta.numero) {
        return -1;       // Ahora si MI cuenta es mayor, va ANTES
        }
        return 0;
        }
         */

        // COMPARAR ALFABÉTICAMENTE IGNORANDO MAYÚSCULAS O MINÚSCULAS - Método compareToIgnoreCase()
        if (texto.compareToIgnoreCase("hola") == 0) {
            System.out.println("Son iguales");
        } else if (texto.compareToIgnoreCase("hola") < 0) {
            System.out.println("Es menor");
        } else {
            System.out.println("Es mayor");
        }

        // DESDOBLAR UN STRING CON UN SEPARADOR - RETORNA UN ARRAY DE STRINGS - Método split()
        final String texto2 = "Hola, qué tal, cómo estás";
        final String[] palabras = texto2.split(", ");
        for (var palabra : palabras) {
            System.out.println(palabra); // IMPRIMIRA 3 LINEAS
        } // EXPLICACION DEL METODO SPLIT: EL METODO SPLIT RECIBE UN STRING QUE ES EL SEPARADOR, Y DEVUELVE UN ARRAY DE STRINGS, DONDE CADA STRING ES UNA PARTE DEL STRING ORIGINAL QUE ESTABA SEPARADA POR EL SEPARADOR


        // VERIFICAR SI UN STRING EMPIEZA O TERMINA CON UNA CADENA - Método startsWith() y endsWith()
        if (texto.startsWith("Alo")) {
            System.out.println("Empieza con Alo");
        } else {
            System.out.println("No empieza con Alo");
        }

        if (texto.endsWith("ha")) {
            System.out.println("Termina con ha");
        } else {
            System.out.println("No termina con ha");
        }

        // VERIFICAR SI EL STRING ESTÁ VACÍO - Método isEmpty() - RETORNA UN BOOLEAN
        if (texto.isEmpty()) {
            System.out.println("Está vacío");
        } else {
            System.out.println("No está vacío");
        }

        // OBTENER UN SUBSTRING DE UN STRING - Método substring()
        // PRIMER PARAMETRO: EL ÍNDICE DESDE DONDE SE QUIERE OBTENER EL SUBSTRING
        // SEGUNDO PARAMETRO: EL ÍNDICE HASTA DONDE SE QUIERE OBTENER EL SUBSTRING
        System.out.println(texto.substring(1, 3)); // IMPRIMIRA "lo"
    }
}

/*
Tecnicamente hablando, un string es un array de chars (caracteres)
 */
