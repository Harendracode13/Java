package Practical2;
import java.util.Arrays;
public class Q2{

    public static void main(String[] args) {
        int[][] array = {{3, 5, 2}, {9, 1, 4}, {7, 8, 6}};
        
        int minElement = array[0][0];
        int RowIndex = 0;
        int ColIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < minElement) {
                    minElement = array[i][j];
                    RowIndex = i;
                    ColIndex = j;
                }
            }
        }
        
        System.out.println("Minimum Element: " + minElement);
        System.out.println("Index of Minimum Element: [" + RowIndex + ", " + ColIndex + "]");
    }
}
