import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        while (t > 0) {
            t--;
            int n = scanner.nextInt();
            Queue<String> queue = new LinkedList<>();
            queue.add("");
            Stack<String> result = new Stack<>();
            while (queue.peek().length() <= n) {
                String temp = queue.poll();
                result.add(temp);
                queue.add(temp + "6");
                queue.add(temp + "8");
            }
            System.out.println(result.size() - 1);
            while (result.size() != 1) {
                System.out.print(result.pop() + " ");
            }
            System.out.println();
        }
    }
}
