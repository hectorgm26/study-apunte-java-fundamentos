import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesLectura {
    public static void main(String[] args) {

        final File file = new File("src/archivo.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) { // solo pregunta si hay contenido en el file, no lo lee
                System.out.println(scanner.nextLine()); // este si consume la linea del file
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
            System.err.printf("FileNotFoundException: %s%n", e.getLocalizedMessage());
        }
    }
}


/*
PRIMERO SE DEBE TENER EL PATH DE LOS ARCHIVOS QUE SE VAN A LEER

EJEMPLO: INTELIJ PERMITE OBTENER EL PATH DE UN ARCHIVO DANDO CLICK DERECHO SOBRE EL ARCHIVO Y SELECCIONANDO COPY PATH/REFERENCE
Y CLIC EN PATH FROM CONTENT ROOT

1. SE CREA EL ARCHIVO MANUALMENTE
2. SE COPIA EL PATH Y LO PEGAMOS EN LA CLASE DESEADA
3. SE ELIMINA EL ARCHIVO CREADO MANUALMENTE YA QUE JAVA LO CREARA AUTOMATICAMENTE

LUEGO

4. SE CREA UNA CONSTANTE FILE CON EL PATH DEL ARCHIVO
5. SE CREA UN TRY CATCH PARA LEER EL ARCHIVO
A) SE CREA UN SCANNER QUE RECIBE EL ARCHIVO
B) EN UN WHILE PREGUNTAMOS SI HAY CONTENIDO CON HASNEXTLINE
C) SI LO HAY LEEMOS DEL FILE CON NEXTLINE
D) TERMINADO EL BUCLE, SE CIERRA EL SCANNER
6. EN EL CATCH SE MUESTRA UN MENSAJE DE ERROR Y SE MUESTRA EL TIPO DE ERROR CON GETLOCALIZEDMESSAGE SI NO SE ENCUENTRA EL ARCHIVO


 */