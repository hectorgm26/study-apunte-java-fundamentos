package com.study.java.fundamentos.claseString;

public class TextBlocks {
    public static void main(String[] args) {

        // Text Blocks son string literales de multiple lineas que evitan la necesidad de secuencias de escape y formatea automaticamene el texto
        // esto de manera predecible dandole al desarrollador contrrol total de la forma en que se ve el texto
        // Para utilizarlo se necesitan triple comillas dobles al inicio y al final del bloque de texto
        // DISPONIBLES DESDE JAVA 17
        // Los espacios para identar se ignoran, pero se pueden utilizar para mejorar la legibilidad del bloque de texto.
        // Por ende si se quiere correr el texto a la derecha, se deben mover las comillas de cierre a la derecha
        // Si se mueven las comillas de cierre a la izquierda, se eliminan los espacios en blanco iniciales de cada línea del bloque de texto.

        String html = """
                <html>
                    <head>
                        <title>Hola Mundo</title>
                    </head>
                    <body>
                        <h1>Hola Mundo</h1>
                        <p>Este es un ejemplo de un bloque de texto en Java.</p>
                    </body>
                """;
        System.out.println(html);

        // PODEMOS INDICAR CON UN \ al final de una linea para indicar que el salto de linea no forma parte del text block
        String u = """
                abc \
                def
                """;
        System.out.println(u); // SE IMPRIMIRA abc def
    }
}
