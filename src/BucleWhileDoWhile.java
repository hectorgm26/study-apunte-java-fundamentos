import java.util.Scanner;

public class BucleWhileDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = ScannerManager.leerInt(scanner, "Ingrese un número");

        // BUCLE WHILE                   // NO necesariamente se ejecuta el bucle (depende de la condición)
        System.out.println("Corriendo bucle while");
        int i = 0;                       // declaracion del iterador contador

        while (i < n) {                 // condicion de parada (mientras i sea menor que n, se seguira ejecutando el bucle)
            System.out.printf("Entando en el bucle: %d%n", i);
            i++;                       // incremento del iterador contador
        }
        System.out.println("Terminando el bucle while");


        System.out.println();


        // BUCLE DO-WHILE              // SI SE ejecuta el bucle AL MENOS UNA VEZ (INCLUSO EN CASO QUE NO CUMPLA LA CONDICION)
        System.out.println("Corriendo bucle do while");
        int z = 0;
        
        do {
            System.out.printf("Entando en el bucle: %d%n", z);
            z++;                     // incremento del iterador contador
        } while (z < n);             // condicion de parada (mientras z sea menor que n, se vuelve a ejecutar el bucle)
        System.out.println("Terminando el bucle do while");
    }

}
/*
AMBOS DAN N-1 ITERACIONES
En los bucles for se conocen exactamente el número de iteraciones que se van a realizar
mientras que en los bucles while y do-while no se conoce el número de iteraciones que se van a realizar

en los while-do while se evalua la condición al principio y al final respectivamente
y solo se especifica la condición de parada

el iterador contador se incrementa dentro del bucle de forma manual

EL BUCLE DO WHILE PERMITE HACER MENUS INFINITOS, HASTA QUE EL USUARIO DIGITE OPCION DE SALIDA

 */