package com.study.java.fundamentos.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa e = new Empresa();

        e.agregarPersona(new Persona("Juan", "Pérez", NivelEstudio.PRIMARIO));
        e.agregarPersona(new Persona("Ana", "Gómez", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("Luis", "Martínez", NivelEstudio.SECUNDARIO));
        e.agregarPersona(new Persona("María", "López", NivelEstudio.UNIVERSITARIO));
        e.agregarPersona(new Persona("Pedro", "García", NivelEstudio.TERCIARIO));
        e.agregarPersona(new Persona("Laura", "Fernández", NivelEstudio.SIN_ESTUDIOS));
        e.agregarPersona(new Persona("Carlos", "Ramírez", NivelEstudio.SIN_ESTUDIOS));
        e.agregarPersona(new Persona("Sofía", "Torres", NivelEstudio.TERCIARIO));

        e.mostrarPorNivel(NivelEstudio.SECUNDARIO);

        // Los enums hacen que sean objetos del tipo de la clase enum
        System.out.println(NivelEstudio.PRIMARIO.ordinal());
        // el metodo ordinal devuelve en que orden se enumero esa constante en el enu, contandose igual que un array
        System.out.println(NivelEstudio.SECUNDARIO.name());
        // el metodo name devuelve el nombre de la constante del enum en forma de String, aunque tambien se puede usar toString()
        System.out.println();


        // Tambien hay metodos estaticos de los enum
        NivelEstudio[] niveles = NivelEstudio.values(); // se puede crear un array del tipo del enum, ya que es un objeto
        // Values devuelve un array con los valores del enum. De esta forma se puede recorrer
        for (int i = 0; i < niveles.length; i++) {
            System.out.println((i + 1) + ")" + niveles[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nivel de estudios: ");
        int opcionUsuario = Integer.parseInt(input.nextLine());
        // Como se convirtio el enum a un array, se puede acceder a sus valores como si fuera un array
        System.out.println("Usted eligio el nivel: " + niveles[opcionUsuario - 1]);

        // metodo valueOf, que convierte un String en el valor del enum.
        // PERO ESE VALOR DEBE SER EXACTAMENTE IGUAL AL NOMBRE DE UNO DE LOS VALORES DEL ENUM
        NivelEstudio.valueOf("PRIMARIO");
        // Si no existe el valor, lanza una excepcion IllegalArgumentException
        // La cadena para convertir al enum debe representar realmente una constante del enum
        // Es mas facil obtener la cadena en base a un enumerado pero no al reves
        // Por eso se recomienda usar el metodo de la clase enum que devuelve un array con los valores del enum y asi se puede recorrer
    }
}
