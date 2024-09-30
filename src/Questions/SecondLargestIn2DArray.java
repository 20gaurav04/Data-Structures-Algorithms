package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestIn2DArray {
    public static void main(String[] args) {
        int [][] arr = new int[3][]; // Only defining the number of rows
        inputs(arr);
        System.out.println(Arrays.deepToString(arr));
        int max = largest(arr);
        System.out.print(max);
    }

    static void inputs(int[][] arr) {
        Scanner sc = new Scanner(System.in); // Create Scanner instance once
        for (int row = 0; row < arr.length; row++) {
            System.out.print("Enter the number of columns for row " + row + ": ");
            int cols = sc.nextInt();  // Get the number of columns for the current row
            arr[row] = new int[cols]; // Initialize the row with the number of columns

            // Input elements for the current row
            for (int col = 0; col < cols; col++) {
                System.out.print("Enter element for row " + row + ", col " + col + ": ");
                arr[row][col] = sc.nextInt();
            }
        }
    }
    static int largest(int[][]arr)
    {
        return LargestNumIn2DArray.Largest(arr);
    }
}
