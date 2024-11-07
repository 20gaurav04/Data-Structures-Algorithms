package BitwiseOperators;

public class FindIthBit {
    public static void main(String[] args) {
        int  n = 8;
        int i = 0;
        int ans = bitCheck(n,i);
        System.out.println(ans);
    }
    static int bitCheck( int n , int i)
    {
        int ithBit = (n>>i)&1;
        return ithBit;
//        it will return the bit from the right hand side , suppose 1000 then 0th bit will be 0.
    }
}
