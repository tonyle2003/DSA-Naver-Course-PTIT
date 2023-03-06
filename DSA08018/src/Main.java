import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while (t > 0) {
            t--;
            int n = scanner.nextInt();
            Queue<String> queue = new LinkedList<>();
            queue.add("");
            Queue<String> result = new LinkedList<>();
            while (queue.peek().length() <= n) {
                String temp = queue.poll();
                result.add(temp);
                queue.add(temp + "6");
                queue.add(temp + "8");
            }
            result.poll();
            System.out.println(result.size());
            while (result.isEmpty() == false) {
                System.out.print(result.poll() + " ");
            }
            System.out.println();
        }
    }
}
