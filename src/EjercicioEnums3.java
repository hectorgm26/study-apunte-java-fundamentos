import java.util.Scanner;

public class EjercicioEnums3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        mostrarMenu();

        final String mes = ScannerManager.leerString(scanner, "Ingrese un mes del año");
        final Mes mesEnum = Mes.valueOf(mes);

        mostrarCantidadDias(mesEnum);
    }

    static void mostrarMenu() {
        System.out.println("Meses del año");
        System.out.println("ENERO");
        System.out.println("FEBRERO");
        System.out.println("MARZO");
        System.out.println("ABRIL");
        System.out.println("MAYO");
        System.out.println("JUNIO");
        System.out.println("JULIO");
        System.out.println("AGOSTO");
        System.out.println("SEPTIEMBRE");
        System.out.println("OCTUBRE");
        System.out.println("NOVIEMBRE");
        System.out.println("DICIEMBRE");
    }

    static void mostrarCantidadDias(Mes mesEnum) {
        switch (mesEnum) {
            case ENERO, MARZO, MAYO, JULIO, AGOSTO, OCTUBRE, DICIEMBRE -> System.out.println("El mes tiene 31 dias");
            case FEBRERO -> System.out.println("El mes tiene 28 dias");
            case ABRIL, JUNIO, SEPTIEMBRE, NOVIEMBRE -> System.out.println("El mes tiene 30 dias");
        }
    }

    enum Mes {
        ENERO,
        FEBRERO,
        MARZO,
        ABRIL,
        MAYO,
        JUNIO,
        JULIO,
        AGOSTO,
        SEPTIEMBRE,
        OCTUBRE,
        NOVIEMBRE,
        DICIEMBRE
    }
}
