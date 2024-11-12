import java.util.ArrayList;
import java.util.List;

public class EjercicioClaseString4 {
    public static void main(String[] args) {

        String data = "CARLOS,ARTURO,MARIA,ANA,ANAHIS,RODRIGO,PEDRO,ARMANDO";

        String[] dataSeparada = data.split(",");

        List<String> listaOrdenadaPorA = new ArrayList<>();

        for (String elemento : dataSeparada) {
            if (elemento.startsWith("A")) {
                listaOrdenadaPorA.add(elemento);
            }
        }

        System.out.printf("La lista ordenada por A es: %s%n", listaOrdenadaPorA);

    }
}
