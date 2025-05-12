package com.study.java.fundamentos.poo.interfaces.herenciaInterfaces;


public interface VehiculoRecargable extends Recargable, Vehiculo {

    // Con una sola interfaz que extiende a otras dos, no es necesario implementar las dos interfaces
    // ya que la interfaz VehiculoRecargable hereda de las dos interfaces
    
    // Por eso creamos una nueva interfaz que extiende a las dos interfaces, asi no tenemos que repetir el código
}
