package com.study.java.fundamentos.excepciones.excepcionesPropias;

public class IntegerOverflowException extends RuntimeException {

    // PODEMOS CREAR NUESTRAS PROPIAS EXCEPCIONES, HEREDANDO DE UNA EXCEPCION YA EXISTENTE
    // PODEMOS CREARLE ATRIBUTOS, METODOS, CONSTRUCTORES, ETC

    // A CONTINUACION IRAN LOS ATRIBUTOS
    // PODEMOS CREAR UN ATRIBUTO QUE SEA EL MENSAJE DE ERROR, PERO NO ES NECESARIO, YA QUE LA CLASE PADRE YA LO TIENE
    private String mensajeError;

    // constructores
    // PODEMOS CREAR UN CONSTRUCTOR VACIO, UNO QUE RECIBA UN MENSAJE Y UNO QUE RECIBA UN MENSAJE Y UNA EXCEPCION
    public IntegerOverflowException(String mensajeError) {
        super(mensajeError); // ESTO SIGNIFICA QUE LLAMAMOS AL CONSTRUCTOR DE LA CLASE PADRE, QUE EN ESTE CASO ES RuntimeException
        // Y CON ELLO YA SE PUEDE CREAR UNA EXCEPCION
    }

    public IntegerOverflowException(String mensajeError, Throwable cause) {
        super(mensajeError, cause);
    }

    public IntegerOverflowException() {
        super();
    }

    public IntegerOverflowException(Throwable cause) {
        super(cause);
    }

    // PODEMOS CREAR METODOS PROPIOS EN NUESTRAS EXCEPCIONES, POR EJEMPLO, PARA QUE NOS DEVUELVA UN MENSAJE PERSONALIZADO
    public String getMessage() {
        return "Error: " + super.getMessage();
    }
}
