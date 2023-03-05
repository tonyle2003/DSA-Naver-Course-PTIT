import java.util.Scanner;
import java.util.Stack;

class Solution {

    private static Stack<Integer> stack = new Stack<>();

    public static void solve(String calculation) {
        for (int i = 0; i < calculation.length(); i++) {
            if (Character.isDigit(calculation.charAt(i))) {
                stack.add(Integer.parseInt(calculation.charAt(i) + ""));
            } else {
                int second = stack.pop();
                int first = stack.pop();
                switch (calculation.charAt(i)) {
                    case '+':
                        stack.add(first + second);
                        break;
                    case '-':
                        stack.add(first - second);
                        break;
                    case '*':
                        stack.add(first * second);
                        break;
                    case '/':
                        stack.add(first / second);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            String calculation = scanner.next();
            Solution.solve(calculation);
        }
        scanner.close();
    }
}
