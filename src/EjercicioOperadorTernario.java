import java.util.Random;

public class EjercicioOperadorTernario {

    public static void main(String[] args) {
        final var random = new Random();
        final int numero = RandomUtilities.generarRandomInt(random, 50, 300);
        System.out.println("El numero aleatorio es: " + numero);

        final String respuesta = validarAltoChance(numero);

        imprimirMensaje(respuesta);
    }

    static String validarAltoChance(int numero) {
        return (numero > 100 || numero % 5 == 0 || numero % 3 == 0) ? "Tienes un alto chance de ganar!" : "NO tienes chance de ganar!";
    }

    static void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
