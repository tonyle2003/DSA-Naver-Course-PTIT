import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int key = scanner.nextInt();
            int[] array = new int[n + m];
            for (int i = 0; i < n + m; i++) {
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[key - 1]);
        }
        scanner.close();
    }
}