import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q3 {

    public static int[] eliminateDuplicates(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 3};
        int[] uniqueArray = eliminateDuplicates(array);
        
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array with Duplicates Eliminated: " + Arrays.toString(uniqueArray));
    }
}
