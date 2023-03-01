import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int number = scanner.nextInt();
            boolean flag = false;
            for (int i = 2; i <= number / 2; i++) {
                if (isPrime(i) && isPrime(number - i)) {
                    System.out.println(i + " " + (number - i));
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println(-1);
            }
        }
        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
