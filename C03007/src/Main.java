import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            int count = 0;
            for (int i = a; i <= b; i++) {
                if (count == 10) {
                    count = 0;
                    System.out.println();
                }
                if (isPrime(i) && isReverse(i)) {
                    System.out.print(i + " ");
                    count++;
                }
            }
            System.out.println("\n");
        }
        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isReverse(int number) {
        int box = number;
        int temp = 0;
        while (number > 0) {
            temp = temp * 10 + number % 10;
            number /= 10;
        }
        return temp == box;
    }
}
