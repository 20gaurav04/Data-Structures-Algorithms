

import java.util.Scanner;

public class Palindrome
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int x = sc.nextInt();
        int store = x;
        int rev=0;

        while(store>0)
        {
            int rem = x%10;
            store/=10;
            rev=rev*10+rem;

        }
        if(rev==x)
        {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
    }
}