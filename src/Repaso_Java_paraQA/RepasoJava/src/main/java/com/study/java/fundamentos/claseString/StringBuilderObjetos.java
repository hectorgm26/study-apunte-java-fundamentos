package com.study.java.fundamentos.claseString;

public class StringBuilderObjetos {
    public static void main(String[] args) {

        // Los objetos StringBuilder son mutables, es decir, se pueden modificar sin crear un nuevo objeto, a diferencia de los objetos String que son inmutables.

        // Tienen metodos adicionales como append (agregar), insert (insertar), delete (eliminar), replace (reemplazar), reverse (invertir) y otros.

        // Acepta String o char como parametros

        // La secuencia de caracteres debe ser continua, puede contener espacios, pero no se puede dejar posiciones vacias.

        // Se le puede definir una capacidad inicial, pero esta es autoincrementable, es decir, si se supera la capacidad inicial, se aumenta automaticamente.

        new StringBuilder();
        new StringBuilder("code");
        new StringBuilder(100);

        StringBuilder a = new StringBuilder();
        // append agrega al final de la cadena
        a.append("tea"); // a = "tea"
        a.append("m"); // a = "teas"

        // insert inserta algo en la posicion indicada
        a.insert(3, "m"); // a ="team"

        // delete elimina la cadena desde la posicion inicial hasta la posicion final
        a.delete(2, 4); // a = "tes"

        // reverse invierte la cadena
        a.reverse(); // a = "set"

        // Length devuelve la longitud de la cadena
        int length = a.length(); // length = 3
        int capacidad = a.capacity(); // capacidad = 16 (por defecto)
        System.out.println("Longitud: " + length);
        System.out.println("Capacidad: " + capacidad);

        // SI SE INTENTA INSERTAR UN DATO EN UNA POSICION QUE EXCEDE LA LONGITUD DE LA CADENA, SE GENERA UNA insertIndexOutOfBoundsException
    }
}
