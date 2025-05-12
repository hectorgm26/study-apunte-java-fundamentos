package com.study.java.fundamentos.excepciones.interpretarPilaErrores;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona(-1);

        /* Esto lanzara en la traza de pila de ejecucion de error (stacktrace o callstack):
        Exception in thread "main" java.lang.RuntimeException: El número no puede ser negativo
	        at com.study.java.fundamentos.excepciones.interpretarPilaErrores.Verificador.checkEsNegativo(Verificador.java:7)
	        at com.study.java.fundamentos.excepciones.interpretarPilaErrores.Persona.setEdad(Persona.java:12)
	        at com.study.java.fundamentos.excepciones.interpretarPilaErrores.Persona.<init>(Persona.java:8)
	        at com.study.java.fundamentos.excepciones.interpretarPilaErrores.Main.main(Main.java:6)

        En la traza de pila se puede ver el flujo de la ejecucion, desde el metodo main hasta el metodo que lanza la excepcion.
        Se leen de abajo hacia arriba, la ultima linea de la traza es la primera y primer metodo que se ejecuta.
        Y si queremos seguir el flujo de la ejecucion, tenemos que leer de abajo hacia arriba.
        En el tope de la pila se encontrara el metodo que lanza la excepcion


         */
    }
}
