import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        scanner.nextLine();
        while (test > 0) {
            test--;
            String line = scanner.nextLine();
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                StringBuilder wordBuilder = new StringBuilder(words[i]);
                wordBuilder.reverse();
                System.out.print(wordBuilder + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
