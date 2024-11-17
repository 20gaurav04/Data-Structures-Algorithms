package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n =5;
        Pattern5(n);
    }
    static void Pattern5(int n)
    {
        for(int row=0;row<2*n;row++)
        {
            int colsInRow = row>n ? 2*n-row : row;
            int noOfSpaces = n - colsInRow;
            for(int spaces = 0 ; spaces<noOfSpaces ; spaces++)
            {
                System.out.print(" ");
            }
            for (int cols =0 ; cols<colsInRow;cols++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
