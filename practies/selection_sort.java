import java.util.*;

public class selection_sort {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many element you want to add in array");
        int element = sc.nextInt();

        int[] arr = new int[element];
        for (int i = 0; i < element; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Origian Array");
        for (int i = 0; i < element; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("sorted Array");

        for (int i = 0; i < element; i++) {
            int minindex = i;
            for (int j = i + 1; j < element ; j++) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            if (minindex != i) {
                int temp=arr[minindex];
                arr[minindex]=arr[i];
                arr[i]=temp;
        }
    }
    for (int j = 0; j < element; j++) {
        System.out.print(arr[j] + " ");
    }
}
}