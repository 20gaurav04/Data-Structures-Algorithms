package LoopsAndConditions;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        int ans;

        while(true) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter the operator: ");
            char c = sc.next().charAt(0);

            if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%')
            {
                System.out.print("Enter an integer: ");
                int a = sc.nextInt();
                System.out.print("Enter an integer: ");
                int b = sc.nextInt();
                if(c == '+')
                {
                    ans = a+b;
                    System.out.println(ans);
                }
                if(c == '-')
                {
                    ans = a-b;
                    System.out.println(ans);
                }
                if(c == '*')
                {
                    ans = a*b;
                    System.out.println(ans);
                }
                if(c == '/')
                {
                    if (b == 0) {
                        System.out.println("Division by zero");
                    }
                    else {
                        ans = a / b;
                        System.out.println(ans);
                    }
                }
                if(c == '%')
                {
                    ans = a%b;
                    System.out.println(ans);
                }
            }
            else if (c == 'x' || c == 'X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid operator");
            }
        }
    }
}