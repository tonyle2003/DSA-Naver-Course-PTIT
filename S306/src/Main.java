import java.util.Scanner;
import java.util.Vector;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertices = scanner.nextInt();
        int edges = scanner.nextInt();
        Graph graph = new Graph(vertices);
        for (int i = 1; i <= edges; i++) {
            int begin = scanner.nextInt();
            int end = scanner.nextInt();
            graph.add(begin, end);
            graph.add(end, begin);
        }
        graph.showNotAdjacent();
        scanner.close();
    }
}

class Graph {

    private Vector<Vector<Integer>> adjacency;
    private boolean[] visited;

    public Graph(int vertices) {
        adjacency = new Vector<>();
        visited =  new boolean[vertices + 1];
        for (int i = 0; i <= vertices; i++) {
            adjacency.add(new Vector<>());
            visited[i] = false;
        }
    }

    public void add(int begin, int end) {
        adjacency.get(begin).add(end);
    }

    private void depthFirstSearch(int begin) {
        visited[begin] = true;
        for (int element : adjacency.get(begin)) {
            if (visited[element] == false) {
                depthFirstSearch(element);
            }
        }
    }

    public void showNotAdjacent() {
        depthFirstSearch(1);
        boolean flag = false;
        for (int i = 1; i < visited.length; i++) {
            if (visited[i] == false) {
                flag = true;
                System.out.println(i);
            }
        }
        if (flag == false) {
            System.out.println(0);
        }
    }
}
