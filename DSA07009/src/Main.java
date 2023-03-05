import java.util.Scanner;
import java.util.Stack;

class Solution {

    private Stack<String> stack;

    public Solution() {
        stack = new Stack<>();
    }

    public void solve(String calculation) {
        for (int i = calculation.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(calculation.charAt(i))) {
                stack.add(calculation.charAt(i) + "");
            } else {
                String first = stack.pop();
                String second = stack.pop();
                stack.add("(" + first + calculation.charAt(i) + second + ")");
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
            Solution solution = new Solution();
            solution.solve(calculation);
        }
        scanner.close();
    }
}
