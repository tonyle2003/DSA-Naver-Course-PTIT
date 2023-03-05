import java.util.Scanner;
import java.util.Stack;

class Solution {

    private static Stack<String> stack = new Stack<>();
    
    public static void solve(String calculation) {
        for (int i = calculation.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(calculation.charAt(i))) {
                stack.add(calculation.charAt(i) + "");
            } else {
                String first = stack.pop();
                String second = stack.pop();
                stack.push(first + second + calculation.charAt(i));
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