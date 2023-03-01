import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int n = scanner.nextInt();
            int[] array = new int[n];
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
                if (map.containsKey(array[i]) == false) {
                    map.put(array[i], 1);
                } else {
                    map.put(array[i], map.get(array[i]) + 1);
                }
            }
            for (Integer key : map.keySet()) {
                if (map.get(key) % 2 != 0) {
                    System.out.println(key);
                    break;
                }
            }
        }
        scanner.close();
    }
}
