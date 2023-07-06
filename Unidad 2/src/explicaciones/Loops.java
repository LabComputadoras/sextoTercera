package explicaciones;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner ent = new Scanner(System.in);

        System.out.println("Por favor, ingrese el valor de A");
        a = ent.nextInt();
        System.out.println("Por favor, ingrese el valor de B");
        b = ent.nextInt();

        while (a > b) {
            System.out.println(b);
            b++;
        }

        System.out.println("Fin del programa");
    }
}
