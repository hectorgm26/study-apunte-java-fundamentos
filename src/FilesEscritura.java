import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesEscritura {
    public static void main(String[] args) {

        final File file = new File("src/files/output.txt");

        try {
            final FileWriter fileWriter = new FileWriter(file);

            fileWriter.write(String.format("Hola%n"));
            fileWriter.write(String.format("Mundo%n"));
            fileWriter.write(String.format("como%n"));
            fileWriter.write(String.format("estan%n"));
            fileWriter.write(String.format("ustedes%n"));
            fileWriter.close();
            
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
            System.err.printf("IOException: %s%n", e.getLocalizedMessage());
        }

    }
}

/*
PRIMERO SE DEBE TENER EL PATH

EJEMPLO: INTELIJ PERMITE OBTENER EL PATH DE UN ARCHIVO DANDO CLICK DERECHO SOBRE EL ARCHIVO Y SELECCIONANDO COPY PATH/REFERENCE
Y CLIC EN PATH FROM CONTENT ROOT

LUEGO
4. SE CREA CONSTANTE FILE CON EL PATH DEL ARCHIVO A CREAR
5. SE CREA UN TRY CATCH PARA ESCRIBIR EN EL ARCHIVO
A) SE CREA UN FILEWRITER QUE RECIBE EL FILE
B) SE USA EL METODO WRITE DEL FILEWRITER PARA ESCRIBIR EN EL ARCHIVO, SIN OLVIDAR EL SALTO DE LINEA
C) SE CIERRA EL FILEWRITER

6. EN EL CATCH SE CAPTURA LA IOEXCEPTION Y SE MUESTRA UN MENSAJE DE ERROR CUANDO NO SE ENCUENTRA EL FILE O NO SE PUEDA ESCRIBIR EN EL

7. EL FILE ES CREADO AUTOMATICAMENTE POR JAVA, NO ES NECESARIO CREARLO MANUALMENTE



 */
