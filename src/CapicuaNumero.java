import java.util.Scanner;

public class CapicuaNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int n = ScannerManager.leerInt(scanner, "Ingrese un número para verificar si es capicua");

        final int nInvertido = invertirNumeros(n);

        final boolean esCapicua = esCapicua(n, nInvertido);

        System.out.printf("El número %d es capicua?. %b%n", n, esCapicua);

    }

    static int invertirNumeros(int n) {

        int aux = n;
        int inverso = 0;

        while (aux != 0) {
            // residuo es constante ya que no se redeclara dentro del bucle
            final int residuo = aux % 10;
            inverso = inverso * 10 + residuo;
            aux = aux / 10; // lo mismo que aux /= 10;

        }
        return inverso;
    }

    static boolean esCapicua(int n, int nInvertido) {
        return n == nInvertido;
    }

}

/*
Explicacion del funcionamiento de la funcion invertirNumeros:

1) Se declara una variable auxiliar que es igual al numero ingresado
Esto porque se necesita una variable auxiliar para no modificar el numero original

2) Se declara una variable inverso que es igual a 0
Esto porque se necesita una variable para almacenar el numero invertido

3) Se inicia un bucle while que se ejecutara mientras aux sea diferente de 0
Esto porque se necesita recorrer todos los digitos del numero

4) Se declara una variable residuo que es igual al residuo de aux dividido entre 10
Esto porque al dividir un numero entre 10 se obtiene el residuo de la division
Esto es necesario porque se necesita obtener el ultimo digito del numero

5) Se actualiza la variable inverso multiplicandola por 10 y sumandole el residuo
Esto porque al multiplicar un numero por 10 se desplazan los digitos una posicion a la izquierda
Y la suma del residuo se agrega al final del numero, porque se esta invirtiendo el numero

6) Se actualiza la variable aux dividiendola entre 10
Esto porque al dividir un numero entre 10 se eliminara el ultimo digito del numero

 */
