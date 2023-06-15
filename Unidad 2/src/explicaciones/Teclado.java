package explicaciones;

import java.util.Scanner;
public class Teclado {
    public static void main(String[] args) {

        int edad;
        float altura;
        String nombre;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, ingrese su altura");
        altura = teclado.nextFloat();
        System.out.println("Por favor, ingrese la edad:");
        edad = teclado.nextInt();
        System.out.println("Por favor, ingrese su nombre");
        teclado.nextLine();                                         // Purgar el tecladoer.
        nombre = teclado.nextLine();

        System.out.println("Usted se llama " + nombre + ", tiene " + edad + " y  mide " + altura);

    }
}
