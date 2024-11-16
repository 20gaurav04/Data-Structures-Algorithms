package Questions;
import java.sql.SQLOutput;
import java.util.*;

public class ShortestSubArrayToMakeSortedArray {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1 };
        int ans  = minLengthSubarrayToRemove(arr);
        System.out.println(ans);
    }
    static int minLengthSubarrayToRemove(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        // Find the longest non-decreasing prefix
        while (start< n - 1 && nums[start] <= nums[start + 1]) {
            start++;
        }
        // If the entire array is already sorted, no need to remove anything
        if (start == n - 1) {
            return 0;
        }

        // Find the longest non-decreasing suffix
        while (end> 0 && nums[end - 1] <= nums[end]) {
            end--;
        }

        // Calculate minimum subarray to remove
        int result = Math.min(n - start - 1, end); // Removing either the left or right part

        // Try to merge the sorted prefix and suffix by removing the middle part
        int i = 0, j = end;
        while (i <= start&& j < n) {
            if (nums[i] <= nums[j]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}