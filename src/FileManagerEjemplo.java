import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManagerEjemplo {
    public static void main(String[] args) {

        final File fileInput = new File("src/files/input.txt");
        final File fileOutput = new File("src/files/output.txt");

        final List<String> listaInput = FileManager.leerFile(fileInput);
        final List<String> listaOutput = editarInformacion(listaInput);

        FileManager.escribirFile(fileOutput, listaOutput);

    }

    public static List<String> editarInformacion(List<String> listaInput) {
        final List<String> listaOutput = new ArrayList<String>();

        for (String elemento : listaInput) {
            listaOutput.add(elemento.toUpperCase()); //metodo que transforma cada caracter de la cadena a mayuscula
        }
        return listaOutput;
    }
}
