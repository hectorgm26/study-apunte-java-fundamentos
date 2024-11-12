import java.util.Scanner;

public class BucleWhileDoWhileMenuInfinito {

    public static void main(String[] args) {

        /*
        IDENTIFICAR LA OPCION DE SALIDA. EJEMPLO = QUE EL USUARIO DIGITE 'D' o 'd' PARA SALIR DEL MENU
        LUEGO, DEBEMOS DETERMINAR LA CONDICION DE CONTINUACION DEL BUCLE, NEGANDO LA OPCION DE SALIDA
        YA QUE EL BUCLE SE VOLVERA A EJECTURAR, SIEMPRE QUE LA OPCION DIGITADA SEA DISTINTA A D
         */

        Scanner scanner = new Scanner(System.in);
        char opcion;   // esta variable que se usa para almacenar la opción del menú, es el iterador que se volverá a pedir al usuario

        do {
            mostrarMenu();
            opcion = ScannerManager.leerChar(scanner, "Ingrese una opción");

            if (opcion != 'D' && opcion != 'd') {   // si la opción no es D/d, entonces se ejecuta el metodo de ejecutarOpcion
                ejecutarOpcion(opcion);              // se agrega el if, con el fin de que no se ejecute el metodo si la opción es D/d
            }
        } while (opcion != 'D' && opcion != 'd');     // mientras la opción no sea D/d, el bucle se repetira
        // y se volvera a mostrar el menú

    }

    static void mostrarMenu() {
        System.out.println("A/a : Hola");
        System.out.println("B/b : Buenos días");
        System.out.println("C/c : Final Fantasy");
        System.out.println("D/d : Salir del programa");
    }

    static void ejecutarOpcion(char opcion) {
        switch (opcion) {
            case 'A', 'a' -> System.out.println("Hola");
            case 'B', 'b' -> System.out.println("Buenos días");
            case 'C', 'c' -> System.out.println("Final Fantasy");
            case 'D', 'd' -> System.out.println("Saliendo del programa");
            default -> System.out.println("Opción no válida");
        }
    }


}
