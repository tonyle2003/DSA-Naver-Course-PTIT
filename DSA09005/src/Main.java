import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;

class Graph {

    private Vector<Vector<Integer>> adjacency;
    private boolean[] visited;

    public Graph(int v) {
        adjacency = new Vector<>(v + 1);
        visited = new boolean[v + 1];
        for (int i = 0; i <= v; i++) {
            adjacency.add(new Vector<>());
            visited[i] = false;
        }
    }

    public void add(int first, int second) {
        adjacency.get(first).add(second);
    }

    public void breadthFirstSearchPath(int begin) {
        breadthFirstSearch(begin);
        Arrays.fill(visited, false);
    }

    private void breadthFirstSearch(int begin) {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.add(begin);
        visited[begin] = true;
        while (queue.isEmpty() == false) {
            int peek = queue.poll();
            System.out.print(peek + " ");
            for (Integer element : adjacency.get(peek)) {
                if (visited[element] == false) {
                    queue.add(element);
                    visited[element] = true;
                }
            }
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int vertices = scanner.nextInt();
            int edges = scanner.nextInt();
            int begin = scanner.nextInt();
            Graph graph = new Graph(vertices);
            for (int i = 1; i <= edges; i++) {
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                graph.add(first, second);
                graph.add(second, first);
            }
            graph.breadthFirstSearchPath(begin);
        }
        scanner.close();
    }
}
