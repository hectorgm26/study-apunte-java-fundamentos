package com.study.java.fundamentos.fechasDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocaleTimeDates {
    public static void main(String[] args) {

        // Java provees APIs para hacer tu aplicacion ajustable a diferentes lenguajes y ubicaciones alrededor del mundo

        // El ISO 639 y el ISO 3166 Country Code o UN M.49 son los estandares para definir el lenguaje y la ubicacion respectivamente. y son usados para crear objetos Locale

        // Locale puede representar solo Lenguaje o la representacion de Lenguaje mas Country o Area

        // Variant es un parametro opcional, diseñado para producir variaciones de Locale personalizadas

        // Lenguaje tag string permite construir Locales para varios calendarios, sistemas numericos, monedas, etc


        // LEGACY
        Locale italy = new Locale("it", "IT");
        Locale esMex = new Locale("es", "MX");

        // DESDE JAVA 19 EN ADELANTE PARA DEFINIR UN LOCALE SE USAN CONSTANTES Y YA NO UN CONSTRUCTOR

        Locale localeUs = Locale.US;
        Locale localeJp = Locale.JAPAN;

        /* Sin embargo, estas constantes son limitadas, ya que solo se tienen unos cuantos paises

        static {
         ENGLISH = createConstant(BaseLocale.ENGLISH);
            FRENCH = createConstant(BaseLocale.FRENCH);
            GERMAN = createConstant(BaseLocale.GERMAN);
            ITALIAN = createConstant(BaseLocale.ITALIAN);
            JAPANESE = createConstant(BaseLocale.JAPANESE);
            KOREAN = createConstant(BaseLocale.KOREAN);
            CHINESE = createConstant(BaseLocale.CHINESE);
            SIMPLIFIED_CHINESE = createConstant(BaseLocale.SIMPLIFIED_CHINESE);
            TRADITIONAL_CHINESE = createConstant(BaseLocale.TRADITIONAL_CHINESE);
            FRANCE = createConstant(BaseLocale.FRANCE);
            GERMANY = createConstant(BaseLocale.GERMANY);
            ITALY = createConstant(BaseLocale.ITALY);
            JAPAN = createConstant(BaseLocale.JAPAN);
            KOREA = createConstant(BaseLocale.KOREA);
            UK = createConstant(BaseLocale.UK);
            US = createConstant(BaseLocale.US);
            CANADA = createConstant(BaseLocale.CANADA);
            CANADA_FRENCH = createConstant(BaseLocale.CANADA_FRENCH);
            CHINA = createConstant(BaseLocale.CHINA);
            ROOT = createConstant(BaseLocale.ROOT);
            PRC = createConstant(BaseLocale.PRC);
            TAIWAN = createConstant(BaseLocale.TAIWAN);
            THAILAND = createConstant(BaseLocale.THAILAND);
            CHILE = createConstant(BaseLocale.CHILE);
         */

        // ALTERNATIVA RECOMENDADA - usar el constructor de Locale, que pedira primero el lenguaje y luego el pais, y luego el variant, que es opcional y consiste en un string que indica una variacion del locale
        Locale localeEn = new Locale("en", "GB", "EURO");

        // TAMBIEN SE PUEDE CONSTUIR CON EL PATRON BUILDER
        Locale localeFr = new Locale
                .Builder()
                .setLanguage("fr")
                .setRegion("CA")
                .build();


        // COMO USAR LOCALE CON FECHAS Y HORAS

        LocalDateTime localDateTime = LocalDateTime.of(
                2024,
                4,
                7,
                13,
                25,
                17);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                localDateTime,
                ZoneId.of("US/Pacific")
        );

        String formatted = zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(italy));
        System.out.println("Italy (Long) = " + formatted);

        String formatted2 = zonedDateTime.
                format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(esMex));
        System.out.println("Mexico (Full) = " + formatted2);

        // Language TAG - STRIG QUE IDENTIFICA UN LENGUAJE EN ESPECIFICO
        Locale th = Locale.forLanguageTag("th-TH-u-nu-thai");
        String formatted3 = zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(th));
        System.out.println("Thailand (Full) = " + formatted3);

        /*
        en -> English
        es -> Spanish
        fr -> French
        it -> Italian
        en-US -> English United States
        en-GB -> English Great Britain
        zh-Hans-CN -> Chinese Simplified China
        de-DE-u-co-phonebk -> German Germany
        zh-cmn-Hans-CN -> Chinese Mandarin Simplified China
         */
    }
}
