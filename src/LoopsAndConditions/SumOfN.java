package LoopsAndConditions;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        int count = 10;

        int sum=0;
        for(int i=0;i<count;i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            sum+=number;
        }
        System.out.println("LoopingStatements.Basics.Sum of 10 numbers entered :"+" "+ sum);
    }
}