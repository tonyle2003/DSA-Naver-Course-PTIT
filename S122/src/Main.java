import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Solution {

    private static String[] arrayWords1;
    private static String[] arrayWords2;

    public static void solve(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        arrayWords1 = s1.split(" ");
        arrayWords2 = s2.split(" ");
        solveQuestion1();
        solveQuestion2();
    }

    private static void solveQuestion1() {
        Vector<String> set = new Vector<>();
        for (int i = 0; i < arrayWords1.length; i++) {
            if (set.contains(arrayWords1[i]) == false)
                {set.add(arrayWords1[i]);}
        }
        for (int i = 0; i < arrayWords2.length; i++) {
            if (set.contains(arrayWords2[i]) == false)
                {set.add(arrayWords2[i]);}
        }
        set.sort(Comparator.naturalOrder());
        for (String element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static void solveQuestion2() {
        Arrays.sort(arrayWords1, Comparator.naturalOrder());
        Arrays.sort(arrayWords2, Comparator.naturalOrder());
        List<String> list = Arrays.asList(arrayWords1);
        for (String element : arrayWords2) {
            if (list.contains(element)) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        Solution.solve(s1, s2);
        scanner.close();        
    }
}