package com.study.java.fundamentos.enums.enumsConAtributosYMetodos;

// lOS ENUM PUEDEN TENER ATRIBUTOS Y METODOS por ser objetos
// El unico lugar donde se pueden crear objetos del tipo del Enum, es el mismo Enum (pero implicitamente)
// AMERICA es igual a colocar public satic final Continente AMERICA = new Continente(100, 200);
// El listado del enum inicializa los objetos de la clase Continente

public enum Continente {
    AMERICA(100, 200),
    EUROPA(300, 400),
    AFRICA(500, 600),
    ASIA(700, 800),
    OCEANIA(900, 1000),
    ANTARTIDA(1100, 1200);

    // Atributos
    private int cantHabitantes;
    private double superficie;

    // Constructor - si o si debe ser privado para que no se pueda instanciar
    // Luego, en la lista del enum se debe abrir parentesis para llamar al constructor y colocar los valores de los parametros y atributos
    private Continente(int cantHabitantes, double superficie) {
        this.cantHabitantes = cantHabitantes;
        this.superficie = superficie;
    }

    // Metodos
    public double densidadPoblacion() {
        return this.cantHabitantes / this.superficie;
    }

    @Override
    public String toString() {
        return "Continente{" +
                "cantHabitantes=" + cantHabitantes +
                ", superficie=" + superficie +
                '}';
    }
}
