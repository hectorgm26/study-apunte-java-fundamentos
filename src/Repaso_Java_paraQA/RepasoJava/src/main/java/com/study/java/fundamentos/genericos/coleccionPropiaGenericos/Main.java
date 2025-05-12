package com.study.java.fundamentos.genericos.coleccionPropiaGenericos;

public class Main {
    public static void main(String[] args) {

        // Ahora podemos decidir el tipo de dato que queremos usar en el generico
        Sorteador<String> sorteo = new Sorteador<>();
        // Si queremos cambiar el tipo de dato, solo cambiamos el tipo de dato en el <>

        sorteo.add("Uno");
        sorteo.add("Dos");
        sorteo.add("Tres");

        while (!sorteo.isEmpty()) {
            System.out.println("El proximo sorteado es: " + sorteo.remove());
        }


        // Sorteo de clubes
        Sorteador<Club> sorteoClubes = new Sorteador<>();

        System.out.println("Sorteador recién creado");
        retardo(1);
        System.out.println("¿Sorteador vacío? " + sorteoClubes.isEmpty());
        retardo(1);
        System.out.println("Comienza la inserción de elementos");
        retardo(1);
        sorteoClubes.add(new Club("Boca Juniors", PaisSudamericano.ARGENTINA));
        sorteoClubes.add(new Club("River Plate", PaisSudamericano.ARGENTINA));
        sorteoClubes.add(new Club("Flamengo", PaisSudamericano.BRASIL));
        sorteoClubes.add(new Club("Palmeiras", PaisSudamericano.BRASIL));
        sorteoClubes.add(new Club("Atlético Mineiro", PaisSudamericano.BRASIL));
        sorteoClubes.add(new Club("Athlético Paranaense", PaisSudamericano.BRASIL));
        sorteoClubes.add(new Club("Nacional", PaisSudamericano.URUGUAY));
        sorteoClubes.add(new Club("Peñarol", PaisSudamericano.URUGUAY));
        retardo(1);
        System.out.println("Fin de la inserción de elementos");
        retardo(1);
        System.out.println("¿Está vacío? " + sorteoClubes.isEmpty());
        retardo(1);
        System.out.println("\n*** Comienza el sorteo... ***");
        retardo(1);
        while (!sorteoClubes.isEmpty()) {
            System.out.println(sorteoClubes.remove());
            retardo(1);
        }
        System.out.println("*** Fin del sorteo ***\n");
        retardo(1);
        System.out.println("¿Sorteador vacío? " + sorteoClubes.isEmpty());
    }


    public static void retardo(int s) {
        try {
            Thread.sleep(s * 1000); //pausa de s segundos
        } catch (InterruptedException e) {
            System.out.println("Error de concurrencia" + e.getMessage());
        }
    }
}
