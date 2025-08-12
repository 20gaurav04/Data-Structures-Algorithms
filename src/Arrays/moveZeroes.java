package Arrays;
import java.util.*;

public class moveZeroes {

    public static void main(String[] args) {
        int[] arr = { 1 ,2, 0 , 0 , 5 , 0 , 20 , 0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
        static  void moveZeroes(int[] nums) {
            int insertPos = 0;
            for(int n : nums)
            {
                if(n !=0)
                {
                    nums[insertPos] = n;
                    insertPos++;
                }
            }
            while(insertPos < nums.length)
            {
                nums[insertPos++] = 0;
        }
    }

}
