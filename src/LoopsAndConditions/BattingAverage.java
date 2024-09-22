package LoopsAndConditions;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        int i;
        int average;
        int totalRuns = 0;
        System.out.println("**BATTING AVERAGE**");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of player: ");
        String name = input.nextLine();
        System.out.print("Enter the total innings played: ");
        int innings = input.nextInt();

        for(i=1;i<=innings;i++)
        {
            System.out.print("Enter the runs in the"+" "+ i +" "+"innings:");
            int runs = input.nextInt();
            totalRuns = totalRuns + runs;
        }
        average=(totalRuns/innings);
        System.out.println("The batsman is : "+name);
        System.out.println("The average is: "+average);
    }
}