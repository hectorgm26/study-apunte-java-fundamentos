package com.study.java.fundamentos.excepciones.checkedUnchecked;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        VisorDeTXTs v = new VisorDeTXTs();

        try {
            v.mostrarTxt("C:\\Users\\Personal\\Documents\\Cursos\\Repaso_Java\\RepasoJava\\src\\main\\java\\com\\study\\java\\fundamentos\\excepciones\\checkedUnchecked\\MENSAJE_OCULTO.txt");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }
    }
}

/*
DIFERENCIAS ENTRE THROW (LANZAR) Y THROWS (LANZA)

EL THROW CUANDO SE TRATA DE LANZAR UNA EXCEPCION NO CHEQUEADA. NO NECESITA QUE SE DECLARE QUE EL METODO LANCE EL THORW
EN CAMBIO SI SE CONVIERTE EN UNA EXCEPCION CHEQUEADA, ENTONCES SE DEBE COLOCAR EN UN TRY-CATCH, O LANZAR UN THROW, O DECLARARLA EN EL METODO CON THROWS


 */
