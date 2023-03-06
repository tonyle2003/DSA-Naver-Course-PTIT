import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> queue = new LinkedList<>();
        while (n > 0) {
            n--;
            String command = scanner.next();
            switch (command) {
                case "PUSH":
                    int number = scanner.nextInt();
                    queue.add(number);
                    break;
                case "POP":
                    if (queue.isEmpty() == false) {
                        queue.poll();
                    }
                    break;
                case "PRINTFRONT":
                    if (queue.isEmpty()) {
                        System.out.println("NONE");
                    } else {
                        System.out.println(queue.getFirst());
                    }
                    break;
            }
        }
        scanner.close();
    }
}