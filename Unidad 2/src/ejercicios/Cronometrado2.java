package ejercicios;

import java.util.Scanner;

public class Cronometrado2 {

    public static void main(String[] args) {

        int n;
        int f = 0;
        int a = 1;  // Anterior
        int b = 1; // Anterior del anterior
        Scanner ent = new Scanner(System.in);
        n = ent.nextInt();

        switch (n) {
            case 1:
            case 2:
                System.out.println(1);
                break;
            default:
                for (int i = 3; i <= n; i++) {
                    f = a + b;
                    b = a;
                    a = f;
                }
                System.out.println(f);
        }


    }

    public static int fibonacci(int n) {

        switch (n) {
            case 1:
            case 2:
                return 1;
            default:
                return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

}

