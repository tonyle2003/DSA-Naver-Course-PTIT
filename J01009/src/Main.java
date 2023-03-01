import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long result = 0;
        long temp = 1;
        for (int i = 1; i <= number; i++) {
            temp *= i;
            result += temp;
        }
        System.out.println(result);
        scanner.close();
    }
}
