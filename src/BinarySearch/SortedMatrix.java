package BinarySearch;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 7;
        int[] result = search(matrix, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found.");
        }
    }

    static int[] search(int[][] arr, int target) {
        int n = arr.length, m = arr[0].length;
        int lb = 0, ub = n - 1, mid;

        // Binary search on the last column
        while (lb <= ub) {
            mid = lb + (ub - lb) / 2;

            if (arr[mid][m - 1] == target) {
                return new int[]{mid, m - 1};
            } else if (arr[mid][m - 1] < target) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }

        // Binary search on the row where the target might exist
        if (lb < n) {
            int ind = binarySearch(arr[lb], target);
            if (ind != -1)
                return new int[]{lb, ind};
        }

        return new int[]{-1, -1}; // target not found
    }

    // Binary search on 1D row
    static int binarySearch(int[] row, int target) {
        int low = 0, high = row.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == target) {
                return mid;
            } else if (row[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // target not found
    }
}
