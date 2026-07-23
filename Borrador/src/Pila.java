import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
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
