package explicaciones;

import java.util.Scanner;
public class Teclado {
    public static void main(String[] args) {

        int numero;
        Scanner ent = new Scanner(System.in);  // Declaración y definición de un objeto Scanner.

        System.out.println("Por favor, ingrese un número entero: ");
        numero = ent.nextInt();                 // En la variable numero estamos guardando lo que se ingresa por teclado.
        System.out.println("El número ingresado fue: " + numero);
    }
}
