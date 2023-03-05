import java.util.Scanner;
import java.util.Vector;

class Graph {

    private Vector<Vector<Integer>> adjacency;

    public Graph(int vertices) {
        adjacency = new Vector<>();
        for (int i = 0; i <= vertices; i++) {
            adjacency.add(new Vector<>());
        }
    }

    public void add(int begin, int end) {
        adjacency.get(begin).add(end);
    }

    public void showAdjacency() {
        for (int i = 1; i < adjacency.size(); i++) {
            System.out.print((i) + ": ");
            for (int element : adjacency.get(i)) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int begin, end;
        while (test > 0) {
            test--;
            int vertices = scanner.nextInt();
            Graph graph = new Graph(vertices);
            int edges = scanner.nextInt();
            for (int i = 1; i <= edges; i++) {
                begin = scanner.nextInt();
                end = scanner.nextInt();
                graph.add(begin, end);
                graph.add(end, begin);
            }
            graph.showAdjacency();
        }
        scanner.close();
    }
}
