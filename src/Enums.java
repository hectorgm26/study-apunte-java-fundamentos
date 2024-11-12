public class Enums {
    public static void main(String[] args) {

        final var nivel = Nivel.ALTO;
        mostrarMensaje(nivel);
    }

    static void mostrarMensaje(Nivel nivel) { // el parametro es de tipo Enum
        switch (nivel) {
            case BAJO -> System.out.println("Nivel bajo");
            case MEDIO -> System.out.println("Nivel medio");
            case ALTO -> System.out.println("Nivel alto");
        }
    }

    enum Nivel {   // enum con tres opciones
        BAJO,
        MEDIO,
        ALTO
    }
}

/*
Son una forma de agrupar constantes, y se pueden usar en switch case
Su sintaxis es igual a la de una clase, pero con la palabra reservada enum
En el ejemplo, en la linea 16, se declara un enum llamado nivel, con tres opciones
En la linea 8 le pasamos al metodo un nivel del enum, por eso en el parametro se coloca en mayuscula, ya que es el tipo de dato Enum y luego en miniscula ya que es el nombre del dato
En la line 3 se declara un nivel con el valor ALTO, y se lo pasamos al metodo switch
 */

/*
CON EL FIN DE NO HARDCODEAR EL NIVEL (VALORES QUE SE ANOTAN TAL CUAL EN EL CODIGO, NO SIENDO PROPORCIONADOS POR EL USUARIO)
SE PUEDE HACER LO SIGUIENTE: podemos leerlo por string, y luego transformarlo a un enum con el metodo valueOf

public class Enums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nivelLeido;

        System.out.println("Ingrese un nivel: ");
        nivelLeido = scanner.nextLine();

        final var nivel = Nivel.valueOf(nivelLeido); // convierte el string a un enum

        mostrarMensaje(nivel);
    }

    static void mostrarMensaje(String nivel) {
        switch (nivel) {
            case "BAJO" -> System.out.println("Nivel bajo");
            case "MEDIO" -> System.out.println("Nivel medio");
            case "ALTO" -> System.out.println("Nivel alto");
        }
    }

    enum Nivel {   // enum con tres opciones
        BAJO,
        MEDIO,
        ALTO
    }

    PRIMERO SE LEE POR TECLADO UN NIVEL
    LUEGO SE CONVIERTE A ENUM CON EL METODO valueOf, POR ESO ANTES DEL VALUE OF, SE DEBE LEER UN STRING
    Y POR ESO LA PALABRA NIVEL VA EN MAYUSCULA
    POSTERIOR SE LE PASA LA CONSTANTE NIVEL AL METODO MOSTRAR MENSAJE

 */
