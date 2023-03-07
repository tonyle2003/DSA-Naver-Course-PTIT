import java.util.Scanner;

public class Main {

    private static boolean flag = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int n = scanner.nextInt();
            int sum = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            sumSubArray(array, 0, sum);
            if (flag == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            flag = false;
        }
        scanner.close();
    }

    private static void sumSubArray(int[] array, int index, int sum) {
        if (sum == 0) {
            flag = true;
            return;
        }
        if (index == array.length || sum < 0) {
            return;
        }
        sum -= array[index];
        for (int i = index + 1; i < array.length; i++) {
            if (flag == false) {
                sumSubArray(array, i, sum);
            } else {
                return;
            }
        }
    }
}