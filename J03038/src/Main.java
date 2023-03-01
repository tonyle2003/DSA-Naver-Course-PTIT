import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        String s = scanner.next();
        scanner.close();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i) + "");
        }
        System.out.println(set.size());
    }
}
