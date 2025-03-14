package LoopsAndConditions;
import java.util.Scanner;
public class CountNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        long a = sc.nextLong();

        int count = 0;
        while(a>0) {
            long rem = a%10;
            if (rem == 7) {
                count++;
            }
            a = a / 10;
        }
        System.out.print("Number of times 7 appeared : "+count);



    }
}