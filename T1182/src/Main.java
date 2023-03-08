import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int vertices = scanner.nextInt();
            int edges = scanner.nextInt();
            int begin = scanner.nextInt();
            DirectedGraph graph = new DirectedGraph(vertices);
            for (int i = 1; i <= edges; i++) {
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                graph.addEdge(first, second);
            }
            graph.breadthFirstSearch(begin);
        }
        scanner.close();
    }
}

class DirectedGraph {

    private LinkedList<LinkedList<Integer>> adj;
    private boolean[] visited;

    public DirectedGraph(int vertices) {
        adj = new LinkedList<>();
        visited = new boolean[vertices + 1];
        for (int i = 0; i <= vertices; i++) {
            adj.add(new LinkedList<>());
            visited[i] = false;
        }
    }

    public void addEdge(int first, int second) {
        adj.get(first).add(second);
    }

    public void breadthFirstSearch(int begin) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(begin);
        visited[begin] = true;
        while (queue.isEmpty() == false) {
            int front = queue.poll();
            System.out.print(front + " ");
            for (int vertice : adj.get(front)) {
                if (visited[vertice] == false) {
                    queue.add(vertice);
                    visited[vertice] = true;
                }
            }
        }
        System.out.println();
    }
}
