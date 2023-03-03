import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] array = new long[n];
        Vector<Long> vector = new Vector<>();

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
            array[i] %= 1e9 + 7;
            vector.add(array[i]);
        }
        scanner.close();        
        vector.sort(Comparator.reverseOrder());
        long price = 0;
        while (vector.size() != 1) {
            long a = vector.lastElement();
            a %= 1e9 + 7;
            vector.removeElementAt(vector.size() - 1);
            long b = vector.lastElement();
            b %= 1e9 + 7;
            vector.removeElementAt(vector.size() - 1);

            price %= 1e9 + 7;
            price += (a + b) % (1e9 + 7);
            price %= 1e9 + 7;
            vector.add((long) ((a + b) % (1e9 + 7)));
            vector.sort(Comparator.reverseOrder());
        }
        System.out.println((long) (price % (1e9 + 7)));
    }
