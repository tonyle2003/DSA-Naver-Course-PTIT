import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            Long number = scanner.nextLong();
            System.out.println((number * (number + 1)) /2);
        }
        scanner.close();
    }
}
