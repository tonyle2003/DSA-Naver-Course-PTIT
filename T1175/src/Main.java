import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vertices = scanner.nextInt();
        scanner.nextLine();
        Graph graph = new Graph(vertices);
        for (int i = 1; i <= vertices; i++) {
            String s = scanner.nextLine();
            graph.addVertices(s);
        }
        scanner.close();
        graph.show();
    }
}

class Graph {

    private Vector<Vector<Integer>> adjacency;

    public Graph(int vertices) {
        adjacency = new Vector<>();
        adjacency.add(new Vector<>());
    }

    public void addVertices(String vertices) {
        adjacency.add(new Vector<Integer>());
        String[] arrayVertices = vertices.split(" ");
        for (int i = 0; i < arrayVertices.length; i++) {
            adjacency.lastElement().add(Integer.parseInt(arrayVertices[i]));
        }
    }

    public void show() {
        for (int i = 1; i < adjacency.size(); i++) {
            for (int element : adjacency.get(i)) {
                if (i < element) {
                    System.out.println(i + " " + element);
                }
            }
        }
    }
}
