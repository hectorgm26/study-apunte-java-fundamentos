import java.util.Scanner;

public class LecturaTecladoScanner {
    /*
    Primero se debe importar la clase Scanner: final var scanner = new Scanner(System.in);
                                               o tambien Scanner scanner = new Scanner(System.in);
    Segundo, se debe escribir el mensaje que se desea mostrar al usuario: System.out.println("Escribe tu nombre: ");
    Tercero, se debe leer el dato ingresado con el scanner, variando la sintaxis segun el dato:

    Para string = scanner.nextLine();             Ejemplo: final var nombre = scanner.nextLine();
    Para int = scanner.nextInt();
    Para double = scanner.nextDouble();
    Para boolean = scanner.nextBoolean();

    Cuarto, se debe cerrar el scanner: scanner.close();
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu edad: ");
        final int edad = scanner.nextInt();

        System.out.print("Escribe tu estatura: ");
        final double estatura = scanner.nextDouble();

        scanner.nextLine();   // Limpia el buffer
        /*
        Debido al buffer, que es el remantente del scanner despues de leer un dato, se debe limpiar el buffer con el metodo nextLine() para poder leer un string.
        Esto, ya que un scanner se compone de lo que se ingresa como tal, y de un salto de linea que queda en el buffer (\n)
        Y al leer un string, el scanner lee el salto de linea y no el string.
        */
        System.out.print("Escribe tu nombre: ");
        final String nombre = scanner.nextLine();

        scanner.close();

        imprimirResultado(nombre, edad, estatura);
    }

    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("Hola, tu nombre es %s, tu edad es de %d años, y tu estatura es de %.2f metros%n", nombre, edad, estatura);
    }
}
