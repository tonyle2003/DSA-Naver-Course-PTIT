import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            long number = scanner.nextLong();
            Set<Long> list = new HashSet<>();
            for (long i = 1; i <= (long) Math.sqrt(number); i++) {
                if (number % i == 0 && (number / i) % 2 == 0) {
                    list.add(number / i);
                }
                if (number % i == 0) {
                    if (number % (number / i) == 0 && (number / (number / i)) % 2 == 0) {
                        list.add(number / (number / i));
                    }
                }
            }
            System.out.println(list.size());
        }
        scanner.close();
    }
}
