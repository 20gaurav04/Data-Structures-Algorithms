package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        Pattern2(n);
    }
    static void Pattern2(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int cols=n-row;cols>0;cols--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
