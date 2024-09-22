package Basics;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1 = input.nextInt();
        System.out.print("Enter the second number:");
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("LoopingStatements.Basics.Sum = " + sum);
    }
}
