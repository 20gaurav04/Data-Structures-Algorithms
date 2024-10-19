package LoopsAndConditions;
import java.util.Scanner;

public class    hfcAndlcm
{
    public static void main(String[] args) {
        int i,n1,n2,hcf=0,lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        n1 = sc.nextInt();
        System.out.println("Enter the second number");
        n2 = sc.nextInt();

         for(i = 1; i <= n1|| i <= n2; i++) {
                if( n1%i == 0 && n2%i == 0 )
                    hcf = i;
         }
         System.out.println("The hcf of two numbers is "+hcf);
         lcm = (n1*n2)/hcf;
         System.out.println("The lcm of two numbers is "+lcm);
    }

}
