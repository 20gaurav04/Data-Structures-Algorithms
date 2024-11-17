package Patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        Pattern3(n);
    }
    static void Pattern3(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int cols=1;cols<=row;cols++)
            {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}
