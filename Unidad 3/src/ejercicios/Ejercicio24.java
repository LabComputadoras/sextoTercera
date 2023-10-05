package ejercicios;

import static funciones.Funciones.*;
public class Ejercicio24 {
    public static void main(String[] args) {

        int n = 7;
        int m;          // Dimensión del vector suma
        int[] vector;
        int[] suma;

        vector = vectorAleatorio(n,1,10);
        m = Math.ceilDiv(n,2);
        suma = new int[m];

        for (int i = 0; i < m; i++) {
            suma[i] = vector[i] + vector[n - 1 - i]; // vector[n - 1 - i] es recorrer el vector de atras para adelante.
        }

        imprimirVector(vector);
        System.out.println();
        imprimirVector(suma);
    }
}
