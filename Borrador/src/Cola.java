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

public class Cola {

	public static void main(String[] args) throws IOException {

		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.poll();
		System.out.println(q);

		PriorityQueue<Integer> c = new PriorityQueue<>(); // MInHeap
		c.offer(1);
		c.offer(2);
		c.offer(3);
		c.offer(4);
		c.offer(5);
		c.poll();
		System.out.println(c);

	}

}
