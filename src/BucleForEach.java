public class BucleForEach {

    public static void main(String[] args) {

        String[] arrayNombres3 = new String[]{"Hector", "Yanira", "Javier", "JP"};

        // Se usa para recorrer un array, y no es necesario saber el tamaño del array, ni los indices
        // Se usa tipo de dato + el nombre de la variable del foreach + : el nombre del array

        for (String valor : arrayNombres3) {
            System.out.printf("El nombre es %s%n", valor);
        }

        // ATAJO EN INTELLIJ IDEA
        // Escribe foreach y presiona tab


    }

    // CONTAR VALORES CON FOR EACH
    static int contarValores(int[] array) {
        int contador = 0;
        for (int valor : array) {
            contador++;
        }
        return contador;
    }


    // SUMAR VALORES DEL ARRAY CON FOR EACH
    static int sumarValores(int[] array) {
        int suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        return suma;
    }


    // SUMAR VALORES SOLO PARES
    static int sumarPares(int[] array) {
        int suma = 0;
        for (int valor : array) {
            if (valor % 2 == 0) {
                suma += valor;
            }
        }
        return suma;
    }

    // OBTENER EL MAYOR VALOR CON FOR EACH
    static int obtenerMayor(int[] array) {
        int mayor = Integer.MIN_VALUE;
        for (int valor : array) {
            if (valor > mayor) {
                mayor = valor;
            }
        }
        return mayor;
    }


}
