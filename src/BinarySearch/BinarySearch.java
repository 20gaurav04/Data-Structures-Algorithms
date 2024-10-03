package BinarySearch;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        // Array should be sorted in ascending order
        int[] arr = {-29,-24,1, 6, 65, 86, 99, 102};
        System.out.println(Arrays.toString(arr));

        int target = -29;
        int ans = binarySearch(arr, target);
        System.out.print(ans);

//        if (ans != -1) {
//            System.out.println("Target found at index: " + ans);
//        } else {
//            System.out.println("Target not found.");
//        }
    }

//    static int inputTarget() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the searching element: ");
//        return sc.nextInt();
//    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;  // Avoids overflow

            if (target<arr[mid]) {
                end = mid -1;
            }
            else if (target>arr[mid])
            {
                start = mid + 1;
            } else {
                return mid;

            }
        }

        return -1;  // Target not found
    }

}
