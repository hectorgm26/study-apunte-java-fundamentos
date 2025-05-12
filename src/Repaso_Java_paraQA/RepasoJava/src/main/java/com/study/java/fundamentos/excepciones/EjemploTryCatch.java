package com.study.java.fundamentos.excepciones;

public class EjemploTryCatch {

    public void algunMetodo() {
        /*
        INSTRUCCIONES SIN POSIBLES EXCEPCIONES
         */
        try {
            System.out.println("Ejecutando instrucciones que pueden lanzar excepciones");
            // Instruccion con posible excepcion
            // Instrucciones que dependen de la que posiblemente de la que lance una excepcion
        } catch (Exception e) {
            System.out.println("Capturando excepcion de tipo UnTipoDeExcepcion");
            // Alguna logica en caso de capturar una excepcion de tipo UnTipoDeExcepcion
        } finally {
            // Bloque OPCIONAL que se ejecuta siempre, sea cualquiera el caso
        }
        /*
        INSTRUCCIONES SIN POSIBLES EXCEPCIONES
         */


        /* TIPOS DE EXCPCIONES

1) Throwable
        TODAS LAS EXCEPCIONES HEREDAN DE LA CLASE THROWABLE. Es la superclase de todos los errores y excepciones en Java.
        Solo las instancias de esta clase (o de sus subclases) pueden ser lanzadass por la JVM o manualmente con la sentencia throw.

        Tiene dos atributos: Message (String) -> getMessage() QUE ES EL MENSAJE SOBRE LO QUE OCURRIO y Cause (Throwable) -> getCause() QUE ES UNA REFERENCIA A OTRA EXCEPCION.

        Tienen el metodo printStackTrace() que imprime la traza o pila de la excepcion en la consola, para mostrar la traza del flujo de la excepcion y depurar.

        ENCADENAR EXCEPCIONES: NOS SIRVE PARA ENTENDER EL FLUJO DEL PROGRAMA O PARA ENCAPSULAR LOS ERRORES, YA QUE PODREMOS NO QUERER EXPONER LOS ERRORES, CAPTURANDO LAS EXCEPCIONES Y RELANZANDOLAS EN OTRAS PARA ASI NO REVELAR INFORMACION DEL PROGRAMA.

        Por convencion Throwable y sus subclases tienen dos constructores:
        - Uno que no toma parametors y otro con uno de tipo String que representa el mensaje detallado
        - Las subclases qie tengan una causa asociada tienen dos constructores adicionales, uno que toma un Throwable (la causa) como argumento y otro que toma un Throwable (la causa) y un String (mensaje detalado) como argumentos.

2) Excepcion y Error
        Excepcion: Es una subclase de Throwable. Representa condiciones excepcionales que pueden ser manejadas por el programa. Las excepciones son situaciones anormales que ocurren durante la ejecucion de un programa y que pueden ser tratadas mediante bloques try-catch.
              - RuntimeException: Representa excepciones que pueden ocurrir en tiempo de ejecucion y que no son verificadas por el compilador. Estas excepciones son generalmente errores de programacion, como division por cero o acceso a un indice fuera de los limites de un arreglo.
                   - ClassCastException: Ocurre cuando se intenta convertir un objeto de una clase a otra clase incompatible.
                   - NullPointerException: Ocurre cuando se intenta acceder a un objeto que es null.
                   - IndexOutOfBoundsException: Ocurre cuando se intenta acceder a un indice de un arreglo o lista que esta fuera de sus limites.
                        - ArrayIndexOutOfBoundsException: Ocurre cuando se intenta acceder a un indice de un arreglo que esta fuera de sus limites.
                        - StringIndexOutOfBoundsException: Ocurre cuando se intenta acceder a un indice de una cadena que esta fuera de sus limites.
                   - ArithmeticException: Ocurre cuando se produce un error aritmetico, como division por cero.

              - java.io.IOException: Representa excepciones relacionadas con la entrada/salida de datos, como errores al leer o escribir archivos.
                   - FileNotFoundException: Ocurre cuando se intenta acceder a un archivo que no existe.
                   - EOFException: Ocurre cuando se alcanza el final de un archivo inesperadamente.

              - java.sql: Representa excepciones relacionadas con el acceso a bases de datos, como errores al ejecutar consultas SQL o problemas de conexion.
                   - SQLException: Ocurre cuando se produce un error al acceder a una base de datos.
                   - SQLSyntaxErrorException: Ocurre cuando hay un error de sintaxis en una consulta SQL.

              - java.awt: Representa excepciones relacionadas con la interfaz grafica de usuario, como errores al dibujar componentes o manejar eventos.
                   - HeadlessException: Ocurre cuando se intenta crear una interfaz grafica en un entorno sin soporte grafico.
                   - AWTException: Ocurre cuando hay un error en la biblioteca AWT (Abstract Window Toolkit).

        Error: Es una subclase de Throwable. Representa condiciones excepcionales que no pueden ser manejadas por el programa. Los errores son situaciones graves que ocurren durante la ejecucion de un programa y que generalmente no pueden ser recuperadas. Por ejemplo, errores de memoria o errores de sistema.
              - IOError: Ocurre cuando hay un error de entrada/salida grave, como problemas de disco o errores de red.
              - ThreadDeath: Ocurre cuando un hilo es terminado de manera abrupta.
              - VirtualMachineError: Ocurre cuando hay un error grave en la maquina virtual de Java, como falta de memoria o problemas de hardware.
                  - StackOverflowError: Ocurre cuando se produce un desbordamiento de pila, generalmente debido a una recursion infinita.
                    - OutOfMemoryError: Ocurre cuando la JVM no puede asignar memoria suficiente para un objeto.
                    - InternalError: Ocurre cuando hay un error interno en la JVM, como problemas de hardware o errores de configuracion.
                         - ZipError: Ocurre cuando hay un error al leer o escribir archivos comprimidos en formato ZIP.
                    - UnknownError: Ocurre cuando hay un error desconocido en la JVM.
         */
    }
}
