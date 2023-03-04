import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class Graph {

    private Vector<Vector<Integer>> adjacency;
    private boolean[] visited;

    public Graph(int vertices) {
        adjacency = new Vector<>();
        visited = new boolean[vertices + 1];
        for (int i = 0; i <= vertices; i++) {
            adjacency.add(new Vector<>());
            visited[i] = false;
        }
    }

    public void add(int begin, int end) {
        adjacency.get(begin).add(end);
    }

    public void depthFirstSearchPath(int begin, int end) {
        if (depthFirstSearch(begin, end)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        Arrays.fill(visited, false);
    }

    private boolean depthFirstSearch(int begin, int end) {
        if (visited[end] == true) {
            return true;
        }
        visited[begin] = true;
        for (int element : adjacency.get(begin)) {
            if (visited[element] == false) {
                depthFirstSearch(element, end);
                if (visited[end] == true) {
                    return true;
                }
            }
        }
        return false;
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
            Graph graph = new Graph(vertices);
            for (int i = 1; i <= edges; i++) {
                int begin = scanner.nextInt();
                int end = scanner.nextInt();
                graph.add(begin, end);
                graph.add(end, begin);
                
            }
            int numberCommands = scanner.nextInt();
            while (numberCommands > 0) {
                numberCommands--;
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                graph.depthFirstSearchPath(a, b);
            }
        }
        scanner.close();
    }
}
