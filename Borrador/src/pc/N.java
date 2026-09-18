package pc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class N {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> a = new ArrayList<>();

		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);

		a.forEach((n) -> System.out.print(n + " "));

	}

}
