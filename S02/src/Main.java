import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            String a = scanner.next();
            String b = scanner.next();

            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);

            System.out.println(bigA.multiply(bigB).divide(bigA.gcd(bigB)));
        }
        scanner.close();
    }
}