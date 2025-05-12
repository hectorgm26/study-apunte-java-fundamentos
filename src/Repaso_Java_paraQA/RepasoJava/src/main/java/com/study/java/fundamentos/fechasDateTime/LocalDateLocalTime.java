package com.study.java.fundamentos.fechasDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class LocalDateLocalTime {
    public static void main(String[] args) {

        // El paquete java.time contiene las clases LocalDate y LocalTime. Fue introducido en java8, antes se usaba java.util.date
        // LocalDate representa una fecha en terminos de year, month y day, pero no tiene campos de time o timezone
        // LocalTime representa el tiempo en terminos de un dia de 24 hrs en hour, minute, second y nanosecond, pero no tiene campos de fecha o timezone
        // LocalDateTime representa el concepto de date y time combinados, pero no tiene campos de timezone

        // PARA DEFINIR UN OBJETO LocalDate podemos utilizar now
        LocalDate now = LocalDate.now();
        System.out.println("Fecha de hoy = " + now);

        // PARA DEFINIR UN OBJETO LocalTime podemos utilizar now
        LocalTime thisTime = LocalTime.now();
        System.out.println("Hora de hoy = " + thisTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Fecha y hora de hoy = " + currentDateTime);
        //  EL FORATO DE LOCALDATETIME ES ISO8601 EXTENDIDO


        // Podemos definir un objeto localDate CON UNA FECHA ESPECIFICA con el metodo of, pasandole los valores de year, month y day
        // Podemos en el mes pasarle el ENUM Month.ElMes especifico de java.time
        // Tambien podemos pasarle el ENUM DayOfWeek.ElDia para el dia de la semana

        LocalDate someDay = LocalDate.of(2023, Month.FEBRUARY, 31);
        System.out.println("Fecha especifica = " + someDay);

        // Podemos definir un objeto localTime CON UNA HORA ESPECIFICA con el metodo of, pasandole los valores de hour, minute, second y nanosecond
        LocalTime someTime = LocalTime.of(10, 30, 45);
        System.out.println("Hora especifica = " + someTime);

        // Podemos definir un objeto localDateTime CON UNA FECHA Y HORA ESPECIFICA con el metodo of, pasandole los valores de year, month, day, hour, minute, second y nanosecond
        LocalDateTime localDateTime = LocalDateTime.of(2023, 10, 31, 10, 30, 45);
        System.out.println("Fecha y hora especifica = " + localDateTime);


        // El metodo atTime permite agregar una hora a una fecha
        LocalDateTime atTime = someDay.atTime(someTime);
        System.out.println("Fecha y hora especifica = " + atTime);


        // Obtener de una variable LocalDateTime solo la parte de la fecha - metodo toLocalDate o toLocalTime
        LocalDate theDate = localDateTime.toLocalDate();
        System.out.println("Fecha = " + theDate);
        LocalTime theTime = localDateTime.toLocalTime();
        System.out.println("Hora = " + theTime);


        // Obtener el año, mes y dia de una variable LocalDateTime
        int year = localDateTime.getYear();
        System.out.println("Año = " + year);
        int month = localDateTime.getMonthValue();
        System.out.println("Mes = " + month);
        int day = localDateTime.getDayOfMonth();
        System.out.println("Dia = " + day);


        // ENCADENAMIENTO DE OPERACIONES
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Fecha y hora actual = " + current);

        LocalDateTime other = current.withMinute(17).withDayOfMonth(7).plusHours(25);
        System.out.println("Fecha y hora modificada = " + other);


        // Podemos preguntar si fecha es anterior o despues de otra, devuelve true o false
        boolean before = current.isBefore(other);
        System.out.println("Es antes? " + before);

        boolean after = current.isAfter(other);
        System.out.println("Es despues? " + after);

        // Podemos preguntar si una fecha es igual a otra, devuelve true o false
        boolean isEqual = current.isEqual(other);
        System.out.println("Es igual? " + isEqual);


        // SUMAR DIAS
        LocalDateTime plusDays = current.plusDays(5);
        System.out.println("Fecha y hora actual + 5 dias = " + plusDays);
        // RESTAR DIAS
        LocalDateTime minusDays = current.minusDays(5);
        System.out.println("Fecha y hora actual - 5 dias = " + minusDays);

        // SUMAR MESES
        LocalDateTime plusMonths = current.plusMonths(5);
        System.out.println("Fecha y hora actual + 5 meses = " + plusMonths);
        // RESTAR MESES
        LocalDateTime minusMonths = current.minusMonths(5);
        System.out.println("Fecha y hora actual - 5 meses = " + minusMonths);

        // SUMAR AÑOS
        LocalDateTime plusYears = current.plusYears(5);
        System.out.println("Fecha y hora actual + 5 años = " + plusYears);
        // RESTAR AÑOS
        LocalDateTime minusYears = current.minusYears(5);
        System.out.println("Fecha y hora actual - 5 años = " + minusYears);

        // SUMAR HORAS
        LocalDateTime plusHours = current.plusHours(5);
        System.out.println("Fecha y hora actual + 5 horas = " + plusHours);
        // RESTAR HORAS
        LocalDateTime minusHours = current.minusHours(5);
        System.out.println("Fecha y hora actual - 5 horas = " + minusHours);

        // SUMAR MINUTOS
        LocalDateTime plusMinutes = current.plusMinutes(5);
        System.out.println("Fecha y hora actual + 5 minutos = " + plusMinutes);
        // RESTAR MINUTOS
        LocalDateTime minusMinutes = current.minusMinutes(5);
        System.out.println("Fecha y hora actual - 5 minutos = " + minusMinutes);

        // SUMAR SEGUNDOS
        LocalDateTime plusSeconds = current.plusSeconds(5);
        System.out.println("Fecha y hora actual + 5 segundos = " + plusSeconds);
        // RESTAR SEGUNDOS
        LocalDateTime minusSeconds = current.minusSeconds(5);
        System.out.println("Fecha y hora actual - 5 segundos = " + minusSeconds);


        // LEGACY - CLASE DATE
        Date date = new Date();
        System.out.println("Fecha y hora actual = " + date);

        long miliseconds = date.getTime(); // Devuelve la fecha en milisegundos desde el 1 de enero de 1970, que es el epoch. ES EÑ PUNTO DE REFERENCIA DESDE CUAL SE MIDE EL TIEMPO
        // GETTIEM REPRESENTA EL TIEMPO TRANSCURRIDO DESDE EL EPOCH

        date.setTime(miliseconds + (1000 + 60)); // SE LE SUMA 1 MINUTO
        System.out.println("Fecha y hora actual = " + date);
    }
}
