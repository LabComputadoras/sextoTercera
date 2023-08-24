package explicaciones;

import java.util.Scanner;
import static funciones.Funciones.*;

public class Vectores {
    public static void main(String[] args) {
        int[] numeros;          // Declaración de un vector.
        numeros = new int[5];   // Definimos la longitud del arreglo.
        Scanner ent = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ent.nextInt();
        }

        System.out.println("El vector ingresado es:");

        imprimirVector(numeros);


    }
}
