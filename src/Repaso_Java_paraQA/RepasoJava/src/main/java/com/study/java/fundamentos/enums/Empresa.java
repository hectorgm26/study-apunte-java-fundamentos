package com.study.java.fundamentos.enums;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Persona> listaPersonas;

    public Empresa() {
        this.listaPersonas = new ArrayList<>();
    }

    public void agregarPersona(Persona p) {
        listaPersonas.add(p);
    }

    // El método no necesita recibir una lista de personas como argumento porque ya tiene acceso a ella internamente
    // ya que es un atributo de la clase Empresa
    public void mostrarPorNivel(NivelEstudio nivel) {
        for (Persona p : listaPersonas) {
            // Los enum se comparan con equals y con == tambien, pero es mejor usar equals
            if (p.getNivelEstudio().equals(nivel)) {
                System.out.println(p);
            }
        }
    }
}
