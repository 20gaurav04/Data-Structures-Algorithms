package BitwiseOperators;

public class XOR0toA {
    public static void main(String[] args) {
        int a = 8;
        int ans = 0;

        for(int i = 0 ; i<=5;i++)
        {
            if(i%4==0)
            {
                ans=ans;
            }
            if(i%4==1)
            {
                ans=1;
            }
            if(i%4==2)
            {
                ans+=1;
            }
            if(i%4==3)
            {
                ans=0;
            }
        }
        System.out.print(ans);
    }
}
