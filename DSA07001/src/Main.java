import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String s;
        while (scanner.hasNext()) {
            s = scanner.next();
            switch (s) {
                case "push":
                    int temp = scanner.nextInt();
                    stack.push(temp);
                    break;
                case "show":
                    if (stack.empty()) {
                        System.out.println("empty");
                    } else {
                        for (Integer element : stack) {
                            System.out.print(element + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "pop":
                    if (stack.empty() == false) {
                        stack.pop();
                    }
                    break;
            }
        }
    }
}
