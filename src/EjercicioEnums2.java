import java.util.Scanner;

public class EjercicioEnums2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mostrarMenu();
        final String generoJuego = ScannerManager.leerString(scanner, "Elija un genero de juego");

        final GeneroJuego genero = GeneroJuego.valueOf(generoJuego);

        mostrarListaJuegos(genero);
    }

    static void mostrarMenu() {
        System.out.println("ACCION");
        System.out.println("LUCHAS");
        System.out.println("RPG");
    }

    static void mostrarListaJuegos(GeneroJuego genero) {
        switch (genero) {
            case ACCION -> {
                System.out.println("Juegos de accion:");
                System.out.println("GOD OF WAR");
                System.out.println("BATMAN ARKHAM");
                System.out.println("SPIDERMAN");

            }
            case LUCHAS -> {
                System.out.println("Juegos de lucha");
                System.out.println("TEKKEN");
                System.out.println("STREET FIGHTER");
                System.out.println("SMASH BROTHERS");
            }
            case RPG -> {
                System.out.println("Juegos RPG");
                System.out.println("FINAL FANTASY");
                System.out.println("DRAGON QUEST");
                System.out.println("MARIO RPG");
            }
        }
    }

    enum GeneroJuego {
        ACCION,
        LUCHAS,
        RPG
    }
}
