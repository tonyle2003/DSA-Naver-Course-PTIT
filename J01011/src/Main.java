import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            Long a = scanner.nextLong();
            Long b = scanner.nextLong();
            Long gcd = gcd(a, b);
            System.out.println((a * b ) / gcd + " " + gcd);
        }
        scanner.close();
    }

    private static long gcd(Long a, Long b) {
        long temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}