import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int vertices = scanner.nextInt();
            int edges = scanner.nextInt();
            int begin = scanner.nextInt();
            int end = scanner.nextInt();
            
            Graph graph = new Graph(vertices);
            for (int i = 1; i <= edges; i++) {
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                graph.add(first, second);
                graph.add(second, first);
            }
            graph.depthFirstSearchPath(begin, end);
        }
        scanner.close();
    }
}

class Graph {

    private Vector<Vector<Integer>> adjacency;
    private boolean[] visited;
    private Deque<Integer> deque;

    public Graph(int vertices) {
        adjacency = new Vector<>();
        visited = new boolean[vertices + 1];
        deque = new LinkedList<>();
        for (int i = 0; i <= vertices; i++) {
            adjacency.add(new Vector<>());
            visited[i] = false;
        }
    }

    public void add(int begin, int end) {
        adjacency.get(begin).add(end);
    }

    public void depthFirstSearchPath(int begin, int end) {
        if (depthFirstSearch(begin, end) == true) {
            while (deque.isEmpty() == false) {
                System.out.print(deque.pollFirst() + " ");
            }
            System.out.println();
        } else {
            System.out.println(-1);
        }
        Arrays.fill(visited, false);
    }

    private boolean depthFirstSearch(int begin, int end) {
        if (visited[end] == true) {
            return true;
        }
        deque.addLast(begin);
        visited[begin] = true;
        for (int element : adjacency.get(begin)) {
            if (visited[element] == false) {
                depthFirstSearch(element, end);
                if (visited[end] ==  true) {
                    return true;
                }
            }
        }
        visited[begin] = false;
        deque.pollLast();
        return false;
    }
}