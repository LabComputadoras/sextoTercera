package ejercicios;

import java.util.Scanner;
import static ejercicios.Ejercicio27.esPar;

public class Ejercicio31 {
    public static void main(String[] args) {

        int numeroIngresado;
        int cantidadMultiplos5 = 0;
        double cantidadImpares = 0;
        int cantidadIngresados1 = 0;
        double sumaPares = 0;
        int cantidadPares = 0;
        double porcentajeImpares;
        double promedioPares;
        Scanner ent = new Scanner(System.in);

        while(cantidadMultiplos5 < 2) {

            // Ingreso el número
            System.out.println("Por favor, ingrese un número: ");
            numeroIngresado = ent.nextInt();

            // Analizando si el número es múltiplo de 5.
            if (numeroIngresado % 5 == 0) {
                cantidadMultiplos5++;
                continue;
            }

            switch (cantidadMultiplos5){
                case 0:                     // Primer grupo;
                    cantidadIngresados1++;
                    if (!esPar(numeroIngresado)) {
                        cantidadImpares++;
                    }
                   break;
                case 1:                     // Segundo grupo;
                    if (esPar(numeroIngresado)) {
                        cantidadPares++;
                        sumaPares += numeroIngresado;
                    }
                    break;
            }

        }

        porcentajeImpares = 100 * cantidadImpares / cantidadIngresados1;
        promedioPares = sumaPares / cantidadPares;

        System.out.println("El porcentaje de impares en el primer grupo es: " + porcentajeImpares);
        System.out.println("Y el promedio de pares del segundo grupo es: " + promedioPares);
    }
}
