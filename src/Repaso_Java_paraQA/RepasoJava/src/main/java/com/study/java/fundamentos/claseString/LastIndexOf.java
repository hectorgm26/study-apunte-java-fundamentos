package com.study.java.fundamentos.claseString;

public class LastIndexOf {
    public static void main(String[] args) {

        // El metodo lastIndexOf() devuelve la posicion de la ultima aparicion de un caracter o una cadena de texto en una cadena de text
        // Devuelve un entero con la posicion del ultimo caracter o cadena de texto encontrado (no el primero)
        // Si no se encuentra el caracter o la cadena de texto, devuelve -1
        // De forma similar al metodo indexOf(), se puede especificar la posicion desde la que se quiere buscar
        // La diferencia es que el metodo lastIndexOf() busca desde el final de la cadena hacia el principio

        String nombre = "Hector Gonzalez Mora";
        String buscar = "Mora";

        System.out.println(nombre.indexOf(buscar));     // 16
        System.out.println(nombre.lastIndexOf(buscar)); // 16
        // ✅ Ambos métodos devuelven 16, porque "Mora" solo aparece una vez.
        //Entonces, buscar la "primera" o la "última" vez no hace diferencia, ya que hay una sola coincidencia.

        // 💡 ¿Cuándo sí hay diferencia? - Cuando la subcadena o carácter aparece más de una vez.

        String texto = "Hola mundo, mundo bonito";

        System.out.println(texto.indexOf("mundo"));      // 5
        System.out.println(texto.lastIndexOf("mundo"));  // 12
        // Aqui se demuestra la diferencia entre ambos metodos, ya que el primer "mundo" se encuentra en la posicion 5
        // y el segundo y ultima coincidencia se encuentra en la posicion 12


        // TAMBIEN PUEDE RECIBIR UN SEGUNDO PARAMETRO QUE ES UN ENTERO QUE INDICARA EL INDICE DONDE COMENZARA A BUSCAR
        int inicio = 7;
        System.out.println(texto.indexOf("mundo", inicio));      // 12

    }
}
