package com.study.java.fundamentos.fechasDateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDurationInstant {
    public static void main(String[] args) {

        // La api java.time ademas de date y time, puede representar periodos de tiempo y duraciones de estos

        // La clase duration representa una duracion de tiempo en segundos y nanosegundos
        // La clase period representa una cantidad de tiempos en años, meses y dias
        // La clase instant representa un punto en el tiempo, es decir, una fecha y hora especifica (time stamp)


        // ************************** PERIOD **************************
        // Period se utiliza para representar una cantidad de tiempo en años, meses y dias. No tiene en cuenta las horas, minutos y segundos.
        // Esta diseñada para medir diferencias entre fechas en terminos de calendario
        // IDEL PARA UTILIZARLO EN LOGICA DE NEGOCIO
        LocalDate now = LocalDate.now();
        LocalDate other = LocalDate.of(2024, Month.MARCH, 1);

        Period howLong = Period.between(other, now);
        System.out.println("De " + other + " a " + now + " hay: " + howLong);
        // Se imprimira en Period PnYnMnD SIENDO n LOS VALORES DE AÑOS, MESES Y DIAS (EJEMPLO: P2Y10M11D - 2 AÑOS, 10 MESES Y 11 DIAS) y si algun valor es 0 es omitido

        // Obtener el numero de dias de un periodo
        int days = howLong.getDays();
        System.out.println("Dias: " + days);

        // Obtener el numero de meses de un periodo
        int months = howLong.getMonths();
        System.out.println("Meses: " + months);

        // Obtener el numero de años de un periodo
        int years = howLong.getYears();
        System.out.println("Años: " + years);


        //*************************** Instant **************************
        // Instant representa un punto en el tiempo, es decir, una fecha y hora especifica (time stamp), basado en un conteo de segundos desde el epoch
        // Se usa para marcar y calcular diferencias de tiempo entre puntos precisos en el tiempo
        // IDEAL PARA TAREAS DE SISTEMA
        Instant timeStamp = Instant.now();
        System.out.println("Instant: " + timeStamp); // Se observara el valor exacto de la fecha y hora en el momento de la ejecucion

        int nanoSecondFromLastSecond = timeStamp.getNano();
        System.out.println("Nanosegundos desde el segundo actual: " + nanoSecondFromLastSecond);


        // ******************* Duration **************************
        // Duration se utiliza para representar una cantidad de tiempo en segundos y nanosegundos. No tiene en cuenta los años, meses y dias.
        // A diferencia de Period, duration es una medida mas granular y se utiliza para representar diferencias de tiempo en terminos de unidades de tiempo mas pequeñas como horas, minutos y segundos
        // Es util para calculos precisos de tiempo
        // IDEAL PARA TAREAS DE SISTEMA
        Duration duration = Duration.ofHours(48);
        System.out.println("Duracion: " + duration);
        // Se imprimira en PTnHnMnS SIENDO n LOS VALORES DE HORAS, MINUTOS Y SEGUNDOS (EJEMPLO: PT2H30M15S - 2 HORAS, 30 MINUTOS Y 15 SEGUNDOS) y si algun valor es 0 es omitido

        // RESTAR MINUTOS - metodo minusMinutes
        long seconds = duration.minusMinutes(20).getSeconds();
        System.out.println("Duracion menos 30 minutos: " + seconds + " segundos");

        // RESTAR HORAS - metodo minusHours
        long seconds2 = duration.minusHours(1).getSeconds();
        System.out.println("Duracion menos 1 hora: " + seconds2 + " segundos");

        // RESTAR DIAS - metodo minusDays
        long seconds3 = duration.minusDays(1).getSeconds();
        System.out.println("Duracion menos 1 dia: " + seconds3 + " segundos");

        // RESTAR SEMANAS - metodo minusWeeks
        long seconds4 = duration.minusDays(7).getSeconds();
        System.out.println("Duracion menos 1 semana: " + seconds4 + " segundos");

        // RESTAR MESES - metodo minusMonths
        long seconds5 = duration.minusDays(30).getSeconds();
        System.out.println("Duracion menos 1 mes: " + seconds5 + " segundos");

        // RESTAR AÑOS - metodo minusYears
        long seconds6 = duration.minusDays(365).getSeconds();
        System.out.println("Duracion menos 1 año: " + seconds6 + " segundos");

        // RESTAR SEGUNDOS - metodo minusSeconds
        long seconds7 = duration.minusSeconds(30).getSeconds();
        System.out.println("Duracion menos 30 segundos: " + seconds7 + " segundos");


        // PODEMOS PARSEAR UN STRING A UN OBJETO DURATION
        Duration parsed = Duration.parse("P4DT12H30M5S"); // P4D = 4 DIAS, T12H30M5S = 12 HORAS, 30 MINUTOS Y 5 SEGUNDOS
        System.out.println("Duracion parseada: " + parsed);

        /* Formato que podemos enviar a parse
        PdDThHmMs.sS donde h representa horas, m minutos y s segundos. Y si alguna unidad tierne valor 0 se omite
         */


    }
}