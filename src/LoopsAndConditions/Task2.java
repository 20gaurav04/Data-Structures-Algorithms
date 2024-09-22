package LoopsAndConditions;

import java.util.Scanner;

public class Task2
{
    public static void main(String [] args)
    {
        System.out.print("enter the value:");
        Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int storeX = x;
        while(x!=0)
        {
            System.out.print("enter the value:");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            storeX=x+storeX;
            if(x==0)
            {
                System.out.print("the sum of ur values are :"+ " "+storeX);
            }

        }
    }
}