package simulacro;

import static simulacro.EjercicioCronometrado.*;
import static funciones.Funciones.*;
public class Test {
    public static void main(String[] args) {
        int[] vector = {4, 3, 1, 9, 1, 2, 2, 1};
        int[] posiciones = hallar(1,vector);
        imprimirVector(posiciones);
    }
}
