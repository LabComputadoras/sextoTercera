package cronometrado;

public class Cronometrado {

	public static int[] fibonacciVector(int n){
		int[] vector = new int[n];

		switch (n) {
			case 1:
				return new int[]{1};
			case 2:
				return new int[]{1, 1};
			default:
				vector[0] = 1;
				vector[1] = 1;
				for (int i = 2; i < n; i++) {
					vector[i] = vector[i - 1] + vector[i - 2];
				}
				return vector;
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
