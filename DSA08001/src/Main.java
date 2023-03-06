import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int n = scanner.nextInt();
            LinkedList<Integer> queue = new LinkedList<>();
            while (n > 0) {
                n--;
                int command = scanner.nextInt();
                switch (command) {
                    case 1:
                        System.out.println(queue.size());
                        break;
                    case 2:
                        if (queue.isEmpty()) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                        break;
                    case 3:
                        int number = scanner.nextInt();
                        queue.add(number);
                        break;
                    case 4:
                        if (queue.isEmpty() == false) {
                            queue.poll();
                        }
                        break;
                    case 5:
                        if (queue.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            System.out.println(queue.getFirst());
                        }
                        break;
                    case 6:
                        if (queue.isEmpty()) {
                            System.out.println(-1);
                        } else {
                            System.out.println(queue.getLast());
                        }
                        break;
                }
            }
        }
        scanner.close();
    }
}
