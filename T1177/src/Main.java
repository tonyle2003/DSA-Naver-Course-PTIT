import java.util.Scanner;
import java.util.Vector;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertices = scanner.nextInt();
        scanner.nextLine();
        Graph graph = new Graph(vertices);
        for (int i = 1; i <= vertices; i++) {
            String listVertices = scanner.nextLine();
            graph.add(listVertices);
        }
        graph.show();
        scanner.close();
    }
}

class Graph {
    
    private Vector<Vector<Integer>> adjacency;

    public Graph(int vertices) {
        adjacency = new Vector<>();
        adjacency.add(new Vector<>());
    }

    public void add(String vertices) {
        adjacency.add(new Vector<>());
        String[] arrayVertices = vertices.split(" ");
        for (int i = 0; i < arrayVertices.length; i++) {
            adjacency.lastElement().add(Integer.parseInt(arrayVertices[i]));
        }
    }

    public void show() {
        for (int i = 1; i < adjacency.size(); i++) {
            for (int j = 1; j < adjacency.size(); j++) {
                if (adjacency.get(i).contains(j)) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        adjacency.remove(0);
    }
}
