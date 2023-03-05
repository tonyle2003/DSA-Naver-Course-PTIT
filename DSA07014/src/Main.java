import java.util.Scanner;
import java.util.Stack;

class Solution {

    private static Stack<Integer> stack = new Stack<>();

    public static void solve(String calculation) {
        
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
