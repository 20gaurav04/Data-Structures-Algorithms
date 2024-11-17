package Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int i = 4;
        Pattern7(i);
    }
    static void Pattern7(int n)
    {
        for(int row=1;row<=2*n;row++)
        {
            int c =  row>n ? 2*n-row:row;
            for(int s =0;s<n-c;s++)
            {
                System.out.print("  ");
            }
            for(int cols=c;cols>=1;cols--)
            {
                System.out.print(cols+" ");
            }
            for(int cols=2;cols<=c;cols++)
            {
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }
}
