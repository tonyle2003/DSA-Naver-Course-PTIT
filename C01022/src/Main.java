import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            long number = scanner.nextLong();
            long sumDigits = 0;
            while (number > 0) {
                sumDigits += number % 10;
                number /= 10;
            }
            System.out.println(sumDigits);
        }
        scanner.close();
    }
}
