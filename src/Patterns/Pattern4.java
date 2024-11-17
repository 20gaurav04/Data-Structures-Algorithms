package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int n =5;
        Pattern4(n);
    }
    static void Pattern4(int n)
    {
            for(int row=0;row<2*n;row++)
            {
                int colsInRow = row>n ? 2*n-row : row;
                for (int cols =0 ; cols<colsInRow;cols++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
