package funciones;

public class Funciones {

    public static void imprimirVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }

    public static int enteroAleatorio(int minimo, int maximo) {

        int a = maximo + 1 - minimo;
        return (int) Math.floor(Math.random() * a + minimo);

    }

    public static int[] vectorAleatorio(int largo, int min, int max){
        int[] vectorAleatorio = new int[largo];

        for (int i = 0; i < largo; i++) {
            vectorAleatorio[i] = enteroAleatorio(min, max);
        }
        return vectorAleatorio;
    }

    public static boolean esPar(int val) {
        return val % 2 == 0;
    }
}
