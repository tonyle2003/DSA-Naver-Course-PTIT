import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    
    private static Vector<Integer> list = new Vector<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            solution(array, 0, k);
        }
        scanner.close();   
    }

    private static void solution(int[] array, int index, int k) {
        if (list.size() == k) {
            show();
            return;
        }
        for (int i = index; i < array.length; i++) {
            list.add(array[i]);
            solution(array, i + 1, k);
            list.remove(list.size() - 1);
        }
    }

    private static void show() {
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
