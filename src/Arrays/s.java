package Arrays;

public class s {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int res = func(arr);
        System.out.println(res);

    }
    static int func(int[] nums)
    {
        int maxSum=0;
        int currentSum = nums[0];
        for(int i = 0 ; i<nums.length-1;i++)
        {
            if(nums[i+1]<nums[i])
            {
                maxSum=0;
            }
            else
            {
                maxSum+=nums[i];
            }
        }
        return maxSum;
    }
    }
