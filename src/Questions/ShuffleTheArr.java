package Questions;
import java.util.Arrays;

public class ShuffleTheArr {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2};
        int n =2;
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
        static int[] shuffle(int[] nums, int n) {
            int[] result = new int[2 * n]; // Array to store the shuffled result

            // Interleave the x and y parts of the array
            for (int i = 0; i < n; i++) {
                result[2 * i] = nums[i];      // Place x1, x2, ..., xn
                result[2 * i + 1] = nums[i + n];  // Place y1, y2, ..., yn
            }

            return result;
        }
    }
