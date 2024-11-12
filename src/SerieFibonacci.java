import java.util.Scanner;

public class SerieFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = ScannerManager.leerInt(scanner, "Ingrese la cantidad de numeros de la serie de fibonacci que desea ver");
        scanner.close();

        mostrarFibonacci(n);
    }

    static void mostrarFibonacci(int n) {
        // declaracion de los primeros numeros
        int anterior = 0;
        int actual = 1;

        // mostrar los 2 primeros numeros de la serie de fibonacci
        System.out.printf("%d %d ", anterior, actual);

        // mostrar el siguiente numero de la serie fibonacci
        for (int i = 0; i < n - 2; i++) {
            int temp = anterior + actual;
            anterior = actual;
            actual = temp;
            System.out.printf("%d ", actual);
        }
    }
}

/*
Explicacion del codigo:
Se pide al usuario que ingrese la cantidad de numeros de la serie de fibonacci que desea ver
Se muestra los 2 primeros numeros de la serie de fibonacci

Exolicacion del bucle for:
Se inicializa el iterador contador i en 0
Se ejecuta el bucle mientras i sea menor que n-2 (es n-2, ya que ya se mostraron los 2 primeros numeros)
En cada iteracion se calcula el siguiente numero de la serie de fibonacci, de la siguiente forma:
    Se guarda el valor de actual en una variable temporal
    Se asigna el valor de actual a anterior
    Se asigna el valor de la variable temporal a actual
    Se muestra el valor de actual
Esto debido a que la serie fibonacci se calcula sumando los 2 numeros anteriores
Y la suma se realiza en el bucle for en cada iteracion.

Explicacion de las variables:
temp: guarda el valor de la suma de los 2 numeros anteriores de la serie de fibonacci
anterior: luego de la suma, se asigna el valor de actual a anterior
actual: luego de la suma, se asigna el valor de temp a actual

 */

/* EXPLICACION CON CODIGO:

Ejemplo con n = 3

int anterior = 0;
int actual = 1;
System.out.printf("%d %d ", anterior, actual);   // imprime 0 1

Primera iteracion:
int temp = anterior + actual;  // temp = 0 + 1 = 1
anterior = actual;             // anterior = 1
actual = temp;                 // actual = 1

Segunda iteracion:
int temp = anterior + actual;  // temp = 1 + 1 = 2
anterior = actual;             // anterior = 1
actual = temp;                 // actual = 2

Tercera iteracion:
int temp = anterior + actual;  // temp = 1 + 2 = 3
anterior = actual;             // anterior = 2
actual = temp;                 // actual = 3

 */