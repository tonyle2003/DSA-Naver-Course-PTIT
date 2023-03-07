import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        do {
            show(array);
        } while (generate(array) == false);
        scanner.close();
    }

    private static boolean generate(int[] array) {
        int last = array.length - 2;
        while (last >= 0 && array[last] > array[last + 1]) {
            last--;
        }
        if (last < 0) {
            return true;
        } else {
            int nextGreater = array.length - 1;
            while (array[last] > array[nextGreater]) {
                nextGreater--;
            }
            swap(array, last, nextGreater);
            reverse(array, last + 1, array.length - 1);
            return false;
        }
    }

    private static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverse(int[] array, int begin, int end) {
        while (begin < end) {
            swap(array, begin, end);
            begin++;
            end--;
        }
    }
}