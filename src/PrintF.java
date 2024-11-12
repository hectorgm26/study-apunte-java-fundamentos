public class PrintF {
    /* Al printF se le pasa un string con formato y los valores que se quieren mostrar
    Luego los valores se remplazan en el string con el formato que se le pasa
Tabla:
    %d: Entero
    %f: Double o float (decimal)
    %s: String
    %c: Caracter o char
    %b: Boolean
    %n: Salto de línea, agrega un enter para que no salga juntas las lineas de codigo
     */
    // EL ATAJO PARA ESCRIBIR System.out.printf ES souf

    public static void main(String[] args) {
        final var profesion = "Abogado";
        final var cantidadJuiciosGanados = 3;
        final var letraFavorita = 'y';
        final var peso = 80.12;

        System.out.printf("Yo soy %s y tengo %d juicios ganados%n", profesion, cantidadJuiciosGanados);
        System.out.printf("Mi letra favorita es %c%n", letraFavorita);

        /*
        Aqui %f remplaza al valor de peso
        Y SE LE AGREGA EL .2 antes de la f, para que solo muestre 2 decimales
         */
        System.out.printf("Actualmente estoy pesando %.2f%n", peso);
        // RECOMENDACION
        // SOUT Y SOUF PUEDEN MOSTRAR MAS DE UN DATO (SOUT CON EL +)
        // SIMPLEMENTE EL SOUF HACE EL CODIGO MAS LEGIBLE
        // Si deseamos mostrar aunque sea un dato en consola, usamos printf
        // Si solo queremos mostrar un mensaje sin datos usamos sout
    }
}
