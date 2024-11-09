package Questions;
//https://leetcode.com/problems/minimum-array-end/?envType=daily-question&envId=2024-11-09


public class MinimumArrayEnd {
    public static void main(String[] args) {
        int  n = 3;
        int  x = 5;
        System.out.println(minArrayEnd(n,x));
    }
    static long minArrayEnd(int n , int x )
    {
        long ans = 0;
        n--;
        while (n-- > 0)
        {
            ans = (ans+1)|x;
        }
        return ans;
    }
}
