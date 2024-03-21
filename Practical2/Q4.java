import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        System.out.println("Enter elements for Array 1:");
        inputArrayElements(scanner, array1);
        System.out.println("Enter elements for Array 2:");
        inputArrayElements(scanner, array2);
        System.out.print("Enter operation symbol (+, -, *): ");
        char symbol = scanner.next().charAt(0);
        int[][] result = performOperation(array1, array2, symbol);
        System.out.println("Result:");
        displayArray(result);
        scanner.close();  }
    public static void inputArrayElements(Scanner scanner, int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            } } }
    public static int[][] performOperation(int[][] array1, int[][] array2, char symbol) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (symbol) {
                    case '+':
                        result[i][j] = array1[i][j] + array2[i][j];
                        break;
                    case '-':
                        result[i][j] = array1[i][j] - array2[i][j];
                        break;
                    case '*':
                        result[i][j] = array1[i][j] * array2[i][j];
                        break;
                    default:
                        System.out.println("Invalid operation symbol!");
                        return null;
                } } }
        return result;  }
    public static void displayArray(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  } } }
