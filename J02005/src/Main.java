import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = getArray(new int[n]);
        Arrays.sort(a);
        int[] b = getArray(new int[m]);
        Arrays.sort(b);
        List<Integer> list = new LinkedList<>();
        for (int element : a) {
            list.add(element);
        }
        Set<Integer> set = new HashSet<>();
        for (int element : b) {
            if (list.contains(element)) {
                set.add(element);
            }
        }
        for (Integer element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
        scanner.close();
    }

    private static int[] getArray(int[] array) {
        for (int i = 0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
