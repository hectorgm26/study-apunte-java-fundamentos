package com.study.java.fundamentos.wrapperClassesBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Set;

public class WrapperClassesBigDecimal {
    public static void main(String[] args) {

        // Las clases Wrapper son clases que envuelven o contienen tipos de datos primitivos.

        // Se identifican con la letra mayuscula con la que empiezan, a diferencia de los datos primitivos que empiezan con minuscula

        // Se usan cuando deseamos modificar los argumentos pasados a un metodo, ya que los tipos de datos primitivos se pasan por valor. Las colecciones almacenan solo objetos y no datos primitivos

        // Tambien son utiles cuando deseamos manejar valores nulos en los atributos de las clases

        /* AGREGAN CAPACIDADES DE poo A LOS TIOS DE DATOS PRIMITIVOS

        - Convierten tipos de datos primitivos en objetos
        - Podemos crear un Wrapper Object a partir de un tipo de dato primitivo o String con el metodo valueOf
        - Podemos extraer el valor primitivo de un Wrapper Object con el metodo xxxValue (intValue, doubleValue, etc.)
        - En lugar de una conversion formal de Wrapper a primitivo o viceversa, podemos usar el auto-boxing y el auto-unboxing
        - Podemos crear un primitivo a partir de un string usando el metodo parseXXX (parseInt, parseDouble, etc.)
        - Podemos convertir un primitivo a String usando el metodo String.valueOf
        - Las wrapper classes poseen constantes como mix y max para cada tipo
        - Las wrapper classes son inmutables, es decir, no se pueden modificar una vez creadas
        - Se encuentran localizadas en el paquete java.lang (implicitamente importado)
         */

        int a = 42;
        short w = 10; // short es un tipo de dato primitivo que ocupa 2 bytes y en el sel almacenan enteros entre -32,768 y 32,767

        // Podemos crear un Wrapper Object a partir de un tipo de dato primitivo o String con el metodo valueOf
        Integer b = Integer.valueOf(a);
        Short x = Short.valueOf((short) (w + 1)); // al sumar 1 a un valor short, se convierte a int, por lo que se debe castear

        // Podemos extraer el valor primitivo de un Wrapper Object con el metodo xxxValue (intValue, doubleValue, etc.)
        int c = b.intValue();
        short y = x.shortValue();

        // En lugar de una conversion formal de Wrapper a primitivo o viceversa, podemos usar el auto-boxing y el auto-unboxing. ESTE PROCESO PUEDE AFECTAR AL PERFORMANCE PORQUE SE CREAN OBJETOS EN MEMORIA
        b = a; // auto-boxing
        c = b; // auto-unboxing

        // Podemos crear un primitivo a partir de un string usando el metodo parseXXX (parseInt, parseDouble, etc.)
        String d = "12.25";
        float f = Float.parseFloat(d);

        // Podemos convertir un primitivo a String usando el metodo String.valueOf
        String g = String.valueOf(a);

        // Las wrapper classes poseen constantes como mix y max para cada tipo
        Short minValue = Short.MIN_VALUE;
        Short maxValue = Short.MAX_VALUE;

        // Podemos usar valores null
        Short z = null; // no se puede usar un valor null en un tipo de dato primitivo, pero si en un Wrapper Object

        // A la hora de usar colecciones estamos obligados a usar Wrapper classes, ya que si intentamos usar un tipo de dato primitivo, nos dara un error de compilacion
        Set<Long> set = new HashSet<>();
        // Si intentamos Set<long> set = new HashSet<>(); nos dara un error de compilacion, ya que long es un tipo de dato primitivo y no se puede usar en una


        // CLASE BIG DECIMAL

        // Esta clase es util en el manejo de numeros decimales que requieren exacta precision.
        // Esta diseñada para trabajar especificamente con decimales y proveen una conveniente scale y operaciones round
        // Provee operaciones aritmeticas como add, substract, divide, multiply, remainder, etc.
        // Es inmutaable, por lo que cada vez que se realiza una operacion, se crea un nuevo objeto, y tiene signo
        // Tiene precision arbitraria, por lo que no tiene un limite en la cantidad de digitos que puede almacenar, pero Double tiene precision limitada como un numero binario de 64 bits

        double h = 0.1;
        double i = 0.2;

        // Si sumamos 0.1 + 0.2, dara 0.30000000000000004, Y PUEDE PROVOCAR ERRORES DE REDONDEO

        double small = 1.0;
        double large = 10E15;
        double total = small + large;
        // ESTO NO ES UN ERROR, ES UN PROBLEMA DE REDONDEO

        // PARA LOGRAR EXACTITUD EN LOS CALCULOS, DEBEMOS USAR LA CLASE BigDecimal

        BigDecimal bda = new BigDecimal("0.1"); // se recomienda usar String para evitar problemas de redondeo
        BigDecimal bdb = BigDecimal.valueOf(0.2);
        // tambien se puede usar el metodo valueOf para crear un BigDecimal a partir de un double, pero no es recomendable ya que puede provocar problemas de redondeo
        BigDecimal bdsuma = bda.add(bdb);
        System.out.println("El resultado de la suma es: " + bdsuma); // El resultado de la suma es: 0.3

        BigDecimal bds = new BigDecimal("1.0");
        BigDecimal bdl = new BigDecimal("1.0E15");
        BigDecimal bdt = bds.add(bdl);
        System.out.println("El resultado de la suma es: " + bdt); // El resultado de la suma es: 1000000000000001.0

        // OTRA FORMA DE DEFINIR UN BIG DECIMAL ES UTILIZANDO UN ARRAY DE CARACTERES
        char[] charArray = {'1', '2', '3', '.', '4', '5', '6'};
        BigDecimal bdChar = new BigDecimal(charArray);
        System.out.println("El resultado de la suma es: " + bdChar); // El resultado de la suma es: 123456

        // ESCALA Y REDONDEO
        // Escala = numero de decimales que se desean mostrar
        // Redondeo = forma en la que se desea redondear el numero
        BigDecimal bd0 = new BigDecimal("-1");
        BigDecimal bd1 = BigDecimal.valueOf(-0.5);
        BigDecimal bd2 = BigDecimal.valueOf(1.1);

        BigDecimal bd3 = bd0.multiply(bd1).add(bd2).setScale(1, RoundingMode.UP);
        System.out.println("bd3 = " + bd3);

        /* OPCIONES DE REDONDEO CON BIG DECIMAL

        - CEILING: REDONDEA HACIA ARRIBA
        - FLOOR: REDONDEA HACIA ABAJO
        - UP: REDONDEA HACIA ARRIBA
        - DOWN: REDONDEA HACIA ABAJO
        - HALF_UP: REDONDEA HACIA ARR
        - HALF_DOWN: REDONDEA HACIA ABAJO
        - HALF_EVEN: REDONDEA HACIA EL NUMERO PAR MAS CERCANO
        - UNNECESSARY: NO PERMITE REDONDEO
        - HALF_ODD: REDONDEA HACIA EL NUMERO IMPAR MAS CERCANO
        - HALF_TOWARDS_ZERO: REDONDEA HACIA CERO
        - HALF_AWAY_FROM_ZERO: REDONDEA HACIA EL NUMERO MAS CERCANO
        - HALF_TOWARDS_INFINITY: REDONDEA HACIA INFINITO
         */

        BigDecimal bd4 = bd0.multiply(bd1).add(bd2).setScale(0, RoundingMode.CEILING);
        BigDecimal bd5 = bd0.multiply(bd1).add(bd2).setScale(0, RoundingMode.FLOOR);
        BigDecimal bd6 = bd0.multiply(bd1).add(bd2).setScale(0, RoundingMode.UP);
        BigDecimal bd7 = bd0.multiply(bd1).add(bd2).setScale(0, RoundingMode.DOWN);
        BigDecimal bd8 = bd0.multiply(bd1).add(bd2).setScale(0, RoundingMode.HALF_UP);
        BigDecimal bd9 = bd0.multiply(bd1).add(bd2).setScale(0, RoundingMode.HALF_DOWN);
        BigDecimal bd10 = bd0.multiply(bd1).add(bd2).setScale(0, RoundingMode.HALF_EVEN);
        BigDecimal bd11 = bd0.multiply(bd1).add(bd2).setScale(0, RoundingMode.UNNECESSARY);

    }
}

