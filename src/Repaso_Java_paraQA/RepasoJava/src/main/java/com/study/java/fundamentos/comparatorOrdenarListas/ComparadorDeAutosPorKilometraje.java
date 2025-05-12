package com.study.java.fundamentos.comparatorOrdenarListas;

import java.util.Comparator;

// Para ser un comparator se debe implementar la interfaz Comparator

// Si fuera ComparadorDeEnteros implements Comparator<Integer>
// Si fuera ComparadorDeCadenas, se deberia implementar la interfaz Comparator<String>
// Si fuera ComparadorDeAutosPorKilometraje, se deberia implementar la interfaz Comparator<Auto>
public class ComparadorDeAutosPorKilometraje implements Comparator<Auto> {

    private int multiplicador;

    public ComparadorDeAutosPorKilometraje(boolean ascendente) {
        if (ascendente)
            multiplicador = 1; // ESTO LO QUE HACE ES QUE SI EL VALOR DE LA VARIABLE ascendente ES TRUE, SE ORDENA DE MENOR A MAYOR
        else
            multiplicador = -1; // ESTO LO QUE HACE ES QUE SI EL VALOR DE LA VARIABLE ascendente ES FALSE, SE ORDENA DE MAYOR A MENOR
    }

    //@Override
    // Se reciben por parametro dos objetos de tipo Integer que se quieren comparar
    // Si el primer objeto es menor que el segundo, se retorna un numero negativo
    // Si el primer objeto es mayor que el segundo, se retorna un numero positivo
    // Si son iguales, se retorna 0
    //public int compare(Integer o1, Integer o2) {
    //  return o1 - o2; // ordena de menor a mayor
    // return o2 - o1; // ordena de mayor a menor
    //}

    // Comparar cadenas
    // public int compare(String o1, String o2) {
    //     return o1.compareTo(o2); // ordena de menor a mayor
    //     // return o2.compareTo(o1); // ordena de mayor a menor


    @Override
    public int compare(Auto o1, Auto o2) {
        return multiplicador * (o1.getKilometraje() - o2.getKilometraje()); // ordena de menor a mayor
        // Esto lo que hace es multiplicar el resultado de la resta por el multiplicador,
        // si es 1, se sigue ordenando de menor a mayor, ya que no se hace nada
        // pero si es -1, se obtendra el mismo valor pero con el signo cambiado, es decir, se ordenara de mayor a menor
    }


    // Comparar auto por kilometraje
    // public int compare(Auto o1, Auto o2) {
    //     return o1.getKilometraje() - o2.getKilometraje(); // ordena de menor a mayor
    //     // return o2.getKilometraje() - o1.getKilometraje(); // ordena de mayor a menor
    // }

    // Comparar auto por patente
    // public int compare(Auto o1, Auto o2) {
    //     return o1.getPatente().compareTo(o2.getPatente()); // ordena de menor a mayor
    //     // return o2.getPatente().compareTo(o1.getPatente()); // ordena de mayor a menor
    // ES POSIBLE PORQUE LA PATENTE ES UN STRING

}
