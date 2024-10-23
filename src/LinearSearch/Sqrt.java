package LinearSearch;

public class Sqrt {
    public static void main(String[] args) {
        int x = 10  ;
        System.out.println(sqrt(x)) ;
    }
    static int sqrt(int x)
    {
        long start =1;
        long end = x;
        int ans=0;
        while(start<=end)
        {
            long mid = start+(end-start)/2;

            if(mid*mid==x)
            {
                ans=(int)mid;
                break;
            }
            else if(mid*mid<x)
            {
                start=mid+1;
                ans = (int)mid;
            }
            else{
                end = mid-1;
            }
        }
        return (int)ans;
    }
}
