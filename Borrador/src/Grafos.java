import java.util.*;

public class Grafos {

	Map<Integer, List<Integer>> grafo = new HashMap<>();

	public static void main(String[] args) {

		Grafos g = new Grafos();

		g.agregarArista(1, 2);
		g.agregarArista(1, 3);
		g.agregarArista(2, 4);
		g.agregarArista(3, 4);

		g.imprimir();

		System.out.println("\nBFS:");
		g.bfs(1);

		System.out.println("\nDFS:");
		g.dfs(1);
	}

	public void agregarNodo(int nodo) {
		grafo.putIfAbsent(nodo, new ArrayList<>());
	}

	public void agregarArista(int origen, int destino) {

		agregarNodo(origen);
		agregarNodo(destino);

		grafo.get(origen).add(destino);
		grafo.get(destino).add(origen);

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

			for (Integer vecino : grafo.get(actual)) {

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

		for (Integer vecino : grafo.get(nodo)) {

			if (!visitados.contains(vecino)) {

				dfsRecursivo(vecino, visitados);

			}

		}

	}

}
