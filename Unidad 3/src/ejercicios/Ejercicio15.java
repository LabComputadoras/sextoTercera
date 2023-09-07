package ejercicios;

import static funciones.Funciones.*;
public class Ejercicio15 {
    public static void main(String[] args) {

        int[] vector;
        int sumaPares = 0;
        int sumaImpares = 0;
        int mayorPar = 0;
        int mayorImpar = 0;
        int dimesion = 10;
        int minAleatorio = 1;
        int maxAleatorio = 10;

        vector = vectorAleatorio(dimesion,minAleatorio,maxAleatorio);
        imprimirVector(vector);
        for (int i = 0; i < dimesion; i++) {

            if (esPar(vector[i])) {
                sumaPares += vector[i];
                if (vector[i] > mayorPar) {
                    mayorPar = vector[i];
                }
            } else {
                sumaImpares += vector[i];
                if (vector[i] > mayorImpar) {
                    mayorImpar = vector[i];
                }
            }

        }

        System.out.println("La suma de los pares es " + sumaPares);
        System.out.println("La suma de los impares es " + sumaImpares);
        System.out.println("El mayor par es " + mayorPar);
        System.out.println("El mayor impar es " + mayorImpar);

    }

}
