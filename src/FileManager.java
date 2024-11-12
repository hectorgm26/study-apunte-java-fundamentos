import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileManager {

    public static List<String> leerFile(File file) {
        final List<String> lista = new ArrayList<String>();

        try {
            final Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                lista.add(scanner.nextLine());
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
            System.err.printf("FileNotFoundException: %s%n", e.getLocalizedMessage());
        }
        return lista;
    }

    public static void escribirFile(File file, List<String> lista) {

        try {
            final FileWriter fileWriter = new FileWriter(file);

            for (String linea : lista) {
                final String lineaEscribir = String.format("%s%n", linea); // se escribe linea y salto de linea
                fileWriter.write(lineaEscribir);
            }
            fileWriter.close();
            
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
            System.err.printf("IOException: %s%n", e.getLocalizedMessage());
        }
    }
}
