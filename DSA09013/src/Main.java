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

    public void showBridgeEdges() {
        int before = countingElement();
        for (Vector<Integer> begin : adjacency) {
            for (int end : begin) {
                if (adjacency.indexOf(begin) < end && begin.contains(end)) {
                    begin.remove(begin.indexOf(end));
                    adjacency.get(end - 1).remove(adjacency.indexOf(begin) + 1);
                    if (countingElement() > before) {
                        System.out.print((adjacency.indexOf(begin) + 1) + " " + end + " ");
                    }
                    begin.add(end);
                    adjacency.get().add(adjacency.indexOf(begin));
                }
            }
        }
        System.out.println();
    }

    private int countingElement() {
        int count = 0;
        for (int i = 0; i < adjacency.size(); i++) {
            if (visited[i] == false) {
                depthFirstSearch(i);
                count++;
            }
        }
        Arrays.fill(visited, false);
        return count;
    }

    private void depthFirstSearch(int begin) {
        visited[begin] = true;
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
            Graph graph = new Graph(vertices);
            for (int i = 1; i <= edges; i++) {
                int begin = scanner.nextInt();
                int end = scanner.nextInt();
                graph.add(begin, end);
                graph.add(end, begin);
            }
            graph.showBridgeEdges();
        }
        scanner.close();
    }
}
