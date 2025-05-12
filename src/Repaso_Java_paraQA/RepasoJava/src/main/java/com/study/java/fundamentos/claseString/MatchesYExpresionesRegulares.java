package com.study.java.fundamentos.claseString;

public class MatchesYExpresionesRegulares {
    public static void main(String[] args) {

        // El metodo matches() de la clase String compara una cadena de texto con una expresion regular
        // y devuelve true si la cadena coincide con la expresion regular, de lo contrario devuelve false

        // Una expresion regular o regex es una secuencia de caracteres o simbolos que forman un patron de busqueda
        // Son sensibles a mayusculas y minusculas
        // Se van apilando en orden de izquierda a derecha, es decir, si se encuentra un patron, se busca el siguiente
        // Son utiles para validaciones de cadenas de texto, como por ejemplo validar un correo electronico, contraseñas, numero de telefono, etc.

        String cprincipal = "a C";
        boolean existe = cprincipal.matches("^a.c");
        System.out.println("El caracter " + cprincipal + " coincide con la regex?: " + existe);

        String cprincipal2 = "1 Y8op";
        boolean existe2 = cprincipal2.matches("^1.[xyz][89]op$");
        System.out.println("El caracter " + cprincipal2 + " coincide con la regex 2?: " + existe2);

        String cprincipal3 = "1 y8owp";
        boolean existe3 = cprincipal3.matches("^1.[xyz][89]o[^wmn]p$");
        System.out.println("El caracter " + cprincipal3 + " coincide con la regex 3?: " + existe3);

        String cprincipal4 = "1234+567 890";
        boolean existe4 = cprincipal4.matches("\\d\\d\\d\\d\\.\\d\\d\\d.\\d\\d\\d");
        // Se colocan dos \ para escapar el caracter \, ya que es un caracter especial en Java
        System.out.println("El caracter " + cprincipal4 + " coincide con la regex 4?: " + existe4);

        String cprincipal5 = "Que9tal";
        boolean existe5 = cprincipal5.matches("\\D\\D\\D\\D\\D\\D\\D");
        System.out.println("El caracter " + cprincipal5 + " coincide con la regex 5?: " + existe5);

        String cprincipal6 = "Que tal9";
        boolean existe6 = cprincipal6.matches("\\w\\w\\w.\\w\\w\\w\\w");
        System.out.println("El caracter " + cprincipal6 + " coincide con la regex 6?: " + existe6);

        String cprincipal7 = "Que tal+";
        boolean existe7 = cprincipal7.matches("...\\W...\\W");
        System.out.println("El caracter " + cprincipal7 + " coincide con la regex 7?: " + existe7);

        // VALIDAR NUMERO TELEFONICO
        /* CLAVES
        833
        311
        779
        722
         */
        String telefono = "833 123 45 67";
        // Para evitar repetir \\d utilizaremos grupos y cuatificadores de repeticion
        boolean valido = telefono.matches("(833|311|779)[\\s-]\\d{3}[\\s-]\\d{2}[\\s-]\\d{2}");
        System.out.println("El telefono " + telefono + " es valido?: " + valido);

        String telefono2 = "871-123-45-67";
        boolean valido2 = telefono2.matches("(833|311|779)[\\s-]\\d{3}[\\s-]\\d{2}[\\s-]\\d{2}");
        System.out.println("El telefono " + telefono2 + " es valido?: " + valido2);
        // d{3} es lo mismo que [0-9]{3}

        String telefono3 = "8331234567";
        boolean valido3 = telefono3.matches("(833|311|779)[\\s-]?\\d{3}[\\s-]?\\d{2}[\\s-]?\\d{2}");
        System.out.println("El telefono " + telefono3 + " es valido?: " + valido3);

        // REDUCIR LA REGEX
        String telefono4 = "8331234567";
        boolean valido4 = telefono4.matches("(833|311|779)[\\s-]?\\d{3}[\\s-]?(\\d{2}[\\s-]?){2}");
        System.out.println("El telefono " + telefono4 + " es valido?: " + valido4);
    }
}
        /* EJEMPLOS DE EXPRESIONES REGULARES
        (?i)   -> indica que la expresion regular es case insensitive, ES DECIR, NO DISTINGUE ENTRE MAYUSCULAS Y MINUSCULAS
        ^       -> Indica el inicio de la cadena - se coloca al inicio y el valor siguiente al ^ sera el que se buscara que coincida
        $       -> Indica el final de la cadena - se coloca al final y el valor anterior al $ sera el que se buscara que coincida
        .       -> Indica cualquier caracter, excepto un salto de linea
        []      -> Indica un conjunto de caracteres, por ejemplo [abc] indica que puede ser a, b o c, y no puede ser ningun otro. Solo acepta 1 carácter del conjunto.
        [^]     -> Indica un conjunto de caracteres negado, por ejemplo [^abc] indica que no puede ser a, b o c
        \\d      -> Indica cualquier digito, es lo mismo que [0-9]
        \\.     -> Indica un punto, para que no tome el . normal como cualquier caracter
        \\D      -> Indica un no digito, es lo mismo que [^0-9]
        \\w      -> Indica CUALQUIER caracter alfanumerico, sin importar mayuscula o minuscula, es lo mismo que [a-zA-Z0-9_] NO INCLUYE ESPACIOS
        \\W      -> Indica un no caracter alfanumerico, es lo opuesto a \w, por lo que incluye espacios, y ningun caracter alfanumerico. Es lo mismo que [^\w]
        \\s      -> Indica un espacio en blanco, es lo mismo que [\t\n\f\r]
        ( )     -> Indica un grupo, por ejemplo (abc) indica que puede ser abc
        |       -> Indica una alternancia, un o, por ejemplo (abc|def) indica que puede ser o a, o b, o c, y no pueden combinarse
        { }     -> Indica un cuantificador de repeticiones, por ejemplo {n} indica que el caracter anterior debe aparecer exactamente n veces
        ?       -> Indica que el caracter anterior puede aparecer 0 o 1 vez. Es decir que puede existir o no, es opcional. Se coloca al final del caracter que se quiere hacer opcional
        +       -> Indica que el caracter anterior puede aparecer 1 o mas veces

        *       -> Indica que el caracter anterior puede aparecer 0 o mas veces
        [a-z]   -> Indica un rango de caracteres, por ejemplo [a-z] indica que puede ser cualquier letra minuscula
        [A-Z]   -> Indica un rango de caracteres, por ejemplo [A-Z] indica que puede ser cualquier letra mayuscula
        \\S      -> Indica un no espacio en blanco, es lo mismo que [^\t\n\f\r]
        {n}     -> Indica que el caracter anterior debe aparecer exactamente n veces
        {n,}    -> Indica que el caracter anterior debe aparecer n o mas veces
        {n,m}   -> Indica que el caracter anterior debe aparecer entre n y m veces
        ?!      -> Indica una negacion, por ejemplo (?!abc) indica que no puede ser abc
        (?=)    -> Indica una afirmacion, por ejemplo (?=abc) indica que debe ser abc
        (?<=)   -> Indica una afirmacion positiva, por ejemplo (?<=abc) indica que debe ser abc
        (?<! )  -> Indica una afirmacion negativa, por ejemplo (?<!abc) indica que no puede ser abc
        (?<=abc) -> Indica que debe ser abc antes de la cadena
        (?<!abc) -> Indica que no puede ser abc antes de la cadena
        (?=abc)  -> Indica que debe ser abc despues de la cadena
        (?<!abc) -> Indica que no puede ser abc despues de la cadena
        \\b      -> Indica un limite de palabra, por ejemplo \babc\b indica que debe ser abc
        \\B      -> Indica un no limite de palabra, por ejemplo \Babc\B indica que no puede ser abc
        \\A      -> Indica el inicio de la cadena, es lo mismo que ^
        \\Z      -> Indica el final de la cadena, es lo mismo que $
        \\G      -> Indica el final de la cadena, es lo mismo que $
        \\n      -> Indica un salto de linea
        \\t      -> Indica un tabulador
        \\r      -> Indica un retorno de carro
        \\f      -> Indica un salto de pagina
        \\v      -> Indica un salto de
        \\0      -> Indica un caracter nulo
        \\xhh    -> Indica un caracter hexadecimal, por ejemplo \x41 indica A
        \\cX    -> Indica un caracter de control, por ejemplo \cA indica el caracter de control A
         */