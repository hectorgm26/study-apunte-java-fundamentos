import java.util.Scanner;

public class EjercicioSwitchCase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia;

        dia = ScannerManager.leerString(scanner, "Ingrese un dia de la semana");

        calcularCal(dia);
        imprimirResultado(dia, calcularCal(dia));
    }

    static int calcularCal(String dia) {
        final int calorias = switch (dia) {
            case "Lunes", "lunes" -> 350;
            case "Martes", "martes" -> 420;
            case "Miercoles", "miercoles" -> 220;
            case "Jueves", "jueves" -> 600;
            case "Viernes", "viernes" -> 125;
            case "Sabado", "sabado" -> 250;
            case "Domingo", "domingo" -> 100;
            default -> -1;
        };
        return calorias;
    }
    /*
    Este metodo se pudo realizar tambien de la siguiente fomra:
    static int calcularKcal (String dia) {
    return switch (dia) {
        case "Lunes", "lunes" -> 350;
        case "Martes", "martes" -> 420;
        case "Miercoles", "miercoles" -> 220;
        case "Jueves", "jueves" -> 600;
        case "Viernes", "viernes" -> 125;
        case "Sabado", "sabado" -> 250;
        case "Domingo", "domingo" -> 100;
        default -> -1;
    };

    Luego en el main, asignar el retorno del metodo a una variable y luego imprimir el resultado
    final int calorias = calcularKcal(dia);
     */

    static void imprimirResultado(String dia, int calorias) {
        System.out.printf("Para el dia %s, se tienen que quemar %d calorias", dia, calcularCal(dia));
    }
}
