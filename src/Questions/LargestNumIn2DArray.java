package Questions;
import java.util.Scanner;
import java.util.Arrays;

public class LargestNumIn2DArray {
    public static void main(String[] args) {
        int [][] arr = new int [3][];  // Define a 2D array with variable column sizes
        arr[0] = new int[2];           // First row has 2 columns
        arr[1] = new int[3];           // Second row has 3 columns
        arr[2] = new int[4];           // Third row has 4 columns

        Input(arr);
        int Max = Largest(arr);
        System.out.println("Max: " + Max);
        printColumnWise(arr);
    }

    static void Input(int [][] arr) {
        Scanner sc = new Scanner(System.in);
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter val for arr[" + row + "][" + col + "]: ");
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));  // Print the array for debugging
    }

    static int Largest(int [][] arr) {
        int max = arr[0][0];  // Initialize max with the first element of the array

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];  // Update max if current element is larger
                }
            }
        }
        return max;
    }

    // Method to print the matrix column-wise in one row
    static void printColumnWise(int [][] arr) {
        System.out.println("Matrix printed column-wise (all in one row):");

        // Find the maximum number of columns in any row
        int maxCols = 0;
        for (int[] row : arr) {
            if (row.length > maxCols) {
                maxCols = row.length;
            }
        }

        // Iterate over columns first
        for (int col = 0; col < maxCols; col++) {
            for (int row = 0; row < arr.length; row++) {
                // Only print the element if the current row has this column
                if (col < arr[row].length) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
        System.out.println();  // Move to the next line after printing all elements
    }
}
