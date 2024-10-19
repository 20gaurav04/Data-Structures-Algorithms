package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int  n=5;
        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print space
            for (j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            // inner loop to print star
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // print new line for each row
            System.out.println();
        }
    }
}
