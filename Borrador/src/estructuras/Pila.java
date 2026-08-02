package estructuras;

import java.io.IOException;
import java.util.Stack;

public class Pila {

	public static void main(String[] args) throws IOException {

		Stack<Integer> p = new Stack<>();

		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);

		p.pop();

		System.out.println(p);

	}

}
