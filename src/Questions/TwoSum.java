package Questions;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = { 2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int [] twoSum(int arr[] , int target)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            int sum = arr[start]+arr[end];

            if(sum==target)
            {
                return new int[]{start+1,end-1};
            }
            else if(arr[start]+arr[end]<target)
            {
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }

}
