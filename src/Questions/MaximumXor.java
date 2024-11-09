package Questions;
import java.util.*;
//https://leetcode.com/problems/maximum-xor-for-each-query/description/?envType=daily-question&envId=2024-11-08

public class MaximumXor {

        static int[] getMaximumXor(int[] arr, int maximumBit) {
            int[] res = new int[arr.length];
            int k = (int) (Math.pow(2, maximumBit)) - 1;
            int xor = 0;

            for (int val : arr) {
                xor ^= val;
            }
            for(int i =  0 ; i<arr.length;i++)
            {
                res[i]=k^xor;
                xor^=arr[arr.length-1-i];
            }
            return res;
        }

    public static void main(String[] args) {
        int arr[] = {0,1,1,3};
        int max = 2;
        int [] res = getMaximumXor(arr,max);
        System.out.println(Arrays.toString(res));
    }
}
