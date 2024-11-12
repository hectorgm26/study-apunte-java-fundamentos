import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        /*
        EJEMPLO DESDE JAVA 17 HACIA ARRIBA (YA NO ES NECESARIO USAR LA PALABRA BREAK)
        (EN VEZ DE DOS PUNTOS, SE USA LA FLECHA -> PARA INDICAR EL BLOQUE A EJECUTAR)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opcion como numero: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Opcion 1");
            case 2 -> System.out.println("Opcion 2");
            case 3 -> System.out.println("Opcion 3");
            default -> System.out.println("Opcion no valida");
        }

        // Ejemplo con varios casos
        char opcion2 = ScannerManager.leerChar(scanner, "Ingrese una opcion como letra: ");

        switch (opcion2) {
            case 'A', 'a' -> System.out.println("Opcion 1");
            case 'B', 'b' -> System.out.println("Opcion 2");
            case 'C', 'c' -> System.out.println("Opcion 2");
            default -> System.out.println("Opcion no validaa");
        }

        // PODEMOS ASIGNAR DATO CON SWITCH DEPENDIENDO DEL CASE QUE ENTRE

        final var mensaje = switch (opcion) {
            case 'a', 'A' -> "Opcion 1";
            case 'b', 'B' -> "Opcion 2";
            case 'c', 'C' -> "Opcion 3";
            default -> "Opcion no valida";
        };

        // Este bloque es distinto, ya que usa yield,
        // cuando se requiere hacer algo mas que solo asignar un valor
        
        final var mensaje2 = switch (opcion2) {
            case 'A', 'a' -> {
                System.out.println("elegiste la opcion A");
                yield "Opcion 1"; // yield es como return, pero para switch, retorna un valor, y termina el switch
                // en este caso, se asigna el valor "Opcion 1" a la variable mensaje
            }
            case 'B', 'b' -> {
                System.out.println("elegiste la opcion B");
                yield "Opcion 2";
            }
            case 'C', 'c' -> {
                System.out.println("elegiste la opcion C");
                yield "Opcion 3";
            }
            default -> "Opcion no valida";
        };


    }
}

/*
Se usa para evitar varios if else anidados
Se evalua un dato, y se ejecuta un bloque de codigo dependiendo del valor del dato
al terminar cada caso se debe usar la palabra reservada break
si no se usa break, se ejecutaran todos los casos siguientes al caso que se cumpla
si no se cumple ningun caso, se ejecuta el caso default
si no se usa el caso default, no se ejecuta nada si no se cumple ningun caso

Ejemplo DE JAVA 16 HACIA ABAJO

switch (opcion) {
    case 1:
        System.out.println("Opcion 1");
        break;
    case 2:
        System.out.println("Opcion 2");
        break;
    case 3:
        System.out.println("Opcion 3");
        break;
    default:
        System.out.println("Opcion no valida");
        break;


 */

    /*
    Asi se evita usar if else anidados
    ejemplo:
    if (opcion == 1) {
        System.out.println("Opcion 1");
    } else if (opcion == 2) {
        System.out.println("Opcion 2");
    } else if (opcion == 3) {
        System.out.println("Opcion 3");
    }
     */

