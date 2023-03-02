import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            String s = scanner.next();
            if (isDecrease(s) || isIncrease(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    private static boolean isIncrease(String number) {
        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) > number.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDecrease(String number) {
        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) < number.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}