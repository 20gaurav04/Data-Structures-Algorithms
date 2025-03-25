package BackTracking;
import java.io.*;
import java.util.*;

class RateInTheMaze {

    static boolean issafe(int[][] ar, int row, int col, int n, int m) {
        return (row >= 0 && row < n && col >= 0 && col < m && ar[row][col] == 1);
    }

    static boolean check(int[][] ar, int[][] res, int row, int col, int n, int m) {
        if (row == n - 1 && col == m - 1) {
            res[row][col] = 1;
            return true;
        }
        if (issafe(ar, row, col, n, m)) {
            res[row][col] = 1;

            // Move down
            if (check(ar, res, row + 1, col, n, m)) return true;
            // Move right
            if (check(ar, res, row, col + 1, n, m)) return true;

            // Backtrack
            res[row][col] = 0;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[][] res = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        if (!check(arr, res, 0, 0, n, m)) {
            System.out.print(-1);
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {  // Fixed loop condition
                    System.out.print(res[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}