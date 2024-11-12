public class OperacionesMatematicasComplejas {
    public static void main(String[] args) {
        /*
Para esto se utiliza la clase math y los siguientes metodos:
1) Raiz cuadrada = Math.sqrt(a);
2) Potencia = Math.pow(a, b);
3) PI = Math.PI;
ADVERTENCIA: RAICES Y POTENCIAS TIENEN DE RESULTADO SIEMPRE UN DOUBLE-FLOAT (DECIMAL)
             SIEMPRE RESPETAR MAYUSCULAS Y MINUSCULAS
         */

        final var a = 9;
        final var b = 2;

        // Raiz cuadrada
        final var raizCuadrada = Math.sqrt(a);

        // Potencia
        // a es el numero que se elevará a la potencia b
        final var potencia = Math.pow(a, b);

        System.out.printf("La raiz cuadrada de %d es %.0f%n", a, raizCuadrada);

        System.out.printf("El cuadrado de %d es %.2f%n", a, potencia);
    }
}
