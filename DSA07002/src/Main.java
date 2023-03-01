import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            n--;
            String s = scanner.next();
            switch (s) {
                case "PUSH":
                    int temp = scanner.nextInt();
                    stack.push(temp);
                    break;
                case "POP":
                    if (stack.empty() == false) {
                        stack.pop();
                    }
                    break;
                case "PRINT":
                    if (stack.empty()) {
                        System.out.println("NONE");
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
            }
        }
        scanner.close();
    }
}
