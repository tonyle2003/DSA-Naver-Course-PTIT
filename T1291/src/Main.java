import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        while (n > 0) {
            n--;
            String s = scanner.nextLine();
            String[] element = s.split(" ");
            BigInteger a = new BigInteger(element[0]);
            BigInteger b = new BigInteger(element[2]);
            BigInteger c = new BigInteger(element[4]);
            if (a.add(b).equals(c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}