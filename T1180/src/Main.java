import java.util.Scanner;
import java.util.Vector;

class Graph {

    private Vector<Vector<Integer>> adjacency;
    private boolean[] visited;

    public Graph(int vertices) {
        adjacency = new Vector<>();
        visited = new boolean[vertices + 1];
        for (int i = 0; i < vertices + 1; i++) {
            adjacency.add(new Vector<>());
            visited[i] = false;
        }
    }

    public void addEdge(int begin, int end) {
        adjacency.get(begin).add(end);
    }

    public void depthFirstSearch(int begin) {
        visited[begin] = true;
        System.out.print(begin + " ");
        for (int element : adjacency.get(begin)) {
            if (visited[element] == false) {
                depthFirstSearch(element);
            }
        }
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
                graph.addEdge(first, second);
            }

            graph.depthFirstSearch(begin);
            System.out.println();
        }
        scanner.close();
    }
}
