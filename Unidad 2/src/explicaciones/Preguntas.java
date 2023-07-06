package explicaciones;

import java.util.Scanner;

public class Preguntas {
    public static void main(String[] args) {

        int a;
        int b;
        Scanner ent = new Scanner(System.in);

        System.out.println("Por favor, ingrese el valor de A");
        a = ent.nextInt();
        System.out.println("Por favor, ingrese el valor de B");
        b = ent.nextInt();

        if (b > a) {
            System.out.println("B es mayor que A");
        } else if (b == a) {
            System.out.println("B es igual a A");
        }

        System.out.println("Fin del programa");

    }
}
