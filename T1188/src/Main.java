import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int vertices = scanner.nextInt();
            int edges = scanner.nextInt();
            UndirectedGraph graph = new UndirectedGraph(vertices);
            for (int i = 1; i <= edges; i++) {
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                graph.addEdge(first, second);
            }
            System.out.println(graph.countingElement());
        }
        scanner.close();
    }
}

class UndirectedGraph {

    private Map<Integer, List<Integer>> adj;
    private boolean[] visited;

    public UndirectedGraph(int vertices) {
        adj = new HashMap<>();
        visited = new boolean[vertices + 1];
        for (int i = 1; i <= vertices; i++) {
            adj.put(i, new ArrayList<>());
            visited[i] = false;
        }
    }

    public void addEdge(int first, int second) {
        adj.get(first).add(second);
        adj.get(second).add(first);
    }

    public void depthFirstSearch(int begin) {
        visited[begin] = true;
        for (int vertice : adj.get(begin)) {
            if (visited[vertice] == false) {
                depthFirstSearch(vertice);
            }
        }
    }

    public int countingElement() {
        int count = 0;
        for (int i = 1; i <= adj.size(); i++) {
            if (visited[i] == false) {
                count++;
                depthFirstSearch(i);
            }
        }
        return count;
    }
}
