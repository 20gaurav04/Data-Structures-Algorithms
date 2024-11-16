package Questions;
import java.util.*;

public class PowerOfKSizeSubArrays {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 3, 2, 5};
            int k = 3;
            int[] results = resultsArray(nums, k);
            System.out.println(Arrays.toString(results));
        }

    static int[] resultsArray(int[] nums, int k) {
        ArrayList<Integer> resList = new ArrayList<>();
        int left = 0;
        int consecCnt = 1;

        for (int right= 0; right < nums.length; right++) {
            if (right > 0 && nums[right - 1] + 1 == nums[right]) {
                consecCnt++;
            }

            if (right- left +1> k) {
                if (nums[left] + 1 == nums[left + 1]) {
                    consecCnt--;
                }
                left++;
            }

            if (right - left + 1 == k) {
                resList.add(consecCnt == k ? nums[right] : -1);
            }
        }

        // Convert ArrayList to int[]
        int[] resArray = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            resArray[i] = resList.get(i);
        }

        return resArray;
    }
}
