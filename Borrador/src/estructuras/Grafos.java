package estructuras;

import java.util.*;

public class Grafos {

	class Arista {
		int destino;
		int peso;

		public Arista(int destino, int peso) {
			this.destino = destino;
			this.peso = peso;
		}

		@Override
		public String toString() {
			return "(" + destino + ", peso=" + peso + ")";
		}

	}

	Map<Integer, List<Arista>> grafo = new HashMap<>();

	public static void main(String[] args) {

		Grafos g = new Grafos();

		g.agregarArista(1, 2, 10);
		g.agregarArista(1, 3, 10);
		g.agregarArista(2, 4, 10);
		g.agregarArista(3, 4, 10);

		g.imprimir();

		System.out.println("\nBFS:");
		g.bfs(1);

		System.out.println("\nDFS:");
		g.dfs(1);

		System.out.println("\nDijkstra:");
		g.dijkstra(1);
	}

	public void agregarNodo(int nodo) {
		grafo.putIfAbsent(nodo, new ArrayList<>());
	}

	public void agregarArista(int origen, int destino, int peso) {

		agregarNodo(origen);
		agregarNodo(destino);

		grafo.get(origen).add(new Arista(destino, peso));
//		grafo.get(destino).add(new Arista(origen, peso)); // GRAFO NO DIRIGIDO 
	}

	public void imprimir() {
		for (Integer nodo : grafo.keySet()) {
			System.out.println(nodo + " -> " + grafo.get(nodo));
		}
	}

	public void bfs(int inicio) {

		Queue<Integer> cola = new LinkedList<>();
		Set<Integer> visitados = new HashSet<>();

		cola.offer(inicio);
		visitados.add(inicio);

		while (!cola.isEmpty()) {

			int actual = cola.poll();

			System.out.print(actual + " ");

			for (Arista arista : grafo.get(actual)) {

				int vecino = arista.destino;

				if (!visitados.contains(vecino)) {
					visitados.add(vecino);
					cola.offer(vecino);
				}
			}

		}

		System.out.println();
	}

	public void dfs(int inicio) {

		Set<Integer> visitados = new HashSet<>();

		dfsRecursivo(inicio, visitados);

		System.out.println();
	}

	private void dfsRecursivo(int nodo, Set<Integer> visitados) {

		visitados.add(nodo);

		System.out.print(nodo + " ");

		for (Arista arista : grafo.get(nodo)) {

			int vecino = arista.destino;

			if (!visitados.contains(vecino)) {
				dfsRecursivo(vecino, visitados);
			}
		}

	}

	public void dijkstra(int inicio) {

		Map<Integer, Integer> distancia = new HashMap<>();

		for (Integer nodo : grafo.keySet()) {
			distancia.put(nodo, Integer.MAX_VALUE);
		}

		distancia.put(inicio, 0);

		PriorityQueue<int[]> cola = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

		cola.offer(new int[] { inicio, 0 });

		while (!cola.isEmpty()) {

			int[] actual = cola.poll();

			int nodoActual = actual[0];
			int distanciaActual = actual[1];

			if (distanciaActual > distancia.get(nodoActual))
				continue;

			for (Arista arista : grafo.get(nodoActual)) {

				int vecino = arista.destino;
				int nuevaDistancia = distanciaActual + arista.peso;

				if (nuevaDistancia < distancia.get(vecino)) {

					distancia.put(vecino, nuevaDistancia);
					cola.offer(new int[] { vecino, nuevaDistancia });

				}
			}
		}

		System.out.println(distancia);
	}

}
