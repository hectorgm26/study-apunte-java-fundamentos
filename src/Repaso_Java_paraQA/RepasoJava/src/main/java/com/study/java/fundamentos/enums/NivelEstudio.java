package com.study.java.fundamentos.enums;

// Se coloca luego del public la palabra reservada enum para definir un enum
public enum NivelEstudio {

    // Un enum es una clase especial que representa un conjunto de constantes
    // Se listan en mayusculas y separados por comas, con _ para separar palabras, los valores posibles
    // Sus valores son estaticos, es decir, no requieren instanciarse, se acceder por NombreClase.NOMBRE_CONSTANTE (Ejemplo: NivelEstudio.PRIMARIO)

    SIN_ESTUDIOS,
    PRIMARIO,
    SECUNDARIO,
    TERCIARIO,
    UNIVERSITARIO,
    POSTGRADO;
}
