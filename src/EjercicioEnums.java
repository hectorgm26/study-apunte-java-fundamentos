import java.util.Scanner;

public class EjercicioEnums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia;

        dia = ScannerManager.leerString(scanner, "Ingrese un dia de la semana");

        final var diaSemana = Dia.valueOf(dia);

        final int kcal = calcularKcal(diaSemana);

        imprimirResultado(diaSemana, kcal);
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
        DOMINGO
    }

}
