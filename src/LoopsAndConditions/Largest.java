package LoopsAndConditions;

import java.util.Scanner;
public class Largest
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a = sc.nextInt();
        System.out.print("Enter the value of b :");
        int b = sc.nextInt();
        System.out.print("Enter the value of c:");
        int c = sc.nextInt();

        int great= Math.max(c,Math.max(a,b));
        System.out.print("greatest"+" "+great);
    }

}