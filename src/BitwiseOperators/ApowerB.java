package BitwiseOperators;

public class ApowerB {
    public static void main(String[] args) {
        int a = 3 ;
        int base = 6;
        int ans = 1;

        while(a>0)
        {
            if((a&1)==1 )
            {
                ans *=base;
            }
            base*=base;
            a>>=1;
        }
        System.out.print(ans);
    }
}
