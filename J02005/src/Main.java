import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = getArray(new int[n]);
        Arrays.sort(a);
        int[] b = getArray(new int[m]);
        Arrays.sort(b);

        int index1 = 0, index2 = 0;
        while (index1 != n && index2 != m) {
            if (a[index1] == b[index2]) {
                System.out.print(a[index1] + " ");
                if (index1 < n) {
                    index1++;
                }
                if (index2 < m) {
                    index2++;
                }
            } else if (a[index1] < b[index2]) {
                if (index1 < n) {
                    index1++;
                }
            } else {
                if (index2 < m) {
                    index2++;
                }
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