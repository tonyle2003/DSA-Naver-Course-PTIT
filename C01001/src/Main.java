import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long number = scanner.nextLong();
        System.out.println(number * 2);
        scanner.close();
    }
}
