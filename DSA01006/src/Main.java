import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while (test > 0) {
            test--;
            int n = scanner.nextInt();
            int[] array = initialize(new int[n]);
            reversePermutaion(array);
        }
        scanner.close();
    }

    private static void reverseArray(int[] array, int begin, int end) {
        while (begin < end) {
            swapElement(array, begin, end);
            begin++;
            end--;
        }
    }

    private static void swapElement(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private static boolean nextPermutation(int[] array, Vector<String> myVector) {
        int last = array.length - 2;
        while (last >= 0 && array[last] > array[last + 1]) {
            last--;
        }
        if (last == -1) {
            return false;
        } else {
            int nextGreater = array.length - 1;
            while (array[last] > array[nextGreater]) {
                nextGreater--;
            }
            swapElement(array, last, nextGreater);
            reverseArray(array, last + 1, array.length - 1);
            return true;
        }
    }
    
    private static String arrayString(int[] array) {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }
        return s;
    }
    
    private static void reversePermutaion(int[] array) {
        Vector<String> myVector = new Vector<>();
        
        do {
            myVector.add(arrayString(array));
        } while (nextPermutation(array, myVector) == true);

        myVector.sort(Comparator.reverseOrder());
        
        for (String element : myVector) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    private static int[] initialize(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array; 
    }
}