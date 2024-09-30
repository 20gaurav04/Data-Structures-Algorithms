package LinearSearch;
import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {3,4,6,24,44},
                {7,46,11,4}
        };
        int target = 46;
        int[] ans = find(arr,target);
        System.out.print(Arrays.toString(ans));
    }
    static int[] find(int[][]arr,int target)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                if(arr[row][col]==target)
                    return new int[]{row, col};
            }
        }
        return new int[]{-1,-1};
    }
}
