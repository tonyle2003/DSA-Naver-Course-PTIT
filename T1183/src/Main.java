import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class Graph {

    private Vector<Vector<Integer>> adjacency;
    private boolean[] visited;
    private Vector<Integer> path;

    public Graph(int v) {
        path = new Vector<>();
        adjacency  = new Vector<>();
        visited = new boolean[v + 1];
        for (int i = 0; i <= v; i++) {
            adjacency .add(new Vector<>());
            visited[i] = false;
        }
    }

    public void add(int first, int second) {
        adjacency .get(first).add(second);
    }

    public void depthFirstSearchPath(int begin, int end) {
        if (depthFirstSearch(begin, end) == false) {
            System.out.print(-1);
        } else {
            depthFirstSearch(begin, end);
            for (Integer element : path) {
                System.out.print(element + " ");
            }
            Arrays.fill(visited, false);
        }
    }

    private boolean depthFirstSearch(int begin, int end) {
        if (visited[end] == true) {
            return true;
        }
        visited[begin] = true;
        path.add(begin);
        for (Integer element : adjacency .get(begin)) {
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

            int v = scanner.nextInt();
            int e = scanner.nextInt();
            int begin = scanner.nextInt();
            int end = scanner.nextInt();

            Graph myGraph = new Graph(v);

            for (int i = 1; i <= e; i++) {
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                myGraph.add(first, second);
                myGraph.add(second, first);
            }
            myGraph.depthFirstSearchPath(begin, end);
            System.out.println();
        }
        scanner.close();
    }
}