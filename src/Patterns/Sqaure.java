package Patterns;

public class Sqaure {
    public static void main(String[] args) {
        int lines = 4;
        squarePattern(lines);
    }
    static void squarePattern(int n)
    {
        for(int rows=1;rows<=n;rows++)
        {
            for(int cols=1;cols<=n;cols++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
