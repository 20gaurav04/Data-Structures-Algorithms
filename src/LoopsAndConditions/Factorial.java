package LoopsAndConditions;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        System.out.println("Enter the val:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int fact = 1;
        if(x == 0 || x==1)
        {
            System.out.print("The factorial of"+" "+x+"is :1");
        }
        else{
            for(int i=1;i<=x;i++)
            {
                fact = fact*i;

            }
        }
        System.out.print("the fact is"+fact);
    }
}