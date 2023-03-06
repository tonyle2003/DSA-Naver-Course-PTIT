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
            Stack<String> stack = new Stack<>();
            while (queue.peek().length() <= n) {
                String temp = queue.poll();
                stack.add(temp);
                queue.add(temp + "6");
                queue.add(temp + "8");
            }
            while (stack.empty() == false) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
    }
}
