package ejercicios;

import java.util.Scanner;

public class Cronometrado1 {
    public static void main(String[] args) {
        int numero;
        int posibleDivisor = 1;
        int sumaDivisores = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, ingrese un número natural: ");
        numero = teclado.nextInt();

        while (posibleDivisor < numero) {

            if (numero % posibleDivisor == 0) {
                sumaDivisores += posibleDivisor;
            }

            posibleDivisor++;
        }

        if (sumaDivisores == numero) {
            System.out.println("El número ingreado es perfecto");
        } else {
            System.out.println("El número ingresado no es perfecto");
        }

    }
}
