package Sorting;
import java.util.Arrays;


public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = { 2,0,-3,5,6,1};
        int[] res = insertion(nums);
        System.out.println(Arrays.toString(res));

    }
    static int [] insertion(int [] nums)
    {
        for(int i = 0 ; i<=nums.length-2;i++)
        {
            for(int j = i+1 ; j>0;j--)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                else
                {
                    break;
                }

            }
        }
        return nums;
    }
}
