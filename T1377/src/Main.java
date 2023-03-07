import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            String calculation = scanner.next();
            Stack<String> stack = new Stack<>();
            for (int i = 0; i < calculation.length(); i++) {
                if (Character.isAlphabetic(calculation.charAt(i))) {
                    stack.push(calculation.charAt(i) + "");
                } else {
                    String second = stack.pop();
                    String first = stack.pop();
                    stack.push('(' + first + calculation.charAt(i) + second + ')');
                }
            }
            System.out.println(stack.pop());
        }
        scanner.close();
    }
}
