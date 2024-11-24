package Recursion;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3};
        int target = 7;
        System.out.println(RBS(arr, target, 0, arr.length - 1));
    }

    static int RBS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1; // Base case: target not found
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m; // Target found, return index
        }

        // Check if the left half is sorted
        if (arr[s] <= arr[m]) {
            // Check if target lies within the left half
            if (target >= arr[s] && target <= arr[m]) {
                return RBS(arr, target, s, m - 1);
            } else {
                return RBS(arr, target, m + 1, e);
            }
        }

        // Otherwise, the right half must be sorted
        if (target >= arr[m] && target <= arr[e]) {
            return RBS(arr, target, m + 1, e);
        }

        return RBS(arr, target, s, m - 1);
    }
}
