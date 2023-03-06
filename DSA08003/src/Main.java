import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        while (n > 0) {
            n--;
            String command = scanner.next();
            int number;
            switch (command) {
                case "PUSHFRONT":
                    number = scanner.nextInt();
                    linkedList.addFirst(number);
                    break;
                case "PRINTFRONT":
                    if (linkedList.isEmpty()) {
                        System.out.println("NONE");
                    } else {
                        System.out.println(linkedList.getFirst());
                    }
                    break;       
                case "POPFRONT":
                    if (linkedList.isEmpty() == false) {
                        linkedList.pollFirst();
                    }
                    break;
                case "PUSHBACK":
                    number = scanner.nextInt();
                    linkedList.addLast(number);
                    break;
                case "PRINTBACK":
                    if (linkedList.isEmpty()) {
                        System.out.println("NONE");
                    } else {
                        System.out.println(linkedList.getLast());
                    }
                    break;
                case "POPBACK":
                    if (linkedList.isEmpty() == false) {
                        linkedList.pollLast();
                    }
                    break;
            }
        }
        scanner.close();
    }
}
