package com.study.java.fundamentos.comparatorOrdenarListas;

// Se implementa la interfaz Comparable para poder ordenar objetos de tipo Persona, y se pone en los diamantes <> contra que tipo de dato se comparara
public class Persona implements Comparable<Persona> {

    private int dni;
    private String nombre;
    private String apellido;
    private double altura;
    private EstadoCivil estadoCivil;

    public Persona(int dni, String nombre, String apellido, double altura, EstadoCivil estadoCivil) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.estadoCivil = estadoCivil;// Por defecto, el estado civil es soltero
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getAltura() {
        return altura;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", altura=" + altura +
                ", estadoCivil=" + estadoCivil +
                '}';
    }

    // Lo utiliza el metodo sort
    /*

    // ORDENAR POR DNI
    @Override
    public int compareTo(Persona otra) {
        // PRIMERO SE DEBE ELEGIR UN CRITERIO DE ORDENAMIENTO

        // SI YO VENGO ANTES QUE LA OTRA, RETORNO NGATIVO
        // SI YO VENGO DESPUES QUE LA OTRA, RETORNO POSITIVO
        // SI SON IGUALES, RETORNO 0

        return this.getDni() - otra.getDni();

        // Si fuera inverso el ordenamiento, se haria de la siguiente manera
        // return otra.getDni() - this.getDni(); YA QUE EL MENOR DNI DEBE IR PRIMERO
        // CUANDO DAMOS LA VUELTA LA RESTA, SE DAN VUELTA LOS SIGNOS Y POR ESO SE INVIERTE EL ORDEN
    }
         */

    /*

    // ORDENAR POR APELLIDO
    @Override
    public int compareTo(Persona otra) {
        // Como no se pueden restar dos cadenas, podemos aprovechar que la clase string ya implementa comparable
        // por ende delgamos aplicando el metodo compareTo de la clase String
        return this.getApellido().compareTo(otra.getApellido()); // Compara de forma ascendente
        // return otra.getApellido().compareTo(this.getApellido()); // Compara de forma descendente
        // esto ya que el metodo compareTo de la clase String devuelve un entero negativo si this es menor que otra, 0 si son iguales y positivo si this es mayor que otra

    }

     */

    /*

    // Ordenar por altura en metros double (decimales
    @Override
    public int compareTo(Persona otra) {
        int retorno = 0;

        if (this.getAltura() > otra.getAltura()) {
            retorno = 1;
        } else if (this.getAltura() < otra.getAltura()) {
            retorno = -1;
        }

        return retorno; // Compara de forma ascendente

        // De forma descendente hay que dar vuelta los elementos para que el menor quede primero
    }
         */

    // ORDENAR POR ENUM
    @Override
    public int compareTo(Persona otra) {
        // POR ORDEN DE APARICION EN EL ENUM
        //return this.estadoCivil.ordinal() - otra.estadoCivil.ordinal(); // el ordinal devuelve el orden de aparicion en el enum, es decir, el primer elemento tiene ordinal 0, el segundo 1, etc
        // Si fuera inverso el ordenamiento, se haria de la siguiente manera
        // return otra.estadoCivil.ordinal() - this.estadoCivil.ordinal(); // YA QUE EL MENOR DNI DEBE IR PRIMERO

        // POR ORDEN ALFABETICO
        return this.estadoCivil.name().compareTo(otra.estadoCivil.name()); // Compara de forma ascendente
        // return otra.estadoCivil.name().compareTo(this.estadoCivil.name()); // Compara de forma descendente

    }
}
