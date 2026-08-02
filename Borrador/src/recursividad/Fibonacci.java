package recursividad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("N: ");
		int n = Integer.parseInt(br.readLine());

		calcularFibonacci(n, 0, 1);

	}

	public static void calcularFibonacci(int n, int a, int b) {

		if (n == 0) {
			return;
		}

		System.out.print(a + " ");
		calcularFibonacci(n - 1, b, a + b);
		return;

	}

}
