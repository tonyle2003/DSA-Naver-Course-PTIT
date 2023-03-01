import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = getArray(new int[n]);
        int[] b = getArray(new int[m]);

        int[] array = new int[1001];
        for (int i = 0; i < a.length; i++) {
            array[a[i]] = 1;
        }
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            if (array[b[i]] == 1) {
                System.out.print(b[i] + " ");
                array[b[i]] = 0;
            }
        }
        System.out.println();
    }

    private static int[] getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}