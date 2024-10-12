package Questions;
import java.util.Arrays;

public class RunningSumOfArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,4};
        System.out.print(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] nums) {
        int[] s = new int[nums.length];
        s[0]=nums[0];

        for (int i = 1; i < nums.length; i++) {
            s[i] = s[i-1] + nums[i];
        }
        return s;
    }
}
