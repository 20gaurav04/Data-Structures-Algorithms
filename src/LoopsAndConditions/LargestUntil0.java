package LoopsAndConditions;

import java.util.Scanner;

public class LargestUntil0
{
    public static void main(String [] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the value:");
     int x = sc.nextInt();
     int largest = x;


         while(x!=0)
         {
             Scanner in = new Scanner(System.in);
             System.out.print("enter another value");
             x = in.nextInt();

             if(x>largest)
             {
                 largest = x;
             }
         }
         System.out.print("Program ended largest was"+" "+largest);

    }
}