package pc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("N:");
		int n = Integer.parseInt(br.readLine());

		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			a = b;
			b = c;
			c = a + b;

		}

	}

}
