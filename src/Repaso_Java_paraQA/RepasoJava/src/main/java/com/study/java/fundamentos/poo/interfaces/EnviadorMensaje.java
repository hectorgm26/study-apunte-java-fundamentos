package com.study.java.fundamentos.poo.interfaces;

public interface EnviadorMensaje {

    // No es necesario poner el public y abstract en los métodos de la interfaz, ya que son public y abstract por defecto
    public abstract void enviarMensaje(String mensaje);

    // No existe la herencia multiple en java (que una clase que ya hereda de otra pueda heredar de una tercera)
    // Las interfaces son contratos que solo definen métodos abstractos y constantes publicas y estaticas. Son como clases abstractas
    // Obligan a las subclases a implementar los métodos definidos en la interfaz. Se implementan con la palabra implements
    // Son generalizaciones para heredera un tipo de comportamiento, pero sin especificar como es este, ya que cada clase lo implementa a su manera

    // SE DIFERENCIAN DE LAS CLASES ABSTRACTAS EN QUE LAS CLASES ABSTRACTAS:
    // - Pueden tener métodos concretos (no abstractos)
    // - Pueden tener atributos
    // - Pueden tener constructores
    // - Una clase solo puede heredar de una sola clase abstracta (no se puede heredar de varias clases abstractas)

    // EN CAMBIO, LAS INTERFACES:
    // - No pueden tener métodos concretos (no abstractos)
    // - No pueden tener atributos (solo constantes publicas y estaticas)
    // - No pueden tener constructores
    // - Una clase puede implementar varias interfaces (separadas por comas)


    // Como no existe herencia multiple (una sola super clase por clase),
    // se recomienda usar intefaces cuando la clase quiere heredar de otra clase y a la vez implementar un comportamiento adicional.
    // Pero si solo se quiere implementar un comportamiento adicional, se recomienda usar una interfaz en lugar de una clase abstracta.

    // Interfaz = que son capaces de hacer los objetos // Clase abstracta = como son los objetos y de que tipo son
}

