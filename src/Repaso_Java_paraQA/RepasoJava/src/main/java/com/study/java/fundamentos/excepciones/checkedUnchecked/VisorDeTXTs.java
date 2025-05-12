package com.study.java.fundamentos.excepciones.checkedUnchecked;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VisorDeTXTs {

    // El throws en el metodo o constructor indica que no nos haremos cargo de la excepcion, pero que eventualmente puede lanzarse
    // Es obligatorio el uso de throws em los metodos que podrian lanzar una excepcion checked
    public void mostrarTxt(String ruta) throws FileNotFoundException, IOException {

        File archivo = new File(ruta);
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        System.out.println(br.readLine());


        // Error y sus subclases RuntimeException son unchecked (no verificadas)
        // Esto porque no es necesario manejarlo con try-catch, ni declararlas en la clausula throws de un metodo o constructor
        // Tampoco obliga a manejarlas y tratarlas con un try-catch, pero es recomendable

        
        // En cambio las excepciones que heredan de Exception son checked (verificadas)
        // Esto porque si no se manejan con un try-catch o no se declaran en la clausula throws de un metodo o constructor
        // Si no se manejan, el compilador lanza un error de compilacion
        // Deben declararse en la clausula throws de un metodo o constructor, o manejarse con un try-catch
    }
}
