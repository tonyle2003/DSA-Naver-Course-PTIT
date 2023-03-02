import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        swapSort(array);
        scanner.close();
    }

    private static void swapSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int temp = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[temp] >  array[j]) {
                    int box = array[j];
                    array[j] = array[temp];
                    array[temp] = box;
                }
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
}