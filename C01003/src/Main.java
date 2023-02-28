import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for (int i = 1; i <= test; i++) {
            Long number = scanner.nextLong();
            System.out.println(number * number);
        }
        scanner.close();
    }
}
