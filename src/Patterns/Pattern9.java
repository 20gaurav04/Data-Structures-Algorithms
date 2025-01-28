package Patterns;
import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        int n = sc.nextInt();

        for(int rows = n ; rows>=1 ; rows--)
        {
            for(int cols = 1 ; cols<=rows ; cols++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int rows = 2; rows<=n ; rows++)
        {
            for(int cols = 1 ; cols<=rows ; cols++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
