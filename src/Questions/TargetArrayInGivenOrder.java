package Questions;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TargetArrayInGivenOrder {
    public static void main(String[] args) {
        int [] nums = { 0,1,2,3,4};
        int [] index ={0,1,2,2,1};
        System.out.print(Arrays.toString(createTargetArray(nums,index)));
    }
    static int[] createTargetArray(int[] nums , int[]index)
    {
        int res [] = new int[nums.length];

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<nums.length;i++)
        {
            list.add(index[i],nums[i]);
        }
        for(int i = 0;i<list.size();i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
