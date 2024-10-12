        package Questions;
import java.util.Arrays;

        public class ArrayConcatenate {
            public static void main(String[] args) {
                int nums[] = {1, 2, 1};
                System.out.print(Arrays.toString(getConcatenation(nums)));

            }

                static int[] getConcatenation(int[] nums) {
                    int[] result = new int[nums.length * 2];
                    for (int i = 0; i < nums.length; i++) {
                        result[i] = nums[i];
                        result[i + nums.length] = nums[i];

                    }
                    return result;
                }
        }
