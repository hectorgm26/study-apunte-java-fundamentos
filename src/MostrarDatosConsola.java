public class MostrarDatosConsola {
    /*
    No se puede imprimir varias constantes/variables en un sout. Es un sout por variable/constante
    System.out.println(nombreVariable);
     */

    /* Combinar mensajes y variables
    Se concatenan con el signo +, y tenemos que manejar los espacios manualmente
     */
    public static void main(String[] args) {

        final var profesion = "Abogado";
        final var cantidadJuiciosGanados = 3;
        final var letraFavorita = 'c';
        final var peso = 80.52;
        final var esColegiado = false;

        System.out.println(profesion);
        System.out.println("Su profesión es: " + profesion);
        
        System.out.println(cantidadJuiciosGanados);
        System.out.println(letraFavorita);
        System.out.println(peso);
        System.out.println(esColegiado);

    }
}
