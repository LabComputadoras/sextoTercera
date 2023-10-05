package simulacro;

public class EjercicioCronometrado {

    public static int[] hallar(int valor, int[] vector) {

        int[] posiciones;
        int veces = 0;

        // Contamos cuantas veces se repite el valor en el vector.
        for (int i = 0; i < vector.length ; i++) {
            if (vector[i] == valor)
                veces++;
        }

        posiciones = new int[veces];

        for (int i = 0, j = 0; i < vector.length; i++) {
            if (vector[i] == valor) {
                posiciones[j] = i;
                j++;
            }
        }

        return posiciones;
    }

}
