import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class Graph {

    private Vector<Vector<Integer>> graph;
    private boolean[] visited;

    public Graph(int v) {
        graph = new Vector<>();
        for (int i = 0; i <= v; i++) {
            graph.add(new Vector<>());
        }
        visited = new boolean[v + 1];
        Arrays.fill(visited, false);
    }

    public void reinitializeVisited() {
        Arrays.fill(visited, false);
    }

    public void addEdge(int first, int second) {
        graph.get(first).add(second);
    }

    public void depthFirstSearch(int begin) {
        visited[begin] = true;
        System.out.print(begin + " ");
        for (Integer element : graph.get(begin)) {
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
            int v = scanner.nextInt();
            int e = scanner.nextInt();
            int begin = scanner.nextInt();
            Graph myGraph = new Graph(v);

            for (int i = 1; i <= e; i++) {
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                myGraph.addEdge(first, second);
                myGraph.addEdge(second, first);
            }
            myGraph.depthFirstSearch(begin);
            System.out.println();
        }
        scanner.close();
    }
}
