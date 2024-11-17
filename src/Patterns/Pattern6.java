package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        Pattern6(n);
    }
    static void Pattern6(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int s =0;s<n-row;s++)
            {
                System.out.print("  ");
            }
            for(int cols=row;cols>=1;cols--)
            {
                System.out.print(cols+" ");
            }
            for(int cols=2;cols<=row;cols++)
            {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
}
