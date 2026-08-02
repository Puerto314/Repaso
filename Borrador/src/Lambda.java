import java.io.IOException;
import java.util.ArrayList;

interface EsPar {

	boolean esPar(int n);

}

interface Sumar {

	int sumar(int a, int b);

}

public class Lambda {

	public static void main(String[] args) throws IOException {

		EsPar p = (n) -> n % 2 == 0;
		System.out.println(p.esPar(3));

		Sumar s = (a, b) -> a + b;
		System.out.println(s.sumar(5, 4));

		ArrayList<String> lista = new ArrayList<>();
		lista.add("Esteban");
		lista.add("Puerto");
		lista.add("Rojas");
		lista.forEach((n) -> System.out.println(n));
		lista.forEach(System.out::println);

	}

}
