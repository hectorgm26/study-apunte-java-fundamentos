package com.study.java.fundamentos.excepciones.interpretarPilaErrores;

public class Persona {

    private int edad;

    public Persona(int edad) {
        setEdad(edad);
    }

    // Poner throws Excepcion en un metodo o clase indica que el metodo o clase posiblemente puede lanzar una excepcion de ese tipo
    // pero no es obligatorio poner esto, es opcional
    // El throws en el metodo o constructor indica que no nos haremos cargo de la excepcion, pero que eventualmente puede lanzarse
    private void setEdad(int edad) throws IllegalArgumentException {

        try {
            Verificador.checkEsNegativo(edad);
            this.edad = edad;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("La edad debe ser positiva", e);
            // El e sera la causa de la excepcion, y se pasara a la excepcion IllegalArgumentException como argumento
        }
    }
}
