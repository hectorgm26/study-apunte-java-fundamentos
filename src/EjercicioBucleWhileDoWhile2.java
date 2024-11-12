import java.util.Scanner;

public class EjercicioBucleWhileDoWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia;

        do {
            System.out.println();
            dia = ScannerManager.leerString(scanner, "Ingrese un dia de la semana");

            if (!dia.equals("SALIDA")) {
                // Convertir la entrada a un valor de la enumeración Dia
                Dia diaEnum = Dia.valueOf(dia);
                // Imprimir el resultado
                imprimirResultado(diaEnum, calcularKcal(diaEnum));
            }
        } while (!dia.equals("SALIDA"));   // se repetire el bucle, mientras que la opcion digitada NO SEA SALIDA
        // el metodo equals permite comparar el contenido de dos cadenas de texto strings, sobre si son iguales o no
        scanner.close();
    }

    static void imprimirResultado(Dia diaSemana, int calorias) {
        System.out.printf("Para el dia %s, se tienen que quemar %d calorias", diaSemana, calorias);
    }

    static int calcularKcal(Dia diaSemana) {
        return switch (diaSemana) {
            case LUNES -> 350;
            case MARTES -> 420;
            case MIERCOLES -> 220;
            case JUEVES -> 600;
            case VIERNES -> 125;
            case SABADO -> 250;
            case DOMINGO -> 100;
            default -> -1;
        };
    }

    enum Dia {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO,
        SALIDA
    }
}
