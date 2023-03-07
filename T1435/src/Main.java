import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] array = new int[k];
            initialize(array);
            do {
                show(array);
                System.out.print(" ");
            } while (generate(array, n) == false);
            System.out.println();
        }
        scanner.close();
    }

    private static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    private static void initialize(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }

    private static boolean generate(int[] array, int n) {
        int index = array.length - 1;
        while (index >= 0 && array[index] == n - array.length + index + 1) {
            index--;
        }
        if (index < 0) {
            return true;
        } else {
            array[index]++;
            for (int i = index + 1; i < array.length; i++) {
                array[i] = array[i - 1] + 1;
            }
            return false;
        }
    }
}
