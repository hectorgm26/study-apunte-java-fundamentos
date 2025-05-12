package com.study.java.fundamentos.fechasDateTime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoned {
    public static void main(String[] args) {

        // Fechas y tiempo con zonas

        // TIme zones pueden ser aplicados a LocalDate y LocalTime
        // La clase TimeZoned representa valores de fecha y tiempo de acuerdo a las reglas del time zone (zona horaria)
        // Tiene las mismas capacidades de administracion como LocalDateTime
        // Provee cuentas para el horario de verano y las diferencias de time zone
        // Provee operaciones de time zone especificas como withZoneSameInstant y withZoneSameLocal


        // Definir zonas horarias
        ZoneId.of("Europe/Berlin");
        ZoneId.of("America/Sao_Paulo");
        ZoneId.of("GMT-4");
        ZoneId.of("UTC-05:00");
        ZoneId.systemDefault();

        ZoneId london = ZoneId.of("Europe/London");
        ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");

        LocalDateTime localeDateTime = LocalDateTime.of(
                2019,
                Month.JULY,
                17,
                4,
                47);

        // Asignar la zona horaria a un LocalDateTime existente - metodo ZonedDateTime.of, pidiendo primero el LocalDateTime, y segundo la zona horaria
        // Objeto que representa una fecha y hora en una zona horaria especifica, lo que significa que se ajustara a la zona horaria
        ZonedDateTime londonTime = ZonedDateTime.of(localeDateTime, london);
        System.out.println("London time: " + londonTime);

        // Cambiar la zona horaria de un ZonedDateTime existente, manteniendo el mismo instante de tiempo - metodo withZoneSameInstant
        ZonedDateTime saoPauloTime = londonTime.withZoneSameInstant(saoPaulo);
        System.out.println("Sao Paulo time: " + saoPauloTime);

        // Cambiar la zona horaria de un ZonedDateTime existente - metodo withZoneSameLocal, pero mantiene la misma fecha y hora
        ZonedDateTime saoPauloTime2 = londonTime.withZoneSameLocal(saoPaulo);
        System.out.println("Sao Paulo time 2: " + saoPauloTime2);


    }
}