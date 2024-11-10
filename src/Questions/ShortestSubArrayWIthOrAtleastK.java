package Questions;
//https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-ii/description/?envType=daily-question&envId=2024-11-10

public class ShortestSubArrayWIthOrAtleastK {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int k = 2;
        int ans = minimumSubarrayLength(arr,k);
        System.out.println(ans);
    }
        static int minimumSubarrayLength(int[] nums, int k) {
            int[] count = new int[32];
            int start = 0, end = 0, min = Integer.MAX_VALUE;
            while(end<nums.length)
            {
                updateBits(count, nums[end], 1);
                while(start<=end && getVal(count)>=k)
                {
                    min = Math.min(min, end-start+1);
                    updateBits(count, nums[start], -1);
                    start++;
                }
                end++;
            }
            return min==Integer.MAX_VALUE ? -1 : min;
        }
        static void updateBits(int count[], int num, int val)
        {
            for(int i=0; i<32; i++)
            {
                if(((num>>i)&1)==1)
                    count[i] += val;
            }
        }
        static int getVal(int[] count)
        {
            int ans = 0;
            for(int i=0; i<32; i++)
            {
                if(count[i]>0)
                    ans = ans | (1<<i);
            }
            return ans;
        }
    }