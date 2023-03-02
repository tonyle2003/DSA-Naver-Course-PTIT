import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            long number = scanner.nextLong();
            if (isPrime(number)) {
                System.out.println(number);
            } else {
                long result = 0;
                for (long i = 2; i <= (long) Math.sqrt(number); i++) {
                    if (number % i == 0 && i > result && isPrime(i)) {
                        result = i;
                    }
                    if (number % i == 0 && isPrime(number / i) && number / i > result) {
                        result = number / i;
                    }
                }
                System.out.println(result);
            }

        }
        scanner.close();
    }

    private static boolean isPrime(long number) {
        if (number < 2) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        for (long i = 2; i <= (long) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
