package ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        double promedio;
        int numeroIngresado;
        int cantidadPares = 0;
        double sumaPares = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese un número entero: ");
            numeroIngresado = teclado.nextInt();

            if (numeroIngresado % 2 == 0){
                 cantidadPares++;
                 sumaPares += numeroIngresado;
             }
        }

        promedio = sumaPares / cantidadPares;
        System.out.println("El promedio de los números pares es " + promedio);

    }
}
