import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Long, Integer> myMap = new HashMap<>();
        while (scanner.hasNext()) {
            long number = scanner.nextInt();
            if (digitIsPrime(number)) {
                if (myMap.containsKey(number)) {
                    myMap.put(number, myMap.get(number) + 1);
                } else {
                    myMap.put(number, 1);
                }
            }
        }
        scanner.close();
        for (Long element : myMap.keySet()) {
            System.out.println(element + " " + myMap.get(element));
        }
    }

    private static boolean digitIsPrime(long number) {
        while (number != 0) {
            if (isPrime(number % 10) == false) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    private static boolean isPrime(long number) {
        if (number == 2 || number == 3 || number == 5 || number == 7) {
            return true;
        }
        return false;
    }
}