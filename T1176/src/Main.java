import java.util.Scanner;
import java.util.Vector;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Graph graph = new Graph(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int data = scanner.nextInt();
                if (data == 1) {
                    graph.add(i + 1, j + 1);
                }
            }
        }
        graph.show();
        scanner.close();
        
    }
}

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

    public void show() {
        for (int i = 1; i < adjacency.size(); i++) {
            for (int element : adjacency.get(i)) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
