import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertirFechas {

    public static void main(String[] args) {

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha Actual: " + fechaActual);

        // Crear una fecha específica
        LocalDate fechaEspecifica = LocalDate.of(2024, 8, 1);
        System.out.println("Fecha Específica: " + fechaEspecifica);
        // las fechas van en año, mes, dia


        // TRANSFORMAR FECHAS A OTRO TIPO DE DATO PARA IMPRIMIRLA

        // 1) Crear un formateador con el formato deseado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // 2) Transformar la fecha a una cadena con el formato especificado
        String fechaFormateada = fechaActual.format(formatter);
        System.out.println("Fecha Formateada: " + fechaFormateada);
    }

}
