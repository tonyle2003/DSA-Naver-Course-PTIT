import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int n = scanner.nextInt();
            int[] a = getInput(new int[n]);
            int[] b = getInput(new int[n - 1]);
            boolean flag = false;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] != b[i]) {
                    System.out.println(i + 1);
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println(n);
            }
        }
    }

    private static int[] getInput(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}