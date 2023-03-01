import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(gcd(num1, num2));
        }
        scanner.close();
    }

    private static int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
