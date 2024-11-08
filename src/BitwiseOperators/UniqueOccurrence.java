package BitwiseOperators;

public class UniqueOccurrence {
    public static void main(String[] args) {
        int [] arr = { 2,2,3,2,7,7,8,7,8,8};
        int res = unique(arr);
        System.out.print(res);

    }
    static int unique(int[] nums )
    {
        int [] bitCount = new int[32];
        int res=0;

        for(int val : nums)
        {
            for(int i = 0 ; i<32 ; i++)
            {
                if((val & (1<<i))!=0)
                {
                    bitCount[i]++;
                }
            }
        }
        for(int j = 0 ; j<32;j++)
        {
            if(bitCount[j]%3!=0)
            {
                res |= (1<<j);
            }
        }
        return res;
    }
}


